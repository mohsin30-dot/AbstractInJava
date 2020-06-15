package com.company;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Rectangle (int numSide,int width,int height,int side1,int side2, int side3, int side4){
        super(numSide);
        this.width = width;
        this.height= height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public void getArea() {
        double area = (height+width)/4; // rectangle area formula A = L*W & 4 sides
        System.out.println("Area of com.company.Rectangle is " + area);

    }

    @Override
    public void getPerimeter(){
        double perimeter = 2*(height+width); // rectangle perimeter formula P= 2(l+w)
        System.out.println("Perimeter of com.company.Rectangle is " + perimeter);

    }

    //Method overloading. Second type
    public void getPerimeter(int height,int width){
        double perimeter=2*(this.height+this.width);
        System.out.println("Perimeter of rectangle : "+perimeter);

    }

    @Override
    public void resize(double x) {
        this.width = x;
        this.height= x;
        this.side1 = x;
        this.side2 = x;
        this.side3 = x;
        this.side4 = x;
    }
}


