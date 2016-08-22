public class App {
    public static void main(String[] args) {

        String info = "";

        info += "My name is Chris.";
        info += " ";
        info += "Hello everybody!";

        System.out.println(info);

        StringBuilder sb = new StringBuilder();

        sb.append("My name is Chris.");
        sb.append(" ");
        sb.append("Hello everybody!");

        System.out.println(sb);

        StringBuilder s = new StringBuilder();
        s.append("My name is Skrollex.")
                .append(" ")
                .append("I'm a musician xd.");

        System.out.println(s);

        System.out.print("Some text here. This is tab\t This is new line\n More text.");
        System.out.println("Text text text...");

        System.out.printf("Cost is: %-10d; quantity is: %d\n", 5,10);

        //without formatting
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d: %s\n",i, "text text text");
        }
        System.out.println("\n\n");

        //with formatting
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%2d: %s\n",i, "text text text");
        }
    }
}
