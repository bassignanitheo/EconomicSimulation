package main;

import java.util.Random;

public class NormaleWealthDistribution implements IWealthDistribution
{
    @Override
    public double getWealth(int deviation, int mean) {
        return (new Random()).nextGaussian() * deviation + mean;
    }
}
