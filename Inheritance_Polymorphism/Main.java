package Inheritance_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);

        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);

        Ramen yasaiRamen = new Ramen();
        System.out.println(yasaiRamen.isTasty());

    }
}
