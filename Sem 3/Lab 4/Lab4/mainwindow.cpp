#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    ui->label->setVisible(true);
    ui -> label_2 -> setVisible(true);
    ui -> checkBox -> setChecked(true);
    ui -> checkBox_2 -> setChecked(true);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_checkBox_clicked(bool checked)
{
    if(checked)
    {
        ui->label->setVisible(true);
    }
    else
    {
        ui->label->setVisible(false);
    }
}


void MainWindow::on_checkBox_2_clicked(bool checked)
{
    if(checked)
    {
        ui->label_2->setVisible(true);
    }
    else
    {
        ui->label_2->setVisible(false);
    }
}

