package AdapterCharge;

public class Iphone {
    AppleCharger appleCharger;
    public Iphone(AppleCharger appleCharger)
    {
        this.appleCharger=appleCharger;
    }
    void charge()
    {
        appleCharger.chargeIphone();
    }
}
