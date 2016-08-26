package world;

public class Field {
    private Plant plant = new Plant();

    //size is protected and world.Field is in the same package as world.Plant.
    public Field() {
        System.out.println(plant.size);
    }
}
