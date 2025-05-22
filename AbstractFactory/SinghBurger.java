package AbstractFactory;

public class SinghBurger extends BurgerFactory {
    @Override
    public Burger createBurger(String type)
    {
        if(type.equals("basic"))
            return new BasicBurger();
        else if(type.equals("standard"))
            return new StandardBurger();
        else
            System.out.println("Invalid");
        return null;
    }
    public GarlicBread createGarlicBread(String type)
    {
        if(type.equals("basic"))
            return new BasicGarlicBread();
        return null;
    }
}
