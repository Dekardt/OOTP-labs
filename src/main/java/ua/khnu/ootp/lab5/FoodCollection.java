package ua.khnu.ootp.lab5;

import lombok.RequiredArgsConstructor;
import ua.khnu.ootp.core.food.Food;

import java.util.List;

@RequiredArgsConstructor
public class FoodCollection {

    private final List<Food> foodList;

    public FoodIterator getStraightIterator() {
        return new FoodStraightIterator(foodList);
    }

    public FoodIterator getReversedIterator() {
        return new FoodReversedIterator(foodList);
    }
}
