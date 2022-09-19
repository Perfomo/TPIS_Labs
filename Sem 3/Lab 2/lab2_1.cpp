#include <iostream>
#include "../Sources/Source1.h"

using namespace std;

class Player    // class declartion
{
    // fields and methods of the class
    int *hp, *magic_power, *stamina;   // hp, magic power and stamina declaration 
    double *magic_damage, *physical_damage; // magic damage, physical damage declaration
public:
    int total(), total2();    // methods total and total2 declaration
    Player();    //constructor declaration (without parameters)
    Player(int hp_, int magic_power_, int stamina_, double magic_damage_, double physical_damage_);    //constructor declaration (with parameters)
    ~Player();    //destructor declaration
    void set(int hp_, int magic_power_, int stamina_, double magic_damage_, double physical_damage_);    //declaration of the set() method

    void show()    // show() realization
    {
        cout << "Current HP: " << *hp << endl;   // printing info

        cout << "Current magic power: " << *magic_power << endl;

        cout << "Current stamina: "<< *stamina << endl;

        cout << "Current magic damage: " << *magic_damage << endl;

        cout << "Current physical damage: " << *physical_damage << endl;

        total();    // total() method call
        total2();   // total2() method call 
    }
};

void Player::set(int hp_, int magic_power_, int stamina_, double magic_damage_, double physical_damage_)    // realization of the set() method
{
    *hp = hp_;    //assihning class variables
    *magic_power = magic_power_;
    *stamina = stamina_;
    *magic_damage = magic_damage_;
    *physical_damage = physical_damage_;
}

Player::Player()    //constructor realization (without parameters)
{
    hp = new int(1);    //assihning class variables
    magic_power = new int(1);
    stamina = new int(1);
    magic_damage = new double(1.);
    physical_damage = new double(1.);
}

Player::Player(int hp_, int magic_power_, int stamina_, double magic_damage_, double physical_damage_)    //constructor realization (with parameters)
{
    hp = new int(hp_);    //assihning class variables
    magic_power = new int(magic_power_);    //memory allocation for a variable
    stamina = new int(stamina_);
    magic_damage = new double(magic_damage_);
    physical_damage = new double(physical_damage_);
}

Player::~Player()    //destructor realization
{
    delete(hp, magic_power, stamina, magic_damage, physical_damage);    //releasing memory
    cout << "Deleted!" << endl;
}

int Player::total()    // realization of the total() method
{
    bool ok = false;
    double result_1;
    if(*hp == 0)    // hp varification 
    {
        cout << "\nError HP = 0..." << endl;
        ok = true;
    }
    if(*magic_power == 0)    // magic power varification
    {
        cout << "\nError magic power = 0..." << endl;
        ok = true;
    }
    if(*stamina == 0)    // stamina varification
    {
        cout << "\nError stamina = 0..." << endl;
        return 1;
    }
    if(ok)
    {
        return 1;
    }
    result_1 = (*hp * *magic_power) / (double)*stamina + (*hp * *stamina) / (double)*magic_power - (*stamina * *magic_power) / (double)*hp;    // calculating the result   //(1/2 = 0), (double) make 1/2.0 = 0.5
    cout << "Coolness is: " << result_1 << endl;    // printing the result 
    return 0;
}

int Player::total2()
{
    cout << "\nFinal magic damage: " << (*magic_damage * *magic_power) - *stamina << endl;
    cout << "Final physical damage: " << (*physical_damage * *stamina + *hp) - *magic_power << endl;
    return 0;
}

int main()
{
    Player hero, hell_hero(6, 6, 6, 6, 6), lucky_hero(3, 3, 3, 3, 3), *ptr;    // some declorations
    int hp, magic_power, stamina;
    double magic_damage, physical_damage;

    while(true)    // while loop for functionality 
    {
        cout << "\n--------------------------" << endl;    // printing menu 
        cout << "1 - Input" << "\n2 - Show results" << "\n3 - Hero templates" <<"\n4 - Exit" << endl;
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

                cout << "\nInput magic damage amount: " << endl;
                magic_damage = InputDouble(">=0");

                cout << "\nInput physical damage amount: " << endl;
                physical_damage = InputDouble(">=0"); 
            
                hero.set(hp, magic_power, stamina, magic_damage, physical_damage);   // method input() call
                break;
            
            case '2':

                ptr = &hero;    // rearrange the pointer

                cout << "\nResults with direct contact method:" << endl;
                hero.show();    // method show() call

                cout << "\n\nResults with indirect contact method:" << endl;
                ptr -> show();    // method show() call

                break;

            case '3':

                cout << "\nHere you can see some hero templates..." << endl;
                cout << "\nHero from the hell: " << endl;
                hell_hero.show();
                cout << "\nLucky hero: " << endl;
                lucky_hero.show();
                break;

            case '4':
                cout << "\nHave a nice day!!!" << endl;    // exit message
                return 0;

            default:    // menu validation
                cout << "\nBad input..." << endl;
                break;
        }
    }
    return 1;
}