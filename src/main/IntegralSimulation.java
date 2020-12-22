package main;

public class IntegralSimulation extends Simulation {
    public IntegralSimulation() {
        super(new IntegralTransaction(), new BasicInterraction(), new NormaleWealthDistribution());
    }

    @Override
    public String toString() {
        return String.format("Integral Simulation\t\t\tStartGini " + this.startGini + "\t\t\tEndGini " + endGini);
    }
}
