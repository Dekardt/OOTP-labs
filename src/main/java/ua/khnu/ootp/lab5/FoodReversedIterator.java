package ua.khnu.ootp.lab5;

import ua.khnu.ootp.core.food.Food;

import java.util.List;

public class FoodReversedIterator implements FoodIterator {

    private final List<Food> foodList;
    private int currentIndex;

    public FoodReversedIterator(List<Food> foodList) {
        this.foodList = List.copyOf(foodList);
        currentIndex = foodList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Food next() {
        if (!hasNext()) {
            return null;
        }
        Food foundItem = foodList.get(currentIndex);
        currentIndex--;
        return foundItem;
    }


    @Override
    public void reset() {
        this.currentIndex = foodList.size() - 1;
    }
}
