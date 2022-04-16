package ss7_AbstractClassAndInterface.thuchanh.animal_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return null;
    }
}