#include <iostream>
#include <stdlib.h>
#include <string>
// #include "../Sources/Source1.h"
using namespace std;

#include <termios.h>
#include <unistd.h>
int _getch(void)
{
	struct termios oldattr, newattr;
	int ch;

	tcgetattr(STDIN_FILENO, &oldattr);
	newattr = oldattr;
	newattr.c_lflag &= ~(ICANON | ECHO);
	tcsetattr(STDIN_FILENO, TCSANOW, &newattr);
	ch = getchar();
	tcsetattr(STDIN_FILENO, TCSANOW, &oldattr);
	return ch;
}


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
    cout << "Input hero id: " << endl;
    cin >> this->ID;
    this->size = len;
    this->arr = (Inventory*)calloc(len,sizeof(Inventory));    //memory allocation for array
    // this->arr = new Inventory[len];
    srand(time(NULL));    //initialize random seed
    for(int i = 0; i < len; i++)    //assign values and print them
    {
        this->arr[i].weight = rand() % 100 + 1;
        cout << "\n" <<  i << ":" << endl;
        cout << "Input name:" << endl;
        cin >> k;
        arr[i].name = k;
        cout << "Input ID:" << endl;
        cin >> arr[i].ID;
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
        cout << "Input amount of items: " << endl;
        cin >> size;
        Inventory Keqing(size);
        cout << "------------------" << "Results: " << endl;
        Keqing.run();    //method run call
        cout << "\nOne more iteration?" << "\n1 - yes\nelse - exit" << endl;
        cin.ignore();
        if(_getch() == '1')
        {
            continue;
        }
        else
        {
            break;
        }
    }
    return 0;
}
