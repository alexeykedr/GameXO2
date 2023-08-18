package ru.alexeykedr.entity;

public class Field {
    private final char[] mapFieldNew;
    private final int size;


    public char[] getMapFieldNew() {
        return mapFieldNew;
    }


    public Field(int sizeMap) {
        this.size = sizeMap;

        mapFieldNew = new char[size];
        for (int i = 0, count = 1; i < mapFieldNew.length; i++) {
            mapFieldNew[i] = (char) (count++ + '0');
        }

    }

    public void printMapField(char[] mapFieldNew) {
        for (int i = 0; i < mapFieldNew.length; i += 3) {
            for (int j = i; j < i + 3 && j < mapFieldNew.length; j++) {
                System.out.print(mapFieldNew[j] + " ");
            }
            System.out.println();
        }
    }
}

