package com.myropolska;

public class Triangle extends Figure {

    private double width;
    private double height;

    public Triangle (double width, double height) {
        this.width = width;
        this.height = height;
        this.type = "треугольник";
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        int space = 9;
        char ch;
        for (int i = 1; i <= 5; i++) {
            ch = '$';
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
            }
            space--;
            System.out.println();
        }
    }

    @Override
    public double calculateArea() {
        this.area = (width*height)/2;
            return area;
        }
    }


