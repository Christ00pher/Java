public class Plant {
    //Bad practice
    public String name;

    //Acceptable practice, 'cause variable is final
    public final static int ID = 8;

    private String type;

    protected String size;

    public Plant() {
        this.name = "Freddy";
        this.type = "Plant";
        this.size = "Medium";
    }
}
