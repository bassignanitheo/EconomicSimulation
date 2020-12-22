package main;

public abstract class Simulation {
    private ITransaction transaction;
    private IInterraction interraction;
    private IWealthDistribution wealthDistribution;

    protected double startGini = 0;
    protected double endGini = 0;

    public Simulation(ITransaction transaction, IInterraction interraction, IWealthDistribution wealthDistribution)
    {
        this.transaction = transaction;
        this.interraction = interraction;
        this.wealthDistribution = wealthDistribution;
    }

    public void run(int iterrations, int populationSize)
    {
        Population population = new Population(populationSize , wealthDistribution);

        startGini = population.calculateGiniCoefficient();
        for (int i = 0; i < iterrations; i++)
        {
            transaction.doTransaction(interraction.interract(population));
        }
        endGini = population.calculateGiniCoefficient();
    }
}
