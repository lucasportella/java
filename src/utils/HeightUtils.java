package utils;

import entities.Person;

public class HeightUtils {

    public static double calculateAverageHeight(Person[] personVector) {
        double averageHeight = 0.0;
        for ( int c = 0; c < personVector.length; c++) {
            averageHeight += personVector[c].height;
        }
        return averageHeight / personVector.length;
    }
    public static double calculateMinorsPercentage(Person[] personVector) {
        int minorsQuantity = 0;

        for (int c = 0; c < personVector.length; c++) {
            if (personVector[c].age < 16) {
                minorsQuantity += 1;
            }

        }
        String[] minors = new String[minorsQuantity];
        for (int c = 0; c < personVector.length; c++) {
            if (personVector[c].age < 16) {
                minors[c] = personVector[c].name;
            }
        }
        return  ((double) minorsQuantity * 100) / personVector.length;

    }

}
