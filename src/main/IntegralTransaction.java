package main;

import java.util.ArrayList;
import java.util.Random;

public class IntegralTransaction implements ITransaction {
    @Override
    public void doTransaction( ArrayList<Individu> individus) {
        double potCommun = individus.get(0).getWealth() + individus.get(1).getWealth();
        Random random = new Random();
        int idx = random.nextInt(2);
        individus.get(idx).setWealth(potCommun);
        individus.get(1 - idx).setWealth(0);
    }
}
