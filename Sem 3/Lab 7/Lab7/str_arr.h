#ifndef STR_ARR_H
#define STR_ARR_H

#include <QWidget>

class Str_arr
{
private:
    QString *arr;
    int size;
public:
    int ready;
    Str_arr(int size);
    ~Str_arr();
    QString print();
    void add_string(QString str);
    bool is_ready();
};

#endif // STR_ARR_H
