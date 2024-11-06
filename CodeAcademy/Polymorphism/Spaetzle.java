package CodeAcademy.Polymorphism;

public class Spaetzle extends Noodle {
    Spaetzle() {
        super(3.0, 1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";
    }

    @Override
    public void cook(){
        System.out.println("Grinding or scraping the dough into the pot of boiling water.");
        texture = "cooked";
        System.out.println("Boiling");
    }

    @Override
    public String getCookPrep() {
        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
    }
}
