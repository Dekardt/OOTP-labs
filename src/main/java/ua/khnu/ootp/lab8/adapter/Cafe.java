package ua.khnu.ootp.lab8.adapter;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Cafe implements FoodDelivery {

    @Override
    public void orderFood(String string) {
        log.info("Ordered %s from Cafe".formatted(string));
    }
}
