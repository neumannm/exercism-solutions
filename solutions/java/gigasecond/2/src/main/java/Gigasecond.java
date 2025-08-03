import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final int SECONDS_IN_GIGASECOND = 1_000_000_000;

    private LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(SECONDS_IN_GIGASECOND);
    }

    LocalDateTime getDateTime() {
        return this.dateTime;
    }

}
