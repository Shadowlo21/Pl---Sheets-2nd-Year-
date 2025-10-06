public class Main {
    public static void main(String[] args) {
        long currentPopulation = 312_032_486L;
        long secondsInYear = 365L * 24 * 60 * 60;
        long birthsPerYear = secondsInYear / 7;
        long deathsPerYear = secondsInYear / 13;
        long immigrantsPerYear = secondsInYear / 45;
        for (int i = 1; i <= 5; i++) {
            currentPopulation += (birthsPerYear - deathsPerYear + immigrantsPerYear);
            System.out.printf("Year [%d] -> %d%n", i, currentPopulation);
        }
    }
}
