public class StringMethod {
    public static void main(String[] args) {

        //*******************************
        // length()
        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";
        int length = tweet.length();
        System.out.println(length);


        //*******************************
        // concat()
        String firstName = "Vlad ";
        String lastName = "Vlad";

        firstName = firstName.concat(lastName);
        System.out.println(firstName);

        //*******************************
        // equals()

        String password = "correcthorsebatterystaple";
        String another_password = "test";

        System.out.print(password.equals(another_password));


        //*******************************
        // indexOf

        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

        System.out.print(code.indexOf(". .- -"));

        //*******************************
        // charAt

        String firstName_1 = "Vlad";
        String lastName_1 = "Vlad";

        System.out.println(firstName_1.charAt(0));
        System.out.println(lastName_1.charAt(0));

        //*******************************
        // substring

        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(4, 11));

        //*******************************
        // upperCase, lowerCase
        String hashtag = "#100DaysOfCode";

        System.out.print(hashtag.toLowerCase());
        System.out.print(hashtag.toUpperCase());


        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;
        int dna_length = dna3.length();

        int start = dna3.indexOf("ATG");
        int stop = dna3.indexOf("TGA");

        if(start != -1 && stop != -1 && (stop - start) % 3 ==0 ) {
            String protein = dna.substring(start, stop+3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }
    }
}
