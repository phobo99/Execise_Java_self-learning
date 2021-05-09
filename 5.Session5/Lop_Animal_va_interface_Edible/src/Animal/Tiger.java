package Animal;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Tiger: roarrr!";
    }
    @Override
    public String howToEat(){
        return "  nấu cao lôn hehehe !!!!";
    }
}