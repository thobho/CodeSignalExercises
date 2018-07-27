package com.codesignal.app.exercises;

public class AdjacentElementsInArray {
    public static void main(String[] args) {

        int[] inputArray = {-1, 100};

        System.out.println(adjacentElementsProduct(inputArray));
    }

    public static int adjacentElementsProduct(int[] inputArray) {

              int biggestValue = inputArray[0] * inputArray[1];


        int tempValue;
        for (int i = 0; i < inputArray.length - 1; i++) {

            tempValue = inputArray[i] * inputArray[i + 1];
            if (tempValue > biggestValue) {
                biggestValue = tempValue;
            }
        }
        return biggestValue;
    }

}
