class SpaceShip
{
    private String name;
    private double damage;
    private int id;
    private final static double SPEED = 10.0;
    public static int number = 0;

    SpaceShip()
    {
        name = "unit";
        damage = 0.0;
        id = number;
        number++;
    }

    SpaceShip(String name)
    {
        this.name = name;
        damage = 0.0;
        id = number;
        number++;
    }

    SpaceShip(String name, double damage)
    {
        this.name = name;
        this.damage = damage;
        id = number;
        number++;
    }

    void showInfo(){

        System.out.println("Name: " + name + "\n" +
                "Damage: " + damage + "\n" +
                "Speed: " + SPEED + '\n' +
                "Id: " + id + '\n');
    }
}

/**
 * Created by chris on 17.08.16.
 */
public class App {
    public static void main(String[] args) {

        System.out.println(SpaceShip.number);
        SpaceShip s1 = new SpaceShip();
        System.out.println(SpaceShip.number);
        SpaceShip s2 = new SpaceShip("Atom",10.5);
        System.out.println(SpaceShip.number);
        s1.showInfo();
        s2.showInfo();

        System.out.println(++SpaceShip.number);
    }
}
