package ru.alexeykedr.entity;


import java.util.Scanner;

public class User extends Player {
    Scanner scanner = new Scanner(System.in);

    public User() {
        System.out.println("Выберите тип ваших полей X или 0? ");
        this.symbol = scanner.nextLine().charAt(0);
    }

    private char symbol;
    private Integer placeOneFieldForUser;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Integer getPlaceOneFieldForUser() {
        return placeOneFieldForUser;
    }

    public void setPlaceOneFieldForUser(Integer placeOneFieldForUser) {
        this.placeOneFieldForUser = placeOneFieldForUser;
    }

    public Integer move(char[] field) {

        System.out.println("Введите цифру поля, куда хотите походить: ");
        setPlaceOneFieldForUser(scanner.nextInt());

        return getPlaceOneFieldForUser();

    }
}







