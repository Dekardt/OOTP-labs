package ua.khnu.ootp.lab5;

import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.core.food.Borshch;
import ua.khnu.ootp.core.food.Food;
import ua.khnu.ootp.core.food.Pasta;

import java.util.List;

@Log4j2
public class IteratorPattern {
    public static void main(String[] args) {
        List<Food> order = List.of(new Borshch(), new Pasta(), new Pasta());

        FoodCollection foodCollection = new FoodCollection(order);

        log.info("Start straight cooking");

        FoodIterator straightIterator = foodCollection.getStraightIterator();
        while (straightIterator.hasNext()) {
            Food food = straightIterator.next();
            food.cook();
        }

        log.info("Start reversed cooking");

        FoodIterator reversedIterator = foodCollection.getReversedIterator();
        while (reversedIterator.hasNext()) {
            Food food = reversedIterator.next();
            food.cook();
        }
    }
}
