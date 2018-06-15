package java_oop.lesson7_8.filter;

import java.time.LocalDate;
import java.util.Locale;
import java.util.function.Predicate;

public class DateAfterPredictate implements Predicate<LocalDate> {

    private final LocalDate minDate;

    public DateAfterPredictate(LocalDate minDate) {
        this.minDate = minDate;
    }

    @Override
    public boolean test(LocalDate localDate) {
        return localDate.compareTo(minDate) > 0;
    }
}
