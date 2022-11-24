#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "ships.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    form = new Form;
    info = "";
    connect(this, SIGNAL(signal(QString)), form, SLOT(slot(QString)));
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    bool ok1, ok2;
    double res_speed, distance;
    Ships_travel ship(ui);
    res_speed = ship.get_res_speed(ok1, ok2);
    if(!ok1)
    {
        ui -> lineEdit -> setText("Error");
        ui -> label_5 -> setText("Error");
    }
    if(!ok2)
    {
        ui -> lineEdit_2 -> setText("Error");
        ui -> label_5 -> setText("Error");
    }
    if(ok1 and ok2)
    {
        ui -> label_5 -> setText(QString::number(res_speed));
        info = ship.get_info();
        if(ui -> lineEdit_3 -> text() != "Time")
        {
            distance = ship.get_distance(ok2);
            if(ok2)
            {
                ui -> label_4 -> setText(QString::number(distance));
            }
            else
            {
                ui -> lineEdit_3 -> setText("Error");
                ui -> label_4 -> setText("Error");
            }
        }
        else
        {
            ui -> label_4 -> setText("Distance:");
        }
    }
    else
    {
        if(ui -> lineEdit_3 -> text() != "Time")
        {
            ui -> lineEdit_3 -> text().toDouble(&ok2);
            if(!ok2)
            {
                ui -> lineEdit_3 -> setText("Error");
            }
            ui -> label_4 -> setText("Error");
        }
        else
        {
            ui -> label_4 -> setText("Distance:");
        }
    }
}


void MainWindow::on_pushButton_2_clicked()
{
    if(info == "")
    {
        emit signal("Last information about ships, that was successfully used:\nOops, nothing here...");
    }
    else
    {
        emit signal("Last information about ships, that was successfully used:\n" + info);
    }
    form -> show();
}

