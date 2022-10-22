#ifndef INT_ARR_H
#define INT_ARR_H

#include <QWidget>

class Int_arr
{
private:
    int *arr;
    int size;
public:
    int ready;
    Int_arr(int size);
    ~Int_arr();
    QString print();
    void add_num(int num);
    bool is_ready();
};

#endif // INT_ARR_H
