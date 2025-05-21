package AdapterCharge;

public class DKCharger implements AndroidCharger{

    @Override
    public void chargeIphone() {
        System.out.println("Charging using android charger");
    }
}
