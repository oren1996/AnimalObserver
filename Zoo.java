import java.util.ArrayList;

/**
 * This class represents a zoo.
 * In the zoo there are animals which are kept (represented) in a list.
 * The animals in the zoo can be happy or happy ona scale from 1 to 5.
 */
public class Zoo{
    ArrayList<Animal> animalArrayList = new ArrayList<>();
    ArrayList<ZooObserver> observers = new ArrayList<>();
    private static Zoo instance = null;
    protected int happinessLevel = 2;
    protected int hungerLevel = 3;

    /**
     * In this constructor we create a new zoo.
     * Because that our zoo is special and only one can be constructed,
     * We used The lazy initialization method of singleton.
     */
    private Zoo(){}
    public static Zoo getInstance(){
        if (instance == null){
            System.out.println("Creating zoo...");
            instance = new Zoo();
        }
        else {
            System.out.println("The zoo already exists...");
        }
        return instance;
    }

    /**
     * We are adding a new observer to the list of observers.
     * @param observer stand for the new observer.
     */
    void addObserver(ZooObserver observer){
        this.observers.add(observer);
    }

    /**
     * We are removing an observer to the list of observers.
     * @param observer stand for the removed observer.
     */
    void removeObserver(ZooObserver observer){
        this.observers.remove(observer);
    }


    /**
     * We keep people informed of what is happening in the zoo
     * @param info stands for the information that we want to share to the zooObserver
     */
    void notifyObservers(String info){
        for (ZooObserver observer:observers){
            observer.update(info);
        }
    }


    /**
     * We use this method to add a new animal in our zoo.
     * @param animal stands for the new animal that has been added.
     * Then we keep informed the observers of the news
     */
    void addAnimal(Animal animal){
        this.animalArrayList.add(animal);
        String info = animal.toString() + " has been added to the zoo!"; //new
        System.out.println("Notifying observers:");
        notifyObservers(info);
    }

    /**
     * We use this method to feed the animals in the zoo
     * Then we keep informed the observers of the news
     */
    void feedAnimals(){
        if (this.hungerLevel > 1){
            this.hungerLevel -= 1;
        }
        for (Animal animal : this.animalArrayList) {
            animal.eat();
        }
        String info = "The animals are being fed"; //new
        System.out.println("Notifying observers:");
        notifyObservers(info);
    }


    /**
     * We use this method to see the show of a animal
     * Then we keep informed the observers of the news
     */
    void watchAnimals(){
        if (this.happinessLevel < 5){
            this.happinessLevel += 1;
        }

        for (Animal animal : this.animalArrayList) {
            animal.watch();
        }
        if (this.hungerLevel < 5){
            this.hungerLevel += 1;
        }
        String info = "The animals are being watched"; //new
        System.out.println("Notifying observers:");
        notifyObservers(info);

    }

    /**
     * We share some information about the zoo:
     * -The total number of animals.
     * -The number of zebras.
     * -The number of monkeys.
     * -The number of unicorns.
     * -The happiness level of the animals in the zoo.
     * -The hunger level of the animals in the zoo.
     */
    void showAnimalsInfo(){
        int numberOfZebras = 0;
        int numberOfMonkeys = 0;
        int numberOfUnicorns = 0;
        int totalAnimalsNumber = 0;
        for (Animal animal: this.animalArrayList) {
            if (animal instanceof Zebra){
                numberOfZebras += 1;
            }
            else if (animal instanceof Monkey){
                numberOfMonkeys += 1;
            }
            else {
                numberOfUnicorns += 1;
            }
        }
        totalAnimalsNumber += numberOfMonkeys + numberOfZebras + numberOfUnicorns;
        System.out.println("The zoo contains total of " + totalAnimalsNumber + " animals:");
        System.out.println("- Zebra: " + numberOfZebras);
        System.out.println("- Unicorn: " + numberOfUnicorns);
        System.out.println("- Monkey: " + numberOfMonkeys);
        System.out.println("Happiness level: " + this.happinessLevel);
        if (this.happinessLevel < 3){
            System.out.println("The animals are not happy, you should watch them...");
        }
        else {
            System.out.println("The animals are very happy, keep working hard...");
        }
        System.out.println("Hunger level: " +this.hungerLevel);
        if (this.hungerLevel > 3){
            System.out.println("The animals are hungry, you should feed them...");
        }
    }
}

