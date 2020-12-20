package main;

import java.util.Random;

public class IntegralTransaction implements TransactionType {
    @Override
    public void doTransaction(Population population) {
        Individu individu1 = population.getOneIndividuRandomly();
        Individu individu2 = population.getOneIndividuRandomly();

        double potCommun = individu1.getRichesse() + individu2.getRichesse();
        Random random = new Random();
        if (random.nextInt(2) == 0){
            individu1.setRichesse(potCommun);
            individu2.setRichesse(0);
        }
        else {
            individu1.setRichesse(0);
            individu2.setRichesse(potCommun);
        }
    }
}
