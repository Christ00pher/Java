/**
 * Created by chris on 23.08.16.
 */
public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.wipeWindShields();
        car1.showInfo();
    }
}
