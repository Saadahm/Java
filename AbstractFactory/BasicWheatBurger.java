package AbstractFactory;

public class BasicWheatBurger extends Burger {
    @Override
    void prepare()
    {
        System.out.println("Preparing basic wheat burger");
    }
}
