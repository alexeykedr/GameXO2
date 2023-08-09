package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Random;

public class PcUser implements GameLogic {

    Random random = new Random();

    @Override
    public void move(char[] field, int place) {
        String s = "0";

        while (true) {
            int randomNumber = random.nextInt(9);
            String input = Integer.toString(randomNumber + 1);

            if (field[randomNumber] == 'X' || field[randomNumber] == 'O') {
                continue;
            } else {
                field[randomNumber] = s.charAt(0);
                break;
            }
        }
    }


    @Override
    public boolean isWin(char[] field) {
        if (field[0] == field[1] && field[1] == field[2])
            return true;
        if (field[3] == field[4] && field[4] == field[5])
            return true;
        if (field[6] == field[7] && field[7] == field[8])
            return true;
        if (field[0] == field[3] && field[3] == field[6])
            return true;
        if (field[1] == field[4] && field[4] == field[7])
            return true;
        if (field[2] == field[5] && field[5] == field[8])
            return true;
        if (field[0] == field[4] && field[4] == field[8])
            return true;
        if (field[2] == field[4] && field[4] == field[6])
            return true;
        return false;
    }
}
