#include <iostream>
#include <stdlib.h>
#include <string>
// #include "../Sources/Source1.h"
#include "../New Sources/NewSource.h"
using namespace std;

class Inventory    // class declartion
{
    // fields and methods of the class
    string name;
    int ID, size, weight;    //ID and size declaration   
    Inventory *arr;    //ptr for array declaration 
public:
    Inventory(int len);    //constructor declaration (with parameters)    
    ~Inventory();    //destructor declaration
    void run();    // method run() declaration
};

Inventory::Inventory(int len)    //constructor realization
{
    string k;
    this->ID = InputInt("\nInput hero id: ");
    this->size = len;
    this->arr = (Inventory*)calloc(len,sizeof(Inventory));    //memory allocation for array
    // this->arr = new Inventory[len];
    srand(time(NULL));    //initialize random seed
    for(int i = 0; i < len; i++)    //assign values and print them
    {
        this->arr[i].weight = rand() % 101 + 1;
        cout << "\n" <<  i << ":" << endl;
        cout << "Input name:" << endl;
        cin >> k;
        arr[i].name = k;
        arr[i].ID = InputInt("Input ID:");
        cout << "weight: " << arr[i].weight << endl;
    }
}

Inventory::~Inventory()    //destructor realization
{
    delete(ID, size, weight, name, arr);
}

void Inventory::run()
{
    for(int i = 0; i < this->size; i++)    //count odds
    {
        if(this->arr[i].weight > 30 and this->arr[i].weight < 90)
        {
            cout << "\n" <<  i << ":" << endl;
            cout << "ID: " <<this->arr[i].ID << endl;
            cout << "Weight: " << this->arr[i].weight << endl;
            cout << "Name: " << this->arr[i].name << endl;
        }
    }
}

int main()
{
    bool t = false;
    int size;
    while(true)
    {
        t = true;
        while(true)
        {
            size = InputInt("\nInput amount of items: ");
            if(size > 2)
            {
                break;
            }
            cout << "Bad number... Size must be more that 2..." << endl;
        }
        Inventory Keqing(size);
        cout << "\n------------------" << "Results: " << endl;
        Keqing.run();    //method run call
        cout << "\nOne more iteration?" << "\n1 - yes\nelse - exit\n" << endl;
        cin.ignore();
        if(_getch() == '1')
        {
            continue;
        }
        else
        {
            cout << "Have a nice day!!!" << endl;
            break;
        }
    }
    return 0;
}
