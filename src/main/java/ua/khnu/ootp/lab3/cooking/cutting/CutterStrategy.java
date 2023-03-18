package ua.khnu.ootp.lab3.cooking.cutting;

import java.util.List;

public interface CutterStrategy {
    List<String> cut(List<String> products);
}
