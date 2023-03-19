package ua.khnu.ootp.lab6.interpreter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FoodOrExpression implements FoodExpression {

    FoodExpression[] foodExpressions;

    public FoodOrExpression(FoodItemExpression... expressions) {
        this.foodExpressions = expressions;
    }

    @Override
    public String interpret() {
        return Arrays.stream(foodExpressions).map(f -> f.getClass().getSimpleName()).collect(Collectors.joining(" or "));
    }
}
