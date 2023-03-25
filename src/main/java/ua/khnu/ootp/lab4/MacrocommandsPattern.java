package ua.khnu.ootp.lab4;

import java.util.List;

public class MacrocommandsPattern {

    public static void main(String[] args) {
        String product = "onion";
        CutCommand cutCommand = new CutCommand(product);
        SliceCommand sliceCommand = new SliceCommand(product);

        MacroCommand macroCommand = new MacroCommand(List.of(cutCommand, sliceCommand));
        macroCommand.execute();
    }
}
