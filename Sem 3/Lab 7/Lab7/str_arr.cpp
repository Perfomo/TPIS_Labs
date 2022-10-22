#include "str_arr.h"

Str_arr::Str_arr(int size_)
{
    size = size_;
    arr = new QString[size];
    ready = 0;

}

Str_arr::~Str_arr()
{
    qDebug() << "-_-";
    delete[] arr;
}

QString Str_arr::print()
{
    return  "First element of array: " + arr[0] + "\nLast element of array: " + arr[size - 1];
}

void Str_arr::add_string(QString str)
{
    this -> arr[ready] = str;
    ready++;
}

bool Str_arr::is_ready()
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

