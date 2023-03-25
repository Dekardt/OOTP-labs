package ua.khnu.ootp.lab8.decorator;

import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.core.food.Food;

@Log4j2
public class Salt extends CondimentDecorator {

    public Salt(Food food) {
        super(food);
    }

    @Override
    public void cook() {
        log.info("Added salt");
        food.cook();
    }
}
