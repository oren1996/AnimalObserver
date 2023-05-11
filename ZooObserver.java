/**
 * This class represents a zooObserver
 * Each zooObserver has a name
 */
public class ZooObserver implements Observer{ //new
    protected String name;

    /**
     * Constructor that receives a string and save it as a name of a zooObserver
     * @param name stands for the name oa z zooObserver
     */
    public ZooObserver(String name) {
        this.name = name;
    }

    /**
     * We update the information
     * @param info stands for the new information
     */
    @Override
    public void update(String info) {
        System.out.println("[" + this.name + "] " + info);
    }
}
