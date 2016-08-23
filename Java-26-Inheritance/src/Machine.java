/**
 * Created by chris on 23.08.16.
 */
public class Machine {
    protected String s = "Machine I";
    public void start() {
        System.out.println(this);
        System.out.println("Machine started");
    }
    public void stop() {
        System.out.println(this);
        System.out.println("Machine stopped");
    }
}
