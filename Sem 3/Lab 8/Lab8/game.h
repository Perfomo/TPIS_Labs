#ifndef GAME_H
#define GAME_H


class Game
{
private:
    int number;
public:
    Game(int num);
    ~Game();
    bool is_win(int num);
};

#endif // GAME_H
