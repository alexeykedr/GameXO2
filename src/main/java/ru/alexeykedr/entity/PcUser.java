package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Random;

public class PcUser extends GameLogic {

    Random random = new Random();


    public void move(char[] field, String typeField) {

        while (true) {
//            user.
            int randomNumber = random.nextInt(9)+1;

            if (field[randomNumber-1] == "X". charAt(0) || field[randomNumber-1] == "O".charAt(0)) {
                continue;
            } else {
                String typeFieldForPC = new User().getTypeField().equals("X")? "O" : "X";

                field[randomNumber] = typeFieldForPC.charAt(0);
                break;
            }
        }
    }
}
