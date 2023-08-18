package ru.alexeykedr.entity;

import java.util.Random;

public class PcUser extends Player {

    private final Random random = new Random();

    private Integer generateMovePc() {
        return  random.nextInt(9) + 1;
    }

    public Integer move(char[] field) {
        return generateMovePc();
    }
}


