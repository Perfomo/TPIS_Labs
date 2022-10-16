#ifndef SHIPS_H
#define SHIPS_H

#include "ui_mainwindow.h"
#include <QMainWindow>

class Ships
{
protected:
    QString first_speed;
    QString second_speed;
public:
    Ships(Ui::MainWindow *ui);
    QString get_info();
    double get_res_speed(bool &ok1, bool &ok2);
};

class Ships_travel :public Ships
{
private:
    QString time;
public:
    Ships_travel(Ui::MainWindow *ui);
    double get_distance(bool &ok3);
};

#endif // SHIPS_H
