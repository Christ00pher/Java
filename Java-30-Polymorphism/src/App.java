/**
 * Created by chris on 27.08.16.
 */
public class App {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Tree tree = new Tree();
        Plant plant2 = tree;

        plant1.grow();
        plant2.grow();

        tree.shedLeaves();
        //plant2.shedLeaves();
    }
}
