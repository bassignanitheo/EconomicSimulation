package main;

public class CustomSimulation extends Simulation {

    public CustomSimulation(ITransaction transaction, IInterraction interraction, IWealthDistribution wealthDistribution) {
        super(transaction, interraction, wealthDistribution);
    }

    @Override
    public String toString() {
        return String.format("Custom Simulation\t\t\tStartGini " + this.startGini + "\t\t\tEndGini " + endGini);
    }
}
