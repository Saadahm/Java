package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine)
    {
        this.weightMachine=weightMachine;
    }
    public double convert()
    {
        double weightInPound = weightMachine.getWeightPound();

        double weightInKg = weightInPound * .45;
        return weightInKg;

    }
}
