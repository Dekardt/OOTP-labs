package ua.khnu.ootp.lab7;

import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.core.food.Pasta;

@Log4j2
public class MementoPattern {

    public static void main(String[] args) {
        Pasta pasta = new Pasta(0, "cheese");

        PastaMemento pastaMemento = new PastaMemento();
        pastaMemento.save(pasta);

        log.info("Before save");
        log.info("Sauce is " + pasta.getSauce());

        log.info("Apply modification");
        pasta.setSauce("garlic");
        log.info("Sauce is " + pasta.getSauce());

        log.info("After restore");
        pasta = pastaMemento.restore();
        log.info("Sauce is " + pasta.getSauce());
    }
}
