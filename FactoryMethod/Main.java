package FactoryMethod;

public class Main {
    public static void main(String [] args)
    {
        BurgerFactory factory= new KingBurger();
        Burger burger= factory.createBurger("standard");
        burger.prepare();
    }
}
