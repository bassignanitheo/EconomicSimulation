package main;

import java.util.ArrayList;
import java.util.Random;

public class NeighborInterraction implements IInterraction {
    @Override
    public ArrayList<Individu> interract(Population population) {
        ArrayList<Individu> individus = new ArrayList<>();
        Random random = new Random();
        int randomIndex = random.nextInt(population.getPopulationSize() - 1);
        individus.add(population.getIndividu(randomIndex));

        if (randomIndex >= population.getPopulationSize() - 1)
            randomIndex = 0;
        else
            randomIndex += 1;

        individus.add(population.getIndividu(randomIndex));
        return individus;
    }
}
