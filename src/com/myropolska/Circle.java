package com.myropolska;

public class Circle extends Figure {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        this.type = "круг";
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        double dist;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    @Override
    public double calculateArea() {
        this.area = (22 * radius * radius) / 7;
        return this.area;
    }
}


