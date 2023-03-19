package ua.khnu.ootp.lab6.interpreter;

import lombok.RequiredArgsConstructor;
import ua.khnu.ootp.core.food.Food;

@RequiredArgsConstructor
public class FoodItemExpression implements FoodExpression {

    private final Food food;

    @Override
    public String interpret() {
        return food.getClass().getSimpleName();
    }
}
