package java_oop.lesson7_8.binary_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearchRunner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
        System.out.println(BinarySearch.binarySearch(list, 12, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }));
    }
}
