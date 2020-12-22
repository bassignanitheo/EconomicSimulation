package main;

public class NeighbourSimulation extends Simulation {

    public NeighbourSimulation() {
        super(new BasicTransaction(), new NeighborInterraction(), new NormaleWealthDistribution());
    }

    @Override
    public String toString() {
        return String.format("Neighbour Simulation\t\tStartGini " + this.startGini + "\t\t\tEndGini " + endGini);
    }
}
