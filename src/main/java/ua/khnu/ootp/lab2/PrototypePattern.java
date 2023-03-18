package ua.khnu.ootp.lab2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.core.food.Borshch;
import ua.khnu.ootp.core.food.Food;
import ua.khnu.ootp.core.food.FoodType;
import ua.khnu.ootp.core.food.Pasta;

import java.util.EnumMap;
import java.util.List;

@Log4j2
public class PrototypePattern {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class FoodCache {
        private static final EnumMap<FoodType, Food> foodMap = new EnumMap<>(FoodType.class);

        public static Food getFood(FoodType foodType) {
            return foodMap.get(foodType).clone();
        }

        public static void initCache() {
            Borshch borshch = new Borshch("pork");
            foodMap.put(FoodType.BORSHCH, borshch);

            Pasta pasta = new Pasta("garlic");
            foodMap.put(FoodType.PASTA, pasta);
        }
    }

    public static void main(String[] args) {
        List<FoodType> order = List.of(FoodType.PASTA, FoodType.BORSHCH, FoodType.BORSHCH, FoodType.BORSHCH, FoodType.BORSHCH, FoodType.PASTA);

        log.info("Start food cache initialisation");
        FoodCache.initCache();
        log.info("Finished food cache initialisation");

        log.info("Start cooking process");
        List<Food> cookingList = order.stream().map(FoodCache::getFood).toList();
        for(Food food : cookingList) {
            food.cook();
        }
        log.info("Finished cooking process");
    }
}
