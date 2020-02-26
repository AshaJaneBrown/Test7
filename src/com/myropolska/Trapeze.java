package com.myropolska;

public class Trapeze  extends Figure {

    private double firstBase;
    private double secondBase;
    private double height;

    public Trapeze(double firstBase, double secondBase, double height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.type = "трапеция";
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        int k = 5;
        int d = 10;
        for(int i = 0; i < 5; i++){
            for(int l = k; l > 1; l--){
                System.out.print("  ");
            }
            for(int j = 0; j < d; j++){
                System.out.print("*");
            }
            System.out.println();
            k--;
            d = d+4;
        }
    }

    @Override
    public double calculateArea() {
        this.area = 0.5 * (firstBase + secondBase) * height;
            return area;
        }
    }



