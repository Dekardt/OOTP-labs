package ua.khnu.ootp.lab8.decorator;

import lombok.AllArgsConstructor;
import ua.khnu.ootp.core.food.Food;

@AllArgsConstructor
public class CondimentDecorator implements Food {

    protected Food food;

    @Override
    public void cook() {
        food.cook();
    }

    @Override
    public Food clone() {
        return food.clone();
    }
}
