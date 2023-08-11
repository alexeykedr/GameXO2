package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;


import java.util.Scanner;

public class User extends Player {
    GameLogic gameLogic;
    Scanner scanner = new Scanner(System.in);

    public char moveSymbolUser;

    private Integer placeOneField;

    public Integer move(char[] field) {

        while (!gameLogic.isTypeFieldValid((moveSymbolUser))) {

            System.out.println("Введите тип ваших полей: Х (икс большой) или 0 (буква о большая)?  ");
            moveSymbolUser = scanner.nextLine().charAt(0);
        }
        System.out.println("Введите цифру поля, куда хотите походить: ");

        placeOneField = scanner.nextInt();
        while (!gameLogic.isPlaceFieldValid(placeOneField, field)) {
            placeOneField = scanner.nextInt();
            System.out.println("Введите цифру поля, куда хотите походить от 1 до 9 включительно: ");

        }

        return placeOneField;

    }
}







