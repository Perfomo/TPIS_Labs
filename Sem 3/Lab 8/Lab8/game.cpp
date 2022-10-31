#include "game.h"
#include <QWidget>

Game::Game(int num)
{
    this -> number = num;
}

Game::~Game()
{
    qDebug() << "-_-";
}

bool Game::is_win(int num)
{
    if(num == this -> number)
    {
        return true;
    }
    return false;
}
