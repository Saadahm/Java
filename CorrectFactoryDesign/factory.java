package CorrectFactoryDesign;
import FactoryDesign.Shape;

public class factory {
    public Shape createType1(String type){
        if(type.equals("Circle")){
            return new Circle();
        } else if (type.equals("Triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }

    }

}
