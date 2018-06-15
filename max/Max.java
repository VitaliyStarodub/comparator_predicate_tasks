package java_oop.lesson7_8.max;

import java.util.Comparator;
import java.util.List;

public class Max {

    static<T> T max(List<T> list, Comparator<T> comparator){
       if(list.isEmpty()){
           throw new IllegalArgumentException("List is Empty ");
       }
       T max = list.get(0);
       for (T elem: list){
           if(comparator.compare(elem, max) > 0){
               max = elem;
           }
       }
       return max;
    }
}
