#include <iostream>
#include <stdlib.h>
// #include "../Sources/Source1.h"
#include "../New Sources/NewSource.h"
using namespace std;

class Inventory    // class declartion
{
    // fields and methods of the class
    int ID, size;    //ID and size declaration   
    Inventory *arr;    //ptr for array declaration 
public:
    Inventory(int len);    //constructor declaration (with parameters)    
    ~Inventory();    //destructor declaration
    void run();    // method run() declaration
};

Inventory::Inventory(int len)    //constructor realization
{
    this->ID = -1;
    this->size = len;
    arr = (Inventory*)calloc(len,sizeof(Inventory));    //memory allocation for array
    // this->arr = new Inventory[len];
    srand(time(NULL));    //initialize random seed
    for(int i = 0; i < len; i++)    //assign values and print them
    {
        this->arr[i].ID = rand() % 100001;
        cout << i << ":" << this->arr[i].ID << endl;
    }
}

Inventory::~Inventory()    //destructor realization
{
    delete(ID, size, arr);
}

void Inventory::run()
{
    int am = 0;
    for(int i = 0; i < this->size; i++)    //count odds
    {
        if(this->arr[i].ID % 2 != 0)
        {
            am++;
        }
    }
    cout << "Number of odd IDs: " << am <<endl;    //print amount of odds
}

int main()
{
    int size;
    cout << "Size(>2): " << endl;
    while(true)
    {
        size = InputInt();
        if(size > 2)
        {
            break;
        }
        cout << "Bad number... Size must be more that 2..." << endl;
    }
    cout << endl;
    Inventory Keqing(size);
    Keqing.run();    //method run call
    return 0;
}
