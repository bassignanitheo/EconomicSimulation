package main;

public class Individu {
    private double wealth;

    public Individu(IWealthDistribution wealthDistribution)
    {
        this.wealth = wealthDistribution.getWealth(20, 100 );
    }

    public double getWealth() {
        return wealth;
    }

    public void setWealth(double wealth) {
        this.wealth = wealth;
    }
}
