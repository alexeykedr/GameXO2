package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Random;

public class PcUser extends GameLogic {

    Random random = new Random();
    String typeFieldForPC = new User().getTypeField()
            .equals("X")? "X" : "O";

    @Override
    public void move(char[] field) {
        while (true) {
            int randomNumber = random.nextInt(9);
            String inpuPlacePC = Integer.toString(randomNumber + 1);

            if (field[randomNumber] == 'X' || field[randomNumber] == 'O') {
                continue;
            } else {
                field[randomNumber] = typeFieldForPC.charAt(0);
                break;
            }
        }
    }
}
