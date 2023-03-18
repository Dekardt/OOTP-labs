package ua.khnu.core.food;

import lombok.extern.log4j.Log4j2;

import static ua.khnu.core.utils.TimeUtils.*;

@Log4j2
public class Borshch implements Food {

    private String meatType;

    public Borshch() {
        this("pork");
    }

    public Borshch(String meatType) {
        log.info("Start simulation of borsch preparing");
        waitInSeconds(3);
        this.meatType = meatType;
        log.info("Borsch is prepared for cooking");
    }

    private Borshch(Borshch borshch) {
        this.meatType = borshch.meatType;
        log.info("Borsch is prepared for cooking");
    }

    @Override
    public void cook() {
        log.info("Cooking borshch");
    }

    @Override
    public Food clone() {
        return new Borshch(this);
    }

}
