package CodeAcademy;

public class Logical_and_or {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Logical_and_or(int count, int capacity, boolean open) {
        if(count == 0 || count > 8) {
            System.out.print("Invalid reservation!");
        }

        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if(restaurantCapacity >= guestCount && isRestaurantOpen){
            System.out.print("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.print("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if(!isConfirmed) {
            System.out.print("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.print("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        Logical_and_or partyOfThree = new Logical_and_or(3, 12, true);
        Logical_and_or partyOfFour = new Logical_and_or(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}