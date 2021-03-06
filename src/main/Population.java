package main;

import java.util.*;

public class Population{
    private ArrayList<Individu> individuArrayList;
    private int populationSize;

    public Population(int populationSize, IWealthDistribution wealthDistribution) {
        this.individuArrayList = new ArrayList<>();
        this.populationSize = populationSize;
        for (int i = 0; i < populationSize; i++) {
            this.individuArrayList.add(new Individu(wealthDistribution));
        }
        sortPopulationByWealth();
    }

    public Individu getOneIndividuRandomly() {
        Random random = new Random();
        return this.individuArrayList.get(random.nextInt(this.populationSize));
    }

    public Individu getIndividu(int index){
        return this.individuArrayList.get(index);
    }

    private void sortPopulationByWealth() {
        this.individuArrayList.sort(Comparator.comparingDouble(Individu::getWealth));
    }

    public double calculateGiniCoefficient() {
        sortPopulationByWealth();
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < populationSize ; i++) {
            values.add(this.individuArrayList.get(i).getWealth());
        }
        double sumOfDifference = values.stream()
                .flatMapToDouble(v1 -> values.stream().mapToDouble(v2 -> Math.abs(v1 - v2))).sum();
        double mean = values.stream().mapToDouble(v -> v).average().getAsDouble();
        return sumOfDifference / (2 * values.size() * values.size() * mean);
    }

    public void executeTransactionType() {
    }

    public int getPopulationSize() {
        return populationSize;
    }
}
