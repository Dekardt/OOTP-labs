package ua.khnu.core.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.time.Duration;

@Log4j2
@UtilityClass
public class TimeUtils {

    public static final Duration FIVE_SECONDS = Duration.ofSeconds(5);
    public static final Duration TEN_SECONDS = Duration.ofSeconds(10);
    public static final Duration HALF_MINUTE = Duration.ofSeconds(30);
    public static final Duration ONE_MINUTE = Duration.ofSeconds(60);


    public void waitFor(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            log.error("Exception during wait for {%s}".formatted(duration), e);
            Thread.currentThread().interrupt();
        }
    }

    public void waitInSeconds(int seconds) {
        waitFor(Duration.ofSeconds(seconds));
    }
}
