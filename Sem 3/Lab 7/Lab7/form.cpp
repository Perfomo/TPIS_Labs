#include "form.h"
#include "str_arr.h"
#include "int_arr.h"
#include "dbl_arr.h"
#include "ui_form.h"

Form::Form(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Form)
{
    ui->setupUi(this);
    obj_str = nullptr;
    obj_int = nullptr;
    obj_dbl = nullptr;
}

Form::~Form()
{
    obj_str -> ~Str_arr();
    delete ui;
}

void Form::slot(QString i, int size)
{
    if(i == "string")
    {
        obj_str = new Str_arr(size);
        ui -> label -> setText("0: Input string:");
    }
    if(i == "int")
    {
        obj_int= new Int_arr(size);
        ui -> label -> setText("0: Input string:");
    }
    if(i == "double")
    {
        obj_dbl= new Dbl_arr(size);
        ui -> label -> setText("0: Input string:");
    }
}

void Form::on_pushButton_clicked()
{
    bool ok;
    QString k;
    int i;
    double s;
    if(obj_str)
    {
        obj_str -> add_string(ui -> lineEdit -> text());
        if(obj_str -> is_ready())
        {
            ui -> textBrowser -> setText(obj_str -> print());
            ui -> label -> setText("Ready");
            obj_str = nullptr;
        }
        else
        {
            ui -> label -> setText(QString::number(obj_str -> ready) + ": Input string:");
        }
    }
    if(obj_int)
    {
        k = ui -> lineEdit -> text();
        i = k.toInt(&ok);
        if(ok)
        {
            obj_int -> add_num(i);
            if(obj_int -> is_ready())
            {
                ui -> textBrowser -> setText(obj_int -> print());
                ui -> label -> setText("Ready");
                obj_int = nullptr;
            }
            else
            {
                ui -> label -> setText(QString::number(obj_int -> ready) + ": Input int:");
            }
        }
        else
        {
            ui -> label -> setText(QString::number(obj_int -> ready) + ": Input Error...");
        }
    }
    if(obj_dbl)
    {
        k = ui -> lineEdit -> text();
        s = k.toDouble(&ok);
        if(ok)
        {
            obj_dbl -> add_num(s);
            if(obj_dbl -> is_ready())
            {
                ui -> textBrowser -> setText(obj_dbl -> print());
                ui -> label -> setText("Ready");
                obj_dbl = nullptr;
            }
            else
            {
                ui -> label -> setText(QString::number(obj_dbl -> ready) + ": Input double:");
            }
        }
        else
        {
            ui -> label -> setText(QString::number(obj_dbl -> ready) + ": Input Error...");
        }
    }
}

