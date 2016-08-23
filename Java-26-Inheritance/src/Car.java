/**
 * Created by chris on 23.08.16.
 */
public class Car extends Machine {
    public void wipeWindShields() {
        System.out.println("Wiping windshields");
    }

    public void start() {
        System.out.println(this);
        System.out.println("Car started");
    }
}
