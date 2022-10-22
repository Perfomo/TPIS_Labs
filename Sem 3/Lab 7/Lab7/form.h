#ifndef FORM_H
#define FORM_H

#include "str_arr.h"
#include "int_arr.h"
#include "dbl_arr.h"
#include <QWidget>

namespace Ui {
class Form;
}

class Form : public QWidget
{
    Q_OBJECT

public:
    explicit Form(QWidget *parent = nullptr);
    ~Form();

private:
    Ui::Form *ui;
    Str_arr *obj_str;
    Int_arr *obj_int;
    Dbl_arr *obj_dbl;

public slots:
    void slot(QString i, int size);
private slots:
    void on_pushButton_clicked();
};

#endif // FORM_H
