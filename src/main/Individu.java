package main;

import java.util.Random;

public class Individu {
    private double richesse;

    public Individu() {
        Random random = new Random();
        int mean = 100;
        int standardDeviation = 20;
        this.richesse = random.nextGaussian() * standardDeviation + mean;
    }

    public double getRichesse() {
        return richesse;
    }

    public void setRichesse(int richesse) {
        this.richesse = richesse;
    }
}
