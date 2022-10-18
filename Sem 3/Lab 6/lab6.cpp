#include <iostream>

using namespace std;

class Monsters
{
protected:
    int HP, damage, armour;

public:
    Monsters(int HP, int damage, int armour);
    ~Monsters();
    virtual const void PrintInfo()
    {
        cout << "Monster HP: " <<this -> HP << endl;
        cout << "Monster damage: " <<this -> damage << endl;
        cout << "Monster armour: " <<this -> armour << endl;
    }
    virtual const void Scream()
    {
        cout << "Monster said:" << endl;
    }
};
Monsters::Monsters(int HP, int damage, int armour)
    :HP(HP), damage(damage), armour(armour)
{
}
Monsters::~Monsters()
{
    cout << "-_-" << endl;
}

class WindowsUser :public Monsters
{
private:
    int k;

public:
    WindowsUser(int HP_, int damage_, int armour_);
    ~WindowsUser();
    virtual const void PrintInfo()
    {
        cout << "Monster HP: " << HP * k << endl;
        cout << "Monster damage: " << damage * k << endl;
        cout << "Monster armour: " << armour * k << endl;
    }
    virtual const void Scream()
    {
        cout << "Monster said: Windows top" << endl;
    }
};

WindowsUser::WindowsUser(int HP_, int damage_, int armour_)
    :Monsters(HP_, damage_, armour_)
{
    k = 3;
}

WindowsUser::~WindowsUser()
{
    cout << "*_*" << endl;
}


class Ork :public Monsters
{
private:
    int k;

public:
    Ork(int HP_, int damage_, int armour_);
    ~Ork();
    virtual const void PrintInfo()
    {
        cout << "Monster HP: " << HP * k << endl;
        cout << "Monster damage: " << damage * k << endl;
        cout << "Monster armour: " << armour * k << endl;
    }
    virtual const void Scream()
    {
        cout << "Monster said: Im going to raid you!" << endl;
    }
};

Ork::Ork(int HP_, int damage_, int armour_)
    :Monsters(HP_, damage_, armour_)
{
    k = 5;
}

Ork::~Ork()
{
    cout << "+_+" << endl;
}

class Pony :public Monsters
{
private:
    int k;

public:
    Pony(int HP_, int damage_, int armour_);
    ~Pony();
    virtual const void PrintInfo()
    {
        cout << "Monster HP: " << HP * k << endl;
        cout << "Monster damage: " << damage * k << endl;
        cout << "Monster armour: " << armour * k << endl;
    }
    virtual const void Scream()
    {
        cout << "Monster said: Friendship is magic!" << endl;
    }
};

Pony::Pony(int HP_, int damage_, int armour_)
    :Monsters(HP_, damage_, armour_)
{
    k = 9;
}

Pony::~Pony()
{
    cout << "&_&" << endl;
}

void say(Monsters &monster)
{
    monster.Scream();
}

int main()
{
    WindowsUser b(1, 1, 1);
    b.PrintInfo();
    say(b);
    cout << endl;
    Ork t(1, 1, 1);
    t.PrintInfo();
    say(t);
    cout << endl;
    Pony s(1,1,1);
    s.PrintInfo();
    say(s);
    return 0;
}