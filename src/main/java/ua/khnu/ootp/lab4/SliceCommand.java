package ua.khnu.ootp.lab4;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class SliceCommand implements Command {

    private final String product;

    @Override
    public void execute() {
        log.info("Start slicing " + product);
    }

    @Override
    public void undo() {
        log.info("Stop slicing " + product);
    }
}
