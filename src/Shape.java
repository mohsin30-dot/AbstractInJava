public abstract class Shape {
    public double numSides; // data members or attribute
    public Shape(){
        this.numSides = numSides;// Initialize Constructor
    }
    public double getNumSides() { // get concrete  method for numSides
        return numSides;
    }
    /* By defining this method, we are telling the Java compiler that
    it should allows us to call the getArea method using any variable declared with the type Shape,
     or declared with any class that is a subclass of Shape
     */
    public abstract void getArea();// abstract method for area
    public abstract void getPerimeter();// abstract method for perimeter

}











/*
Sometimes a class should define a method that logically belongs in the class,
but that class cannot specify how to implement the method. For example,
the Shape class is used as a superclass for 2-dimensional shapes (like circles, rectangles, etc).
Logically, every shape should have a getArea method, because every shape has an area.
But, every shape would compute its area using a different formula, and there is
no way to specify one getArea method in the Shape class that is correct for all its possible subclasses
 */