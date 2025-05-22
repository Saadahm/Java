package AbstractFactory;

public class BasicWheatGarlicBread extends GarlicBread{
    @Override
    void prepare()
    {
        System.out.println("Preparing basic wheat garlic bread");
    }
}
