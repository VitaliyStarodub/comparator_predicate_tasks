package java_oop.lesson7_8.cleaner;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Cleaner {
    static void removeNulls(Collection<?> collection){
        for(Iterator<?> iterator = collection.iterator(); iterator.hasNext(); ){
            if(iterator.next() == null){
                iterator.remove();
            }
        }
    }
    static <T> void remove(Collection<T> collection, Predicate<T> predicate){
        for(Iterator<T> iterator = collection.iterator(); iterator.hasNext(); ){
            if(predicate.test(iterator.next())){
                iterator.remove();
            }
        }
    }
}
