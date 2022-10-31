#include "form.h"
#include "ui_form.h"

Form::Form(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Form)
{
    ui->setupUi(this);
    obj = nullptr;
}

Form::~Form()
{
    obj -> ~Game();
    delete ui;
}

void Form::on_pushButton_clicked()
{
    bool ok;
    int num;
    num = ui -> lineEdit -> text().toInt(&ok);
    if(ok and num >=0 and num <= 100)
    {
        if(ui -> label -> text()[0] == 'P')
        {
            obj = new Game(num);
            ui -> label -> setText("Child, pls input this number: ");
            ui -> label_2 -> setText(QString::number(num));
            ui -> lineEdit -> setText("");
        }
        else
        {
            if(obj -> is_win(num))
            {
                QMessageBox::information(this, "Info" ,"You are win!!!");
                ui -> label -> setText("Parents, input ur number:");
                ui -> lineEdit -> setText("");
                ui -> label_2 -> setText("");
                this -> close();
            }
            else
            {
                QMessageBox::information(this, "Info" , "Oups, you are not right... Try one more time!");
            }
        }
    }
    else
    {
        QMessageBox::critical(this, "Oups" ,"Your input is wrong!!!\nYour numbers must be [0, 100]");
    }
}

