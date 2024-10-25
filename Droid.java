public class Droid {
    public String name;
    public int batteryLevel;

    public Droid (String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = 10;
    }

    public void energyTransfer(Droid otherDroid, int batteryCount) {
        if (batteryLevel >= batteryCount) {
            batteryLevel -= batteryCount;
            otherDroid.batteryLevel += batteryCount;
            System.out.println(name + " transferred " + batteryCount + "% battery to " + otherDroid.name);
        } else {
            System.out.println(name + " does not have enough battery to transfer.");
        }
    }

    public void energyReport() {
        System.out.println("Batery level is " + batteryLevel);
    }

    public String toString() {
        return "Hello, I\'m tje droid: " + name;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid mark = new Droid("Mark");

        codey.performTask("dancing");
        codey.energyReport();
        mark.energyReport();

        codey.energyTransfer(mark, 5);

        codey.energyReport();
        mark.energyReport();
    }
}