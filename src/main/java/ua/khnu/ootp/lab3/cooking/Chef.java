package ua.khnu.ootp.lab3.cooking;

import lombok.Getter;
import lombok.Setter;
import ua.khnu.ootp.lab3.cooking.cutting.CutterStrategy;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Chef {

    private List<String> products = new ArrayList<>();

    public List<String> cut(CutterStrategy cutterStrategy) {
        if (this.products.isEmpty()) {
            throw new IllegalStateException("There are no products to cut");
        }
        this.products = cutterStrategy.cut(products);
        return this.products;
    }
}
