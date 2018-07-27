package com.codesignal.app.exercises;

public class ShapeArea {

    public static void main(String[] args) {

        System.out.println(shapeArea(3));

    }

    public static int shapeArea(int n) {
        int area = 1;
        while (n<=1)
        area += (n-1)*4;
        n = n - 1;
        System.out.println(n);
        return area;
    }

}
