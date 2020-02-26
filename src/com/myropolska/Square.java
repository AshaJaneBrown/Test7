package com.myropolska;

public class Square extends Figure {

    private Double sideLength;

    public Square(Double sideLength) {
        this.sideLength = sideLength;
        this.type = "квадрат";
    }

    public Double getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        for(int i = 1; i <= sideLength; i++)
        {
            for(int j = 1; j <= sideLength; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    @Override
    public double calculateArea() {
            this.area =  sideLength * sideLength;
            return this.area;
        }
    }



