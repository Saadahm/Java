package AbstractFactory;

public abstract class BurgerFactory {
    abstract Burger createBurger(String type);
    abstract GarlicBread createGarlicBread(String type);
}
