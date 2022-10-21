#include <iostream>
#include "../New Sources/NewSource.h"
#include "../Sources/Source1.h"

using namespace std;

template <class T>
class Array
{
private:
    T *arr;
    int size;
public:
    Array(int size);
    ~Array()
    {
        cout << "\nDeleted\tUwU" << endl;
        delete[] arr;
    }
    void print();
};

template<>
void Array<string>::print()
{
    cout << "First element of array:\t " << arr[0] << endl;
    cout << "Last element of array:\t" << arr[size - 1] << endl; 
}

template<>
void Array<int>::print()
{
    double res = 0;
    for(int i = 0; i < size; i++)
    {
        res += arr[i];
    }
    cout << "Mean value of array elements:\t" << res / size << endl;
}

template<>
void Array<double>::print()
{
    double res = 0;
    for(int i = 0; i < size; i++)
    {
        res += arr[i];
    }
    cout << "Sum of array elemnts:\t" << res << endl;
}

template <>
Array<string>::Array(int size_)
{
    size = size_;
    arr = new string[size];
    cout << "\nInput your strings: ";
    for(int i = 0; i < size; i++)
    {
        cout << "\n" << i << ": Input: ";
        cin >> arr[i];
    }
    cout << endl;
    cin.ignore();
}

template <>
Array<int>::Array(int size_)
{
    size = size_;
    arr = new int[size];
    cout << "\nInput your numbers: " << endl;
    for(int i = 0; i < size; i++)
    {
        arr[i] = InputInt( "\n" + to_string(i) + ": Input: ");
        cin.ignore();
        // cin >> arr[i];
    }
    cout << endl;
}

template <>
Array<double>::Array(int size_)
{
    size = size_;
    arr = new double[size];
    cout << "\nInput your numbers: " << endl;
    for(int i = 0; i < size; i++)
    {
        cout << "\n" << i << ": Input: ";
        arr[i] = InputDouble("all");
        // cin >> arr[i];
    }
    cout << endl;
}

template <typename T>
int Work_with_array(T type)
{
    int size;
    while(true)
    {
        size = InputInt("\nInput size of the array: ");
        if(size > 0)
        {
            break;
        }
        cout << "Size must be more than 0!" << endl;
    }
    // cout << "\ninput size" << endl;
    // int size;
    // cin >> size;
    if(typeid(T) == typeid(string))
    {
        Array<string>  arr(size);
        cout << "Here your input:" << endl;
        arr.print();
        return 0;
    }
    if(typeid(T) == typeid(int))
    {
        Array<int>  arr(size);
        cout << "Here your input:" << endl;
        arr.print();
        return 0;
    }
    if(typeid(T) == typeid(double))
    {
        Array<double>  arr(size);
        cout << "Here your input:" << endl;
        arr.print();
        return 0;
    }
    cout << "\nError!!!" << endl;
    return 1; 
}

int main()
{
    string ok = "";
    while(true)
    {
        cout << "\nWhat type of array do u want?\n1 - String\n2 - Int\n3 - Double\n4 - exit" << endl;
        switch (_getch())
        {
        case '1':
            Work_with_array(ok);
            break;

        case '2':
            Work_with_array(0);
            break;
        
        case '3':
            Work_with_array(2.5);
            break;

        case '4':
            cout << "\nHave a nice day!!!" << endl;
            return 0;
        
        default:
            cout << "\nBad input..." << endl;
            break;
        }
    }
    return 1;
}