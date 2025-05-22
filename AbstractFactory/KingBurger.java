package AbstractFactory;

public class KingBurger extends BurgerFactory {
    @Override
    public Burger createBurger(String type)
    {
        if(type.equals("basic"))
            return new BasicWheatBurger();
        else if(type.equals("standard"))
            return new StandardWheatBurger();
        else
            System.out.println("Invalid");
        return null;
    }
    public GarlicBread createGarlicBread(String type)
    {
        if(type.equals("basic"))
            return new BasicWheatGarlicBread();
        return null;
    }
}

