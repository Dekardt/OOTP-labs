package ua.khnu.lab1;

import ua.khnu.core.food.Borshch;
import ua.khnu.core.food.Food;
import ua.khnu.core.food.FoodType;
import ua.khnu.core.food.Pasta;

import java.util.List;

public class FactoryPattern {

    // FoodFactory - This is the factory class that creates Food objects based on a given type.
    public static class FoodFactory {
        public Food createFood(FoodType type) {
            return switch (type) {
                case PASTA -> new Pasta();
                case BORSHCH -> new Borshch();
                default -> throw new IllegalArgumentException("Can't provide object for: " + type);
            };
        }
    }

    public static void main(String[] args) {
        List<FoodType> order = List.of(FoodType.PASTA, FoodType.BORSHCH);

        FoodFactory foodFactory = new FoodFactory();
        List<Food> cookingList = order.stream().map(foodFactory::createFood).toList();
        for(Food food : cookingList) {
            food.cook();
        }
    }
}