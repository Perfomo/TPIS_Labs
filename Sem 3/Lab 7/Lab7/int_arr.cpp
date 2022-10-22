#include "int_arr.h"

Int_arr::Int_arr(int size_)
{
    size = size_;
    arr = new int[size];
    ready = 0;
}

Int_arr::~Int_arr()
{
    qDebug() << "-_-";
    delete[] arr;
}

QString Int_arr::print()
{
    double res = 0;
    for(int i = 0; i < size; i++)
    {
        res += arr[i];
    }
    return "Mean value of array elements: " + QString::number(res / size);
}

void Int_arr::add_num(int num)
{
    this -> arr[ready] = num;
    ready++;
}

bool Int_arr::is_ready()
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

