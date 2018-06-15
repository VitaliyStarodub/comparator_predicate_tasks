package java_oop.lesson7_8.binary_search;

import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator){
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
            int low = 0;
            int high = list.size();
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if(comparator.compare(elem, list.get(mid)) == 0){
                    return mid;
                }
                if(comparator.compare(elem, list.get(mid)) < 0){
                    high = mid;
                    }
                    else {
                        low = mid + 1;
                    }

            }
        return -(high + 1);
    }
}
