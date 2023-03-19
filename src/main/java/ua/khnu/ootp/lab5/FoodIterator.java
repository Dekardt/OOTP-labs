package ua.khnu.ootp.lab5;

import ua.khnu.ootp.core.food.Food;

public interface FoodIterator {

    boolean hasNext();

    Food next();

    void reset();
}
