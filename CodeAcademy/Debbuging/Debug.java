package CodeAcademy.Debbuging;

public class Debug {
    public static void main(String[] args) {
        System.out.println("       1");
        System.out.println("     2 3");
        System.out.println("   4 5 6");
        System.out.println("7 8 9 10");


        int width = 0; // changed it from 0 to 20
        int length = 40;
        try {
            int ratio = length / width;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }

        int[] numbers = {1, 2, 3, 4, 5};

        int lastNumber = numbers[4];

        System.out.println("The value of the last element is: " + lastNumber);
    }
}
