#include "server.h"
Server::Server()
{
    if(this -> listen(QHostAddress::Any, 2323))
    {
        qDebug() << "Start";
    }
    else
    {
        qDebug() << "Error";
    }
    nextBlockSize = 0;
}

void Server::incomingConnection(qintptr socketDescriptor)
{
    socket = new QTcpSocket;
    socket -> setSocketDescriptor(socketDescriptor);
    connect(socket, &QTcpSocket::readyRead, this, &Server::slotReadyRead);
    connect(socket, &QTcpSocket::disconnected, socket, &QTcpSocket::deleteLater);
    Sockets.push_back(socket);
    qDebug() << "Client connected" << socketDescriptor;
}

void Server::slotReadyRead()
{
    socket = (QTcpSocket*)sender();
    QDataStream in(socket);
    in.setVersion(QDataStream::Qt_6_3);
    if(in.status() == QDataStream::Ok)
    {
        qDebug() << "Ready...";
        for(;;)
        {
            if(nextBlockSize == 0)
            {
                if(socket -> bytesAvailable() < 2)
                {
                    qDebug() << "Data < 2, break";
                    break;
                }
                in >> nextBlockSize;
                qDebug() << "nextblocksize = " << nextBlockSize;
            }
            if(socket -> bytesAvailable() < nextBlockSize)
            {
                qDebug() << "Data not full, break";
                break;
            }
            QString str;
            in >> str;
            nextBlockSize = 0;
            qDebug() << str;
            SendToClient(str);
            break;
        }
    }
    else
    {
        qDebug() << "DataStream error";
    }
}

void Server::SendToClient(QString str)
{
    Data.clear();
    QDataStream out(&Data, QIODevice::WriteOnly);
    out.setVersion(QDataStream::Qt_6_3);
    out << quint16(0) << str;

    out.device() -> seek(0);

    out << quint16(Data.size()-sizeof(quint16));
    for(int i = 0; i < Sockets.size(); i++)
    {
        Sockets[i] -> write(Data);
    }
}
