package ru.alexeykedr;

import ru.alexeykedr.entity.Field;
import ru.alexeykedr.entity.PcUser;
import ru.alexeykedr.entity.Player;
import ru.alexeykedr.entity.User;

public class GameLogic {
    private final Field field = new Field(9);
    private final User user = new User();
    private final PcUser pc = new PcUser();
    private final char moveSymbolForPC = ((MoveSymbol.X.toString().charAt(0) == user.moveSymbolUser) ?
            MoveSymbol.O : MoveSymbol.X).toString().charAt(0);

    public void startGame() {
        while (true) {

            // USER ------------------------------------
            int placeForUser = user.move(field.mapFieldNew);
            field.mapFieldNew[placeForUser - 1] = user.moveSymbolUser;
            field.printMapField(field.mapFieldNew);

            if (Player.isWin(field.mapFieldNew)) {
                System.out.println("Пользователь  выиграл!");
                break;
            }

            // PC -----------------------------------------
            int placeForPC = pc.generateMove();
            for (int count = 0;
                 !isPlaceFieldValid(placeForPC, field.mapFieldNew) && count < 3;
                 count++) {
                placeForPC = pc.generateMove();
            }
            field.mapFieldNew[placeForPC - 1] = moveSymbolForPC;
            field.printMapField(field.mapFieldNew);

            if (Player.isWin(field.mapFieldNew)) {
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
}