package java_oop.lesson7_8.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){

        List<T> predictateList = new ArrayList<>();
        for(T elem: list){
            if(predicate.test(elem)){
                predictateList.add(elem);
            }
        }
        return predictateList;
    }
}
