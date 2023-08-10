package ru.alexeykedr;

public abstract class GameLogic {
    public abstract void move(char[] field, String typeField);

    public static boolean isWin(char[] field) {

        if (field[0] != '\u0000' && field[0] == field[1] && field[1] == field[2])
            return true;

        if (field[3] != '\u0000'&& field[3] == field[4] && field[4] == field[5])
            return true;

        if (field[6] != '\u0000' &&field[6] == field[7] && field[7] == field[8])
            return true;

        if (field[0] != '\u0000' && field[0] == field[3] && field[3] == field[6])
            return true;

        if (field[1] != '\u0000' && field[1] == field[4] && field[4] == field[7])
            return true;

        if (field[2] != '\u0000' && field[2] == field[5] && field[5] == field[8])
            return true;

        if (field[0] != '\u0000' && field[0] == field[4] && field[4] == field[8])
            return true;

        if (field[2] != '\u0000' && field[2] == field[4] && field[4] == field[6])
            return true;

        return false;
    }


}
