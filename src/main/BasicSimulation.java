package main;

public class BasicSimulation extends Simulation {
    public BasicSimulation() {
        super(new BasicTransaction(), new BasicInterraction(), new NormaleWealthDistribution());
    }

    @Override
    public String toString() {
        return String.format("Basic Simulation\t\t\tStartGini " + this.startGini + "\t\t\tEndGini " + endGini);
    }
}
