package ua.khnu.lab1;

import java.util.List;

public class FactoryPattern {
    public interface Food {
        void cook();
    }

    private enum FoodType {
        PASTA,
        BORSHCH,
        PIZZA
    }

    public static class Pasta implements Food {
        @Override
        public void cook() {
            System.out.println("Cooking pasta");
        }
    }

    public static class Borshch implements Food {
        @Override
        public void cook() {
            System.out.println("Cooking borshch");
        }
    }

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