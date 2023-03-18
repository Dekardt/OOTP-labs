package ua.khnu.ootp.lab3.cooking.cutting;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class SlicerStrategy implements CutterStrategy {

    @Override
    public List<String> cut(List<String> products) {
        return products.stream().map(p -> "Sliced " + p).collect(Collectors.toList());
    }
}
