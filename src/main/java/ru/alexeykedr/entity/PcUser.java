package ru.alexeykedr.entity;

import java.util.Random;

public class PcUser extends Player {

    Random random = new Random();

    public Integer generateMove() {
        int randomNumber = random.nextInt(9) + 1;
        return randomNumber;
    }

    public Integer move(char[] field) {
        return generateMove();
    }
}


