package FactoryDesign;

class Circle implements  Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Triangle implements  Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
public class Main {
    public static void main(String []args)
    {
        String type = "Triangle";
        Shape shape;
        if(type.equals("Circle")) {
            shape = new Circle();
            shape.draw();
        } else if (type.equals("Triangle")) {
            shape = new Triangle();
            shape.draw();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
       // ReportGenerator.generateReport(type); //here lets say we dont have triangle branch- > it will give erorr
        // how to resolve? use a factory design pattern where the shape creation exists in a factory only
    }
}
