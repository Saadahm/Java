package FactoryMethod;

public class BasicBurger extends Burger{
    @Override
    void prepare()
    {
        System.out.println("Preparing basic burger");
    }
}
