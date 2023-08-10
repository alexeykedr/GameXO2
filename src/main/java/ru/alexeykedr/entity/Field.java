package ru.alexeykedr.entity;

public class Field {
    public char[] create(int size) {

        int count = 1;
        char mapFieldNew[] = new char[size];
        for (int i = 0; i < mapFieldNew.length; i++) {
            mapFieldNew[i] = (char)(count++ + '0');
        }
        return mapFieldNew;
    }
    public static void printMapField(char[] mapField){
        for (int i = 0; i < mapField.length; i += 3) {
            for (int j = i; j < i + 3 && j < mapField.length; j++) {
                System.out.print(mapField[j] + " ");
            }
            System.out.println();
        }
    }
}
