package CodeAcademy;

public class Order_switch {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order_switch(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("CodeAcademy.Order not ready");
        }
    }

    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch(shipping){
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = 0.50;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order_switch book = new Order_switch(true, 9.99, "Express");
        Order_switch chemistrySet = new Order_switch(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
