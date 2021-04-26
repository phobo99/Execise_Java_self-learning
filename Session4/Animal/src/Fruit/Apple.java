package Fruit;

import Animal.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "apple an rat ngon";
    }
}
