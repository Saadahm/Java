package FactoryMethod;

public class StandardBurger extends Burger{
    @Override
    void prepare()
    {
        System.out.println("Preparing standard burger");
    }
}
