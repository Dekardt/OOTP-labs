package ua.khnu.ootp.lab6.interpreter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FoodAndExpression implements FoodExpression {

    FoodExpression[] foodExpressions;

    public FoodAndExpression(FoodItemExpression... expressions) {
        this.foodExpressions = expressions;
    }

    @Override
    public String interpret() {
        return Arrays.stream(foodExpressions).map(FoodExpression::interpret).collect(Collectors.joining(" and "));
    }
}
