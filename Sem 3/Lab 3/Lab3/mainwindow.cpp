#include "mainwindow.h"
#include "ui_mainwindow.h"
MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    form = new Form;
    connect(this, SIGNAL(signal(QString)), form, SLOT(slot(QString)));
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()
{
    bool ok1, ok2;
    QString k = ui->lineEdit->text(), i = ui->lineEdit_2->text();
    int t = k.toInt(&ok1), z = i.toInt(&ok2);
    if (ok1 and ok2 and t >=0 and z >= 0)
    {
        t += z;
        k = QString::number(t);
        emit signal(k);
    }
    else
    {
        emit signal("Bad input...");
    }
    form->show();
}
