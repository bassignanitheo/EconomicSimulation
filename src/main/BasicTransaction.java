package main;

import java.util.ArrayList;
import java.util.Random;

public class BasicTransaction implements ITransaction {
    @Override
    public void doTransaction(ArrayList<Individu> individus) {
        double potCommun = individus.get(0).getWealth() + individus.get(1).getWealth();
        if (potCommun > 0)
        {
            double newRichesse1 = potCommun - new Random().nextInt((int) potCommun);
            double newRichesse2 = potCommun - newRichesse1;
            individus.get(0).setWealth(newRichesse1);
            individus.get(1).setWealth(newRichesse2);
        }
    }
}
