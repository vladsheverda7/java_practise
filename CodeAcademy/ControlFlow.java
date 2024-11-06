package CodeAcademy;

public class ControlFlow {
    public static void main(String[] arguments) {
        double itemCost = 30.99;
        boolean isFilled = false;

        // Write an if-then statement:
        if (itemCost > 24.00) {
            System.out.print("High value item!");
        }

        // Write an if-then-else statement:
        if (isFilled) {
            System.out.print("Shipping");
        } else {
            System.out.print("CodeAcademy.Order not ready");

        }
    }
}
