package ua.khnu.ootp.lab5;

import ua.khnu.ootp.core.food.Food;

import java.util.List;

public class FoodStraightIterator implements FoodIterator {

    private final List<Food> foodList;
    private int currentIndex = 0;

    public FoodStraightIterator(List<Food> foodList) {
        this.foodList = List.copyOf(foodList);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < foodList.size();
    }

    @Override
    public Food next() {
        if (!hasNext()) {
            return null;
        }
        Food foundItem = foodList.get(currentIndex);
        currentIndex++;
        return foundItem;
    }


    @Override
    public void reset() {
        this.currentIndex = 0;
    }
}
