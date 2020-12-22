package main;

import java.util.ArrayList;

public class BasicInterraction implements IInterraction {
    @Override
    public ArrayList<Individu> interract(Population population) {
        ArrayList<Individu> individus = new ArrayList<>();
        individus.add(population.getOneIndividuRandomly());
        individus.add(population.getOneIndividuRandomly());
        return individus;
    }
}
