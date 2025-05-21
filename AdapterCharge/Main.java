package AdapterCharge;

public class Main {
 public static void main(String[] args){
//     AppleCharger appleCharger=new ChargerXYZ();

     AndroidCharger androidCharger=new DKCharger();
     AppleCharger appleCharger= new Adaptor(androidCharger);
     Iphone iphone=new Iphone(appleCharger);
     iphone.charge();



 }
}
