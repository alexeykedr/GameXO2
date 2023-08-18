package ru.alexeykedr;

import ru.alexeykedr.entity.Field;
import ru.alexeykedr.entity.PcUser;
import ru.alexeykedr.entity.Player;
import ru.alexeykedr.entity.User;

import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field(9);
    private final Player user = new User();
    private final Player pc = new PcUser();
    private final Scanner scanner = new Scanner(System.in);


    private final char moveSymbolForPC = ((MoveSymbol.X.toString().charAt(0) == user.getSymbol()) ?
            MoveSymbol.O : MoveSymbol.X)
            .toString().charAt(0);

    public void startGame() {
        while (!isTypeFieldValid((user.getSymbol()))) {
            System.out.println("Введите тип ваших полей: Х (икс большой) или 0 (буква о большая)?  ");
            user.setSymbol(scanner.nextLine().charAt(0));
        }
        while (true) {
//             ----------------- USER ------------------------------------
            int numberPlaceForUser = user.move(field.getMapFieldNew());

            while (isPlaceFieldValid(numberPlaceForUser, field.getMapFieldNew())) {
                numberPlaceForUser = scanner.nextInt();
                System.out.println("Введите цифру поля, куда хотите походить от 1 до 9 включительно: ");
            }
            field.getMapFieldNew()[numberPlaceForUser - 1] = user.getSymbol();
            field.printMapField(field.getMapFieldNew());

            if (isWin(field.getMapFieldNew())) {
                System.out.println("Пользователь  выиграл!");
                break;
            }

            // -------------------------- PC -----------------------------------------
            int numberPlaceForPC = pc.move(field.getMapFieldNew());

            while (!isPlaceFieldValid(numberPlaceForPC, field.getMapFieldNew())) {
                numberPlaceForPC = pc.move(field.getMapFieldNew());
            }
            field.getMapFieldNew()[numberPlaceForPC - 1] = moveSymbolForPC;
            field.printMapField(field.getMapFieldNew());

            if (isWin(field.getMapFieldNew())) {
                System.out.println("Выиграл PC!");
                break;
            }
        }

    }

    public boolean isTypeFieldValid(char moveSymbol) {
        if (moveSymbol == MoveSymbol.X.toString().charAt(0) ||
                moveSymbol == MoveSymbol.O.toString().charAt(0)) {
            return true;
        } else {

            return false;
        }
    }

    public boolean isPlaceFieldValid(int placeOneField, char[] field) {
        if ((placeOneField < 1 || placeOneField > 9) ||
                (field[placeOneField - 1] == '0' || field[placeOneField - 1] == 'X')) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isWin(char[] field) {
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