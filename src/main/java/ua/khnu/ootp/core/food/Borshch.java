package ua.khnu.ootp.core.food;

import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.core.utils.TimeUtils;

@Log4j2
public class Borshch implements Food {

    private String meatType;

    public Borshch() {
        this(0, "pork");
    }

    public Borshch(int delay, String meatType) {
        log.info("Start simulation of borsch preparing");
        TimeUtils.waitInSeconds(delay);
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
