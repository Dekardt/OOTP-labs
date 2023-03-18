package ua.khnu.core.food;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Borshch implements Food {

    @Override
    public void cook() {
        log.info("Cooking borshch");
    }
}
