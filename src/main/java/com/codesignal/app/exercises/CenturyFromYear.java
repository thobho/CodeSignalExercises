package com.codesignal.app.exercises;

public class CenturyFromYear {

    public static void main(String[] args) {

        System.out.println(centuryFromYear(99));

    }


    public static int centuryFromYear(int year) {
        int century = -1;
        if (year % 100 == 0 && year >= 100) {
            century = year / 100;
        } else if (year % 100 != 0 && year <=99) {
           century = 1;
        } else {
            century = (year / 100) + 1;
        }

        return century;
    }


}


