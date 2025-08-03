import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final Duration GIGASECOND  = Duration.ofSeconds(1_000_000_000);

    private LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plus(GIGASECOND);
    }

    LocalDateTime getDateTime() {
        return this.dateTime;
    }

}
