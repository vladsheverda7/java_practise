public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("\"Hello World\"");
        System.out.println("This is the backslash symbol: \\");
        System.out.println("Hello\nGoodbye");

        Variables var = new Variables();
        String name = var.GetName();
        System.out.print(name);
    }
}
