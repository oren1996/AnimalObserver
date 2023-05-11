/**
 * This class represents a Monkey.
 * Each monkey has two methods eat() and watch().
 */
public class Monkey implements Animal {
    @Override
    public void eat() {
        System.out.println("The monkey is eating a banana...");
    }

    @Override
    public void watch() {
        System.out.println("The monkey is hanging on trees...");
    }

    @Override
    public String toString(){
        return "Monkey";
    }
}
