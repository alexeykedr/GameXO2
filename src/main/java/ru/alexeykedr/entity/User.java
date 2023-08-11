package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Scanner;

public class User extends GameLogic {
    static String typeField = "default";

    private Integer placeOneField;
    Scanner scanner = new Scanner( System.in);

    public Integer getPlaceOneField() {
        return placeOneField;
    }

    public String getTypeField() {
        return typeField;
    }

    public static void setTypeField(String typeField) {
        User.typeField = typeField;
    }


    public void move(char[] field) {

        if (typeField == null) {
            System.out.println("Введите тип ваших полей: Х или 0?  ");
            typeField = scanner.nextLine();
        }

        while (!isTypeFieldValid(typeField)) {
            System.out.println("Введите тип ваших полей X (икс большой) или О (о большая))?  ");
            typeField = scanner.nextLine();

        }
        new PcUser().setTypeFieldForPc(typeField);


        Field.printMapField(field);
        System.out.println("Введите цифру поля, куда хотите походить: ");

        placeOneField = scanner.nextInt();
        while (!isPlaceFieldValid(placeOneField, field)) {
            placeOneField = scanner.nextInt();

        }

        field[placeOneField - 1] = typeField.charAt(0);


    }


    private boolean isTypeFieldValid(String typeField) {
        if (typeField.equals("X") || typeField.equals("O")) {
            return true;
        } else {

            return false;
        }
    }

    private boolean isPlaceFieldValid(int placeOneField, char[] field) {
        if ((placeOneField < 1 || placeOneField > 9) ||
                (field[placeOneField - 1] == '0' || field[placeOneField - 1] == 'X')) {

            return false;
        } else {
            return true;
        }
    }

}





