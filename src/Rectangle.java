
public class Rectangle extends Shape {
    private int width;
    private int height;
    private int side1;
    private int side2;
    private int side3;
    private int side4;

    public Rectangle (int width,int height,int side1,int side2, int side3, int side4){
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
        System.out.println("Area of Rectangle is " + area);

    }

    @Override
    public void getPerimeter(){
        double perimeter = 2*(height+width); // rectangle perimeter formula P= 2(l+w)
        System.out.println("Perimeter of Rectangle is" + perimeter);

    }
}


