package com.myropolska;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
    System.out.println("Enter a number of figures: ");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int numbersOfFigures = Integer.parseInt(bufferedReader.readLine());

     ArrayList<Figure> figures = new ArrayList<>();

        for (int i = 0; i < numbersOfFigures; i++) {
            int random = numbersOfFigures + 12345 + (int) getRandomDoubleBetweenRange(0, 9);
            if (random % 4 == 0) {
                double sideLength = getRandomDoubleBetweenRange(2, 5);
                int color = (int) getRandomDoubleBetweenRange(1, 10);
                figures.add(new Square(sideLength));
                continue;
            }
            if (random % 2 == 0) {
                double radius = getRandomDoubleBetweenRange(2, 5);
                figures.add(new Circle(radius));
                continue;
            }
            if (random % 3 == 0) {
                double width = getRandomDoubleBetweenRange(2, 5);
                double height = getRandomDoubleBetweenRange(2, 5);
                figures.add(new Triangle(width, height));

            }
            else {
                double firstBase = getRandomDoubleBetweenRange(2, 5);
                double secondBase = getRandomDoubleBetweenRange(2, 5);
                double height = getRandomDoubleBetweenRange(2, 5);
                figures.add(new Trapeze(firstBase, secondBase, height));
            }
        }

        for (Figure f : figures) {
            int colorNumber = (int) getRandomDoubleBetweenRange(0, 9);
            f.getColor(colorNumber);

        }

        for (Figure f : figures) {
            if (f instanceof Circle)
                System.out.printf("Фигура: " + f.type + ", площадь: %.1f кв. ед." + ", радиус: %.1f ед." + ", цвет: " + f.color + "%n", f.calculateArea(), ((Circle) f).getRadius());
            if (f instanceof  Triangle)
                System.out.printf("Фигура: " + f.type + ", площадь: %.1f кв. ед." + ", высота: %.1f ед." + ", цвет: " + f.color + "%n", f.calculateArea(), ((Triangle) f).getHeight());
            if (f instanceof Trapeze)
                System.out.printf("Фигура: " + f.type + ", площадь: %.1f кв. ед." + ", высота: %.1f ед." + ", цвет: " + f.color + "%n", f.calculateArea(), ((Trapeze) f).getHeight());
            if (f instanceof Square)
                System.out.printf("Фигура: " + f.type + ", площадь: %.1f кв. ед." + ", сторона: %.1f ед." + ", цвет: " + f.color + "%n", f.calculateArea(), ((Square) f).getSideLength());
        }
    }

        public static double getRandomDoubleBetweenRange (int min, int max){
            double x = (Math.random()*((max-min)+1))+min;
            double rounded = Math.round(x * 100.0) / 100.0;
            return x;
        }
}




