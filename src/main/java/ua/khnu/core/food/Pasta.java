package ua.khnu.core.food;

import lombok.extern.log4j.Log4j2;
import static ua.khnu.core.utils.TimeUtils.*;

@Log4j2
public class Pasta implements Food  {

    private String sauce;

    public Pasta() {
        this("garlic");
    }

    public Pasta(String sauce) {
        log.info("Start simulation of pasta preparing");
        waitInSeconds(5);
        this.sauce = sauce;
        log.info("Pasta is prepared for cooking");
    }

    private Pasta(Pasta pasta) {
        this.sauce = pasta.sauce;
        log.info("Pasta is prepared for cooking");
    }

    @Override
    public void cook() {
        log.info("Cooking pasta");
    }

    @Override
    public Food clone() {
        return new Pasta(this);
    }
}
