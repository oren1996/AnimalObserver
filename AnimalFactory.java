import java.util.Scanner;

/**
 * Abstract class which presents the method createAnimal that each Animal factory has to use.
 */
public abstract class AnimalFactory {
    public abstract Animal createAnimal();
}

/**
 * Class that creates A unicorn
 */
class UnicornFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Unicorn();
    }
}

/**
 * Class that creates A Zebra
 */
class ZebraFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Zebra();
    }
}

/**
 * Class that creates A Monkey
 */
class MonkeyFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Monkey();
    }
}


/**
 * Class That create a new animal
 * You should enter the name the animal spices,
 * its kind of food and its kind of show.
 */
class UnspecifiedAnimalFactory extends AnimalFactory{
    @Override
    public  Animal createAnimal(){
        System.out.println("Please enter the name of the animal species:");
        Scanner scanner = new Scanner(System.in);
        String kindOfAnimal = scanner.nextLine();
        System.out.println("Please enter the kind of food that your animal eat:");
        String kindOfFood = scanner.nextLine();
        System.out.println("Please enter what kind of show your animal do:");
        String kindOfShow = scanner.nextLine();
        return new UnspecifiedAnimal(kindOfAnimal, kindOfFood, kindOfShow);
    }
}
