package main;

public class Main {
    public static void main(String[] args) {
        Population population = new Population(1000);
        System.out.println(population.calculateGiniCoefficient());
    }
}
