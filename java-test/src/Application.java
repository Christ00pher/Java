import java.util.Scanner;
/**
 * Created by chris on 18.08.16.
 */
public class Application {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command: ");
        String com = input.nextLine();

        switch (com)
        {
            case "start":
                System.out.println("Machine started");
                break;
            case "stop":
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Command was not recognized");
                break;
        }
    }
}
