package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Scanner;

public class User extends GameLogic {
    private String typeField;
    private Integer placeOneField;


    public Integer getPlaceOneField() {
        return placeOneField;
    }

    public String getTypeField() {
        return typeField;
    }
    @Override
    public void move(char[] field) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип ваших полей: Х или 0?  ");
        while (!isFieldValid(typeField)) {
            typeField = scanner.nextLine();
        }

        System.out.print("Введите цифру поля, куда хотите походить: \n123 \n456 \n789  ");
        while (!isPlaceFieldValid(placeOneField))
            placeOneField = scanner.nextInt();

        field[placeOneField] = typeField.charAt(0);
    }

    private boolean isFieldValid(String typeField) {
        if (typeField.equals("X") || typeField.equals("O")) {
            return true;
        } else {
            System.out.println("Введите тип ваших полей (икс или ноль): Х или 0");
            return false;
        }
    }

    private boolean isPlaceFieldValid(int placeOneField) {
        if (placeOneField < 1 || placeOneField > 9) {
            System.out.println("Введите значение из диапазона 1<=x<=9");
            return false;
        } else {
            return true;
        }
    }
}






