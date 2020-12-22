package main;

public class Main {
    public static void main(String[] args) {
        // Define simulation parameters
        ITransaction transaction = new IntegralTransaction();
        IInterraction interraction = new BasicInterraction();
        IWealthDistribution wealthDistribution = new ChiWealthDistribution();

        // Create simulation
        Simulation simulation = new BasicSimulation();
        simulation.run(15000, 1000);
        System.out.println(simulation.toString());
        simulation = new IntegralSimulation();
        simulation.run(15000, 1000);
        System.out.println(simulation.toString());
        simulation = new NeighbourSimulation();
        simulation.run(15000, 1000);
        System.out.println(simulation.toString());
        simulation = new CustomSimulation(transaction, interraction, wealthDistribution);
        simulation.run(15000, 1000);
        System.out.println(simulation.toString());
    }
}
