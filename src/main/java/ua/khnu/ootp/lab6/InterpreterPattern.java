package ua.khnu.ootp.lab6;

import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.core.food.Borshch;
import ua.khnu.ootp.core.food.Pasta;
import ua.khnu.ootp.lab6.interpreter.FoodAndExpression;
import ua.khnu.ootp.lab6.interpreter.FoodItemExpression;
import ua.khnu.ootp.lab6.interpreter.FoodOrExpression;

@Log4j2
public class InterpreterPattern {

    public static void main(String[] args) {
        FoodItemExpression foodItemExpression = new FoodItemExpression(new Pasta());
        FoodItemExpression foodItemExpression1 = new FoodItemExpression(new Borshch());

        log.info("Start interpretation");
        FoodAndExpression foodAndExpression = new FoodAndExpression(foodItemExpression, foodItemExpression1);
        log.info(foodAndExpression.interpret());

        FoodOrExpression foodOrExpression = new FoodOrExpression(foodItemExpression, foodItemExpression1);
        log.info(foodOrExpression.interpret());
    }
}
