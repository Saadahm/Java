package AbstractFactory;

public class Main {
    public static void main(String [] args)
    {
        BurgerFactory factory= new KingBurger();
        Burger burger= factory.createBurger("standard");
        GarlicBread garlicBread=factory.createGarlicBread("basic");
        burger.prepare();
        garlicBread.prepare();
    }
}
