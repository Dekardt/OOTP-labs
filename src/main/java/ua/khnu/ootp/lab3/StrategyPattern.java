package ua.khnu.ootp.lab3;

import lombok.extern.log4j.Log4j2;
import ua.khnu.ootp.lab3.cooking.Chef;
import ua.khnu.ootp.lab3.cooking.cutting.DiceStrategy;
import ua.khnu.ootp.lab3.cooking.cutting.SlicerStrategy;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class StrategyPattern {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>(List.of("Onion", "Carrot", "Cucumber"));

        Chef chef = new Chef();
        chef.setProducts(products);

        List<String> dicedProducts = chef.cut(new DiceStrategy());
        log.info(dicedProducts);

        List<String> slicedProducts = chef.cut(new SlicerStrategy());
        log.info(slicedProducts);
    }
}
