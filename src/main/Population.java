package main;

import java.util.*;

public class Population{
    private ArrayList<Individu> individuArrayList;
    private int populationSize;

    public Population(int populationSize) {
        this.individuArrayList = new ArrayList<>();
        this.populationSize = populationSize;
        for (int i = 0; i < populationSize; i++) {
            this.individuArrayList.add(new Individu());
        }
        sortPopulationByWealth();
    }

    public Individu getOneIndividuRandomly(){
        Random random = new Random();
        return this.individuArrayList.get(random.nextInt(this.populationSize));
    }

//    Juste une fonctio de test, A SUPPRIMER QUAND ON A PLUS BESOIN
    public ArrayList<Double> getTenRichesse(){
        ArrayList<Double> tmp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tmp.add(this.individuArrayList.get(i).getRichesse());
        }
        return tmp;
    }

    private void sortPopulationByWealth(){
        this.individuArrayList.sort(Comparator.comparingDouble(Individu::getRichesse));
    }

    public double calculateGiniCoefficient() {
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < populationSize ; i++) {
            values.add(this.individuArrayList.get(i).getRichesse());
        }
        double sumOfDifference = values.stream()
                .flatMapToDouble(v1 -> values.stream().mapToDouble(v2 -> Math.abs(v1 - v2))).sum();
        double mean = values.stream().mapToDouble(v -> v).average().getAsDouble();
        return sumOfDifference / (2 * values.size() * values.size() * mean);
    }

}
