package ru.alexeykedr.entity;

public abstract class Player {
    private char symbol;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public abstract Integer move(char[] field);


}
