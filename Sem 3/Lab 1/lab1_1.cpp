#include <iostream>
#include "../Sources/Source1.h"

using namespace std;

class Player    // class declartion
{
    // fields and methods of the class
    int hp, magic_power, stamina;   // hp, magic power and stamina declaration  
public:
    double total();    // method total() declaration
    void input(int x, int y, int z)    // realization of the input() and show() methods
    {
        hp = x;    //assigning class variables
        magic_power = y;
        stamina = z;
    }
    void show()   
    {
        cout << "Current HP: " << hp << endl;   // printing info

        cout << "Current magic power: " << magic_power << endl;

        cout << "Current stamina: "<< stamina << endl;

        total();    // method total() call
    }
};

double Player::total()    // realization of the total() method
{
    bool ok = false;
    double result;
    if(hp == 0)    // hp varification 
    {
        cout << "\nError HP = 0..." << endl;
        ok = true;
    }
    if(magic_power == 0)    // magic power varification
    {
        cout << "\nError magic power = 0..." << endl;
        ok = true;
    }
    if(stamina == 0)    // stamina varification
    {
        cout << "\nError stamina = 0..." << endl;
        return 1;
    }
    if(ok)    // Error return
    {
        return 1;
    }
    result = (hp * magic_power) / (double)stamina + (hp * stamina) / (double)magic_power - (stamina * magic_power) / (double)hp;    // calculating the result   //(1/2 = 0), (double) make 1/2.0 = 0.5
    cout << "Coolness is: " << result << endl;    // printing the result 
    return result;
}

int main()
{
    Player hero, *ptr;    // some declorations
    bool ok = false;
    int hp, magic_power, stamina;

    while(true)    // while loop for functionality 
    {
        cout << "\n--------------------------" << endl;    // printing menu 
        cout << "1 - Input" << "\n2 - Show results" << "\n3 - Exit" << endl;
        cout << "--------------------------" << endl;

        switch (_getch())   // menu functionality
        {
            case '1':
                cout << "\nInput start amount of HP: " << endl;    // input values
                hp = InputInt(">=0");

                cout << "\nInput amount of magic power: " << endl;
                magic_power = InputInt(">=0");

                cout << "\nInput value of stamina: " << endl;
                stamina = InputInt(">=0");
            
                hero.input(hp, magic_power, stamina);   // method input() call
                ok = true;
                break;
            
            case '2':
                if(!ok)    // first input validation
                {
                    cout << "\nMake some input at first..." << endl;
                    break;
                }

                ptr = &hero;    // rearrange the pointer

                cout << "\nResults with direct contact method:" << endl;
                hero.show();    // method show() call

                cout << "\n\nResults with indirect contact method:" << endl;
                ptr -> show();    // method show() call
                break;

            case '3':
                cout << "\nHave a nice day!!!" << endl;    // exit message
                return 0;

            default:    // menu validation
                cout << "\nBad input..." << endl;
                break;
        }
    }
    return 1;
}