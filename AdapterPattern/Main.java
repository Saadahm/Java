package AdapterPattern;

import AdapterPattern.Adaptee.WeightMachineForBabies;
import AdapterPattern.Adapter.WeightMachineAdapter;
import AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args)
    {
        WeightMachineForBabies baby= new WeightMachineForBabies();
        WeightMachineAdapter weightMachineAdapter= new WeightMachineAdapterImpl(baby);
        System.out.println("Weight in kg is "+weightMachineAdapter.convert());

    }
}
