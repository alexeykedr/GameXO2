package ru.alexeykedr;

import ru.alexeykedr.entity.Field;
import ru.alexeykedr.entity.PcUser;
import ru.alexeykedr.entity.User;

/*подумать над логикой проверки победы вместо if else*/

public class GameRunner {
    public static void main(String[] args) {
        Field field = new Field();
        char[] fieldNew = field.create(9);
        User user = new User();
        PcUser pc = new PcUser();

        while (true) {
            user.move(fieldNew, 0);
            if (user.isWin(fieldNew))
                System.out.println(" Пользователь  выиграл!");
            pc.move(fieldNew, 0);
            if (pc.isWin(fieldNew))
                System.out.println("Выиграл PC!");



            break;
        }


        if (!pc.isWin(fieldNew))


    }
}
