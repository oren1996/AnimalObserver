/**
 * This class represents a species of animal.
 * Each animal has two methods eat() and watch().
 */
public class UnspecifiedAnimal implements Animal{
    public String kindOfAnimal;
    public String kindOfFood;
    public String kindOfShow;

    /**
     * Constructor that receive a name of animal, its type of food and its show's move.
     * @param kindOfAnimal stands for the name of species
     * @param kindOfFood stands for the kind of food
     * @param kindOfShow stand for the kind of show
     */
    public UnspecifiedAnimal(String kindOfAnimal, String kindOfFood, String kindOfShow){
        this.kindOfAnimal = kindOfAnimal;
        this.kindOfFood = kindOfFood;
        this.kindOfShow = kindOfShow;
    }

    @Override
    public void eat() {
        System.out.println("The " + kindOfAnimal + " is eating " + kindOfFood +   "...");
    }

    @Override
    public void watch() {
        System.out.println("The " + kindOfAnimal + " is " + kindOfShow +   "...");
    }

    @Override
    public String toString(){
        String name = kindOfAnimal;
        return name;
    }
}
