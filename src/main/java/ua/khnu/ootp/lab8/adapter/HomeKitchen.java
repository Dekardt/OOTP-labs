package ua.khnu.ootp.lab8.adapter;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HomeKitchen {

    public String buyNeededProductsFor(String food) {
        return "Products for: " + food;
    }

    public void cookFoodFrom(String food, String products) {
        log.info("Cooking {%s} from {%s}".formatted(food, products));
    }
}
