#include <iostream>
#include <stdlib.h>
// #include "../New Sources/NewSource.h"
#include "../Sources/Source1.h"
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

class Arena
{
private:
    int size;
    int **arr;
public:
    Arena(int x);
    ~Arena();
    friend void run(Arena *obj);
    friend Arena set(Arena *obj);
    friend void view(Arena *obj);
};

Arena::Arena(int x)
{
    srand(time(NULL));
    size = x;
    arr = new int *[size];
    for(int i = 0; i < size; i++)
    {
        arr[i] = new int[size];
        for(int j = 0; j < size; j++)
        {
            arr[i][j] = rand() % 1001;
        }
    }
}

Arena::~Arena()
{
    for(int i = 0; i < size; i++)
    {
        delete arr[i];
    }
    delete[] arr;

    // cout << "Memory is free!!!" << endl;
}

void view(Arena *obj)
{
    int size = obj -> size;
    cout << endl;
    for(int i = 0; i < size; i++)
    {
        for(int j = 0; j < size; j++)
        {
            cout << obj -> arr[i][j] << "\t";
        }
        cout << endl;
    }
}

Arena* set()
{
    int new_size;
    while(true)
    {
        cout << "\nInput field size: " << endl;
        new_size = InputInt("all");
        // cin >> new_size;
        // cin.ignore();
        if(new_size > 1)
        {
            return new Arena(new_size); 
        }
        else
        {
            cout << "Size must be more than 1.." << endl; 
        }
    }
}

void run(Arena *obj)
{
    int **arr = obj -> arr;
    int allies = 0, enemy = 0, size = obj -> size, k;
    for(int i = 0; i < size; i++)
    {
        k = i - 1;
        while(k >= 0)
        {
            enemy += arr[i][k];
            k--;
        }
        for(int j = i + 1; j < size; j++)
        {
            allies += arr[i][j];
        }
    }
    cout << "\nEnemy solders: " << enemy << endl;
    cout << "Allies solders: " << allies << endl;
}

int main()
{
    int size;
    Arena *field;
    while(true)
    {
        cout << "\nInput field size: " << endl;
        size = InputInt("all");
        // cin >> size;
        // cin.ignore();
        if(size > 1)
        {
            field = new Arena(size);
            break; 
        }
        else
        {
            cout << "Size must be more than 1.." << endl; 
        }
    }
    while(true)
    {
        cout << "\n1 - New values\n2 - View field\n3 - Field info\n4 - Exit" << endl;
        switch (_getch())
        {
        case '1':
            field -> ~Arena();
            field = set();
            break;

        case '2':
            view(field);
            break;

        case '3':
            run(field);
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