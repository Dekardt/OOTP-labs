package ua.khnu.ootp.lab8.decorator;

import ua.khnu.ootp.core.food.Borshch;
import ua.khnu.ootp.core.food.Food;

public class DecoratorPattern {

    public static void main(String[] args) {
        Food food = new Pepper(new Salt(new Borshch()));
        food.cook();
    }
}
