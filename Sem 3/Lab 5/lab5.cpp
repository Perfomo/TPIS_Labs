#include <iostream>
using namespace std;

class Server_Answer
{
private:
    string str;
public:
    void operator=(Server_Answer &obj);
    void run();
    Server_Answer();
    Server_Answer(bool ok);
    ~Server_Answer();
};

Server_Answer::Server_Answer()
{
    cout << "Input string: " << endl;
    cin >> this -> str;
}

Server_Answer::Server_Answer(bool ok)
{
    this -> str = "";
}

Server_Answer::~Server_Answer()
{
    cout << "\n-_-" << endl;
}

void Server_Answer::operator=(Server_Answer &obj)
{
    string str = obj.str;
    int len = str.length(), ch;
    for(int i = 0; i < len; i++)
    {
        ch = int(str[i]);
        if(ch <= 90 and ch >= 65)
        {
            continue;
        }
        else
        {
            this -> str += str[i];
        }
    }
}

void Server_Answer::run()
{
    cout << this -> str << endl;
}

int main()
{
    Server_Answer obj1, obj2(true);
    obj2 = obj1;
    cout << "\nObj1 string: " << endl;
    obj1.run();
    cout << "\nObj2 string: " << endl;
    obj2.run();
    return 0;
}