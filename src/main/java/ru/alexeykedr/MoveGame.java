package ru.alexeykedr;

import ru.alexeykedr.entity.Field;
import ru.alexeykedr.entity.PcUser;
import ru.alexeykedr.entity.User;

public class MoveGame {
    public static void startGame() {
    Field mapfield = new Field();
    char[] mapFieldNew = mapfield.create(9);
    User user = new User();
    PcUser pc = new PcUser();


        while (true) {
            user.move(mapFieldNew);
            if (GameLogic.isWin(mapFieldNew)) {
                System.out.println(" Пользователь  выиграл!");
                break;
            }
            pc.move(mapFieldNew);
            if (GameLogic.isWin(mapFieldNew)) {
                System.out.println("Выиграл PC!");
                break;
            }
        }

    }
}