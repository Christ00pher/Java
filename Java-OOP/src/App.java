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
    }
}
