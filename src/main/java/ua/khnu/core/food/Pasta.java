package ua.khnu.core.food;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Pasta implements Food  {

    @Override
    public void cook() {
        log.info("Cooking pasta");
    }
}
