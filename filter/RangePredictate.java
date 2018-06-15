package java_oop.lesson7_8.filter;

import java.util.function.Predicate;

public class RangePredictate implements Predicate<Integer>{
    private final int min;
    private final int max;

    public RangePredictate(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean test(Integer integer) {
        return integer >= min && integer <= max;
    }
}
