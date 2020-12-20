package main;

import java.util.Random;

public class BasicTransaction implements TransactionType {
    @Override
    public void doTransaction(Population population) {
        Individu individu1 = population.getOneIndividuRandomly();
        Individu individu2 = population.getOneIndividuRandomly();

        double potCommun = individu1.getRichesse() + individu2.getRichesse();
        double newRichesse1 = potCommun - new Random().nextInt((int) potCommun);
        double newRichesse2 = potCommun - newRichesse1;
        individu1.setRichesse(newRichesse1);
        individu2.setRichesse(newRichesse2);
    }
}
