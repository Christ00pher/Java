public class Field {
    private Plant plant = new Plant();

    //size is protected and Field is in the same package as Plant.
    public Field() {
        System.out.println(plant.size);
    }
}
