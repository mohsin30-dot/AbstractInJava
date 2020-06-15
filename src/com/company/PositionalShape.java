package com.company;

public class PositionalShape extends Shape implements Resizable{

    private double height;
    private double width;

    public PositionalShape(int numSides,int height,int width) {
        super(numSides);
        this.height=height;
        this.width=width;
    }

    @Override
    public void getArea() {
        double area = (height+width)/4; // rectangle area formula A = L*W & 4 sides
        System.out.println("Area of com.company.PositionalShape is " + area);

    }

    @Override
    public void getPerimeter() {
        double perimeter = 2*(height+width); // rectangle perimeter formula P= 2(l+w)
        System.out.println("Perimeter of com.company.Rectangle is " + perimeter);
    }

    @Override
    public void resize(double x) {

    }
}
