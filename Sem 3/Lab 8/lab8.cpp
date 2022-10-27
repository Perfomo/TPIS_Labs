#include <iostream>
#include "../New Sources/NewSource.h"

using namespace std;

class Game
{
public:
    int number;
    Game(int num);
    ~Game();
    bool check(int num);
};

Game::Game(int num)
{
    number = num;
}

Game::~Game()
{
    cout << "-_-" << endl;
}

bool Game::check(int num)
{
    if(this -> number == num)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int num;
    Game *obj;
    while(true)
    {
        cout << "1 - Play\n2 - Exit" << endl;
        switch (_getch())
        {
        case '1':
            while(true)
            {
                num = InputInt("\nParents, input ur number: ");
                try
                {
                    if(num >= 0 and num <= 100)
                    {
                        break;
                    }
                    throw -1;
                }
                catch(int)
                {
                    cout << "Oups, ur number must be [0, 100]" << endl;
                }
            }
            obj = new Game(num);
            cout << "\nOk, now childrens!" << endl;
            while(true)
            {
                while(true)
                {
                    num = InputInt("\nChild, pls try to input this number: " + to_string(obj -> number) + "\t");
                    try
                    {
                        if(num >= 0 and num <= 100)
                        {
                            break;
                        }
                        throw -1;
                    }
                    catch(int)
                    {
                        cout << "Oups, ur number must be [0, 100]" << endl;
                    }
                }
                if(obj -> check(num))
                {
                    cout << "\nCongratulations! You are right!!!\n" << endl;
                    cin.ignore();
                    break;
                }
                else
                {
                    cout << "Oups, you are not right... Try one more time!" << endl; 
                }
            }
            break;

        case '2':
            cout << "\nHave a nice day!!!" << endl;
            return 0;
        
        default:
            cout << "\nBad input...\n" << endl;
            break;
        }
    }
    return 1;
}