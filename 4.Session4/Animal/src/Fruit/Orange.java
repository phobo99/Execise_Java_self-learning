package Fruit;

import Animal.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Orange co the lam nuoc cam";
    }
}