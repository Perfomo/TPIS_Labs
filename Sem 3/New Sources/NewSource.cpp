#include <iostream>
#include <string>
#include <math.h>
using namespace std;
#include "NewSource.h"

#include <termios.h>
#include <unistd.h>
int _getch()
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

int Valid_int(bool *&ok, string str)
{
    bool minus = false;
    int res = 0, len, pos = 0, ch_int;
    len = str.length();
    if(str[0] == '-')
    {
        pos++;
        minus = true;
    }
    for(pos; pos < len; pos++)
    {
        ch_int = int(str[pos]);
        if(ch_int >= 48 and ch_int <= 57)
        {
            res = res + (ch_int - 48) * pow(10, len - (pos + 1));
        }
        else
        {
            *ok = false;
            return 1;
        }
    }
    if(minus)
    {
        res *= -1;
    }
    return res;
}

int InputInt(string text)
{
    string str;
    bool* ok = new bool(true);
    int res;
    while (true)
    {
        cout << text;
        cin >> str;
        res = Valid_int(ok, str);
        if(*ok)
        {
            return res;
        }
        else
        {
            cout << "\nBad input..." << endl;
            *ok = true;
        }
    }
}

// int InputInt() 
// {
//     bool* ok = new bool(true);
//     int res;
//     while (true)
//     {
//         res = Valid_int(ok);
//         if(*ok)
//         {
//             return res;
//         }
//         else
//         {
//             cout << "Bad input..." << endl;
//             *ok = true;
//         }
//     }
// }
