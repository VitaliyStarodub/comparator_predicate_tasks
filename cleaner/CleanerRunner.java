package java_oop.lesson7_8.cleaner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CleanerRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList( "one", "two", null, "three"));
        System.out.println("Before removing: " + list);
        Cleaner.removeNulls(list);
        System.out.println("After null removing :" + list);
        Cleaner.remove(list, new StringRemover("one"));
        System.out.println("After string removing: " + list);
    }
}
