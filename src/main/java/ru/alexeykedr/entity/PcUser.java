package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Random;

public class PcUser extends GameLogic {

    Random random = new Random();

    String typeFieldForPc = "default";

    public String getTypeFieldForPc() {
        return typeFieldForPc;
    }

    public void setTypeFieldForPc(String typeField) {
        this.typeFieldForPc = typeField;
    }

    public void move(char[] field) {
        this.typeFieldForPc = getTypeFieldForPc().equals("X")? "0" : "X";

        // закрыть условием от изменения

        int randomNumber = random.nextInt(9) + 1;
        field[randomNumber - 1] = getTypeFieldForPc().charAt(0);
    }
}


