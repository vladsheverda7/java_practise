package Inheritance_Polymorphism;

public class Noodle {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {
        this.texture = "cooked";
    }

    final public  boolean isTasty() {
        return true;
    }
}