#include "dbl_arr.h"

Dbl_arr::Dbl_arr(int size_)
{
    size = size_;
    arr = new double[size];
    ready = 0;
}

Dbl_arr::~Dbl_arr()
{
    qDebug() << "-_-";
    delete[] arr;
}

QString Dbl_arr::print()
{
    double res = 0;
    for(int i = 0; i < size; i++)
    {
        res += arr[i];
    }
    return "Sum of array elemnts: " + QString::number(res);
}

void Dbl_arr::add_num(double num)
{
    this -> arr[ready] = num;
    ready++;
}

bool Dbl_arr::is_ready()
{
    if(this -> size == this -> ready)
    {
        return true;
    }
    else
    {
        return false;
    }
}

