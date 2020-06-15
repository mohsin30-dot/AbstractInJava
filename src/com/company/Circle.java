
package com.company;

public class Circle extends Shape {
    private int width;
    private int height;
    private int side1;
    private int side2;


    public Circle(int numSide,int width, int height, int side1, int side2) {
        super(numSide);
        this.width = width;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public void getArea() {
        double area = (height*width)/2; //com.company.RtTriangle area formula A= h*w/2
        System.out.println("Area of com.company.RtTriangle" + area);
    }
    @Override
    public void getPerimeter() {
        double perimeter = width+side1+side2;
        System.out.println("Perimeter of com.company.RtTriangle" + perimeter);
    }
}
