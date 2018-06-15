package java_oop.lesson7_8.max;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxRunner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-20, -10);
        Integer biggestInteger = Max.max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(biggestInteger);

        List<String> names = Arrays.asList("Bob", "Alexander", "Sophia", "Zoe");
        String longestName = Max.max(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(longestName); // Alexander

        List<LocalDate> birthDays = Arrays.asList(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1986, 3, 15),
                LocalDate.of(1990, 10, 3),
                LocalDate.of(1990, 2, 26)
        );
        LocalDate latestBirthDayInYear = Max.max(birthDays, new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                return o1.getDayOfYear() - o2.getDayOfYear();
            }
        });
        System.out.println(latestBirthDayInYear);
    }
}
