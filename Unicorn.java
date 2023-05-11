/**
 * This class represents a Unicorn.
 *  Each unicorn has two methods eat() and watch().
 */
public class Unicorn implements Animal{
    @Override
    public void eat() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    @Override
    public void watch() {
        System.out.println("The unicorn is flying...");
    }

    @Override
    public String toString(){
        return "Unicorn";
    }
}
