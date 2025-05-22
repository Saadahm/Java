package FactoryMethod;

public class StandardWheatBurger extends Burger{
    @Override
    void prepare()
    {
        System.out.println("Preparing standard wheat burger");
    }
}
