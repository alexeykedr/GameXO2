package ru.alexeykedr;

public interface GameLogic {
    public void move(char[] field, int place);

    public boolean isWin(char[] field);


}
