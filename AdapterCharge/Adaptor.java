package AdapterCharge;

public class Adaptor  implements  AppleCharger{
    //this has android
    AndroidCharger androidCharger;

    public Adaptor(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }
   public void chargeIphone()
    {
        androidCharger.chargeIphone();
    }
}
