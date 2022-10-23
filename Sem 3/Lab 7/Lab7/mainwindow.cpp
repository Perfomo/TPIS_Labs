#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    form = new Form;
    connect(this, SIGNAL(signal(QString, int)), form, SLOT(slot(QString, int)));
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    bool ok;
    QString k = ui -> lineEdit -> text();
    int size = k.toInt(&ok);
    if(ok and size > 0)
    {
        emit signal("string", size);
        form -> show();
    }
    else
    {
        ui -> lineEdit -> setText("Error");
    }
}

void MainWindow::on_pushButton_2_clicked()
{
    bool ok;
    QString k = ui -> lineEdit -> text();
    int size = k.toInt(&ok);
    if(ok and size > 0)
    {
        emit signal("int", size);
        form -> show();
    }
    else
    {
        ui -> lineEdit -> setText("Error");
    }
}

void MainWindow::on_pushButton_3_clicked()
{
    bool ok;
    QString k = ui -> lineEdit -> text();
    int size = k.toInt(&ok);
    if(ok and size > 0)
    {
        emit signal("double", size);
        form -> show();
    }
    else
    {
        ui -> lineEdit -> setText("Error");
    }
}

