package main;
import java.util.Random;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;

public class ChiWealthDistribution implements IWealthDistribution{
    @Override
    public double getWealth(int deviation, int mean) {
        return (new ChiSquaredDistribution(mean, deviation).sample());
    }
}
