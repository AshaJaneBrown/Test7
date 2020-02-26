package com.myropolska;


public abstract class Figure implements AreaCal, Drawable, Colorful {
    double area;
    String color;
    String type;

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();

    @Override
    public void getColor(int colorNumber) {
        switch (colorNumber) {
            case 0:
                this.color = "серый";
                break;
            case 1:
                this.color = "желтый";
                break;
            case 2:
                this.color = "синий";
                break;
            case 3:
                this.color = "голубой";
                break;
            case 4:
                this.color = "зелёный";
                break;
            case 5:
                this.color = "розовый";
                break;
            case 6:
                this.color = "красный";
                break;
            case 7:
                this.color = "фиолетовый";
                break;
            case 8:
                this.color = "коричневый";
                break;
            case 9:
                this.color = "черный";
                break;
            default:
                this.color = "белый";
                break;
        }
    }
}



