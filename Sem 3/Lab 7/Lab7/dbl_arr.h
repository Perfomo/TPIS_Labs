#ifndef DBL_ARR_H
#define DBL_ARR_H

#include <QWidget>

class Dbl_arr
{
private:
    double *arr;
    int size;
public:
    int ready;
    Dbl_arr(int size);
    ~Dbl_arr();
    QString print();
    void add_num(double num);
    bool is_ready();
};

#endif // DBL_ARR_H
