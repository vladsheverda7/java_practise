import java.util.Random;
import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int dieRoll = randomGenerator.nextInt(6) + 1;

        while(dieRoll != 5) {
            dieRoll = randomGenerator.nextInt(6);
            System.out.println(dieRoll);
        }

        int cupsOfCoffee = 1;
        // add while loop with counter
        while(cupsOfCoffee<=100) {
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
            cupsOfCoffee++;
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("Fry drinks cup of coffee #" + i);
        }

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses
        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i);
        }

        System.out.println(total);

        double mostExpensive = 0;

        // Iterate over expenses
        for(double expense : expenses) {
            if(expense > mostExpensive) {
                mostExpensive = expense;
            }
        }

        System.out.println(mostExpensive);
    }
}
