package java_oop.lesson7_8.cleaner;

import java.util.function.Predicate;

public class StringRemover implements Predicate<String> {

    private String s;

    public StringRemover(String s) {
        this.s = s;
    }

    @Override
    public boolean test(String s) {
        return s.equals(this.s);
    }
}
