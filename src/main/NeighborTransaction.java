package main;

import java.util.Random;

public class NeighborTransaction implements TransactionType {
    @Override
    public void doTransaction(Population population) {
        Random random = new Random();
        int randomIndex = random.nextInt(population.getPopulationSize());
        Individu individu1 = population.getIndividu(randomIndex);
        Individu individu2 = population.getIndividu(randomIndex+1);
    }
}
