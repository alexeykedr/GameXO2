package ru.alexeykedr.entity;

import ru.alexeykedr.GameLogic;

import java.util.Scanner;

public class User implements GameLogic {


    @Override
    public void move(char[] field, int place) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите поле: ");
        String input = scanner.nextLine();
        while (true) {
            if (input.length() != 1) {
                System.out.println("Введите поле с 1 символом");
            } else {
                if (input.charAt(0) == 'X' || input.charAt(0) == 'O') {
                    field[place] = input.charAt(0);
                    break;
                } else {
                    System.out.println("Введите поле с 1 символом");
                }
            }
        }
    }


    @Override
    public boolean isWin(char[] field) {
        if (field[0] == field[1] && field[1] == field[2])
            return true;
        if (field[3] == field[4] && field[4] == field[5])
            return true;
        if (field[6] == field[7] && field[7] == field[8])
            return true;
        if (field[0] == field[3] && field[3] == field[6])
            return true;
        if (field[1] == field[4] && field[4] == field[7])
            return true;
        if (field[2] == field[5] && field[5] == field[8])
            return true;
        if (field[0] == field[4] && field[4] == field[8])
            return true;
        if (field[2] == field[4] && field[4] == field[6])
            return true;
        return false;


    }
}
