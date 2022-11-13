#include "ui_mainwindow.h"
#include "ships.h"

Ships::Ships(Ui::MainWindow *ui)
{
    this -> first_speed = ui -> lineEdit -> text();
    this -> second_speed = ui -> lineEdit_2 -> text();
}

double Ships::get_res_speed(bool &ok1, bool &ok2)
{
    double res, num;

    num = this -> first_speed.toDouble(&ok1);
    if(num < 0 or num >= 3e8)
    {
        ok1 = false;
    }
    res = num;
    num = this -> second_speed.toDouble(&ok2);
    if(num < 0 or num >= 3e8)
    {
        ok2 = false;
    }
    return res += num;
}

QString Ships::get_info()
{
    return "The speed of the first ship is " + this -> first_speed + " km/h, and the speed of the second is " + this -> second_speed + " km/h.";
}

Ships_travel::Ships_travel(Ui::MainWindow *ui)
    :Ships(ui)
{
    this -> time = ui -> lineEdit_3 -> text();
}

double Ships_travel::get_distance(bool &ok3)
{
    double num;
    num = this -> time.toDouble(&ok3);
    if(num < 0 )
    {
        ok3 = false;
        return 0;
    }
    return (this -> first_speed.toDouble() + this -> second_speed.toDouble()) * num;
}
