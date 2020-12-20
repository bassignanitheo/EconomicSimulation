package main;

public class Main {
    public static void main(String[] args) {
        TransactionType transactionType = new BasicTransaction();
        Population population = new Population(1000, transactionType);
        System.out.println("Coefficient de Gini à la premiere génération: "+population.calculateGiniCoefficient());

        for (int i = 0; i < 1000; i++) {
            population.executeTransactionType();
        }

        System.out.println("Coefficient de Gini à la deuxieme génération: "+population.calculateGiniCoefficient());
    }
}
