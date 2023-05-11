/**
 * This class represents a Zebra.
 * Each zebra has two methods eat() and watch().
 */
public class Zebra implements Animal {
    @Override
    public void eat() {
        System.out.println("The zebra is eating grass...");
    }

    @Override
    public void watch() {
        System.out.println("The zebra is running...");
    }

    @Override
    public String toString(){
        return "Zebra";
    }
}
