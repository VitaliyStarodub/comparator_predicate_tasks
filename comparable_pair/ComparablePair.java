package java_oop.lesson7_8.comparable_pair;

import java.util.Comparator;

public class ComparablePair<T extends  Comparable<? super T>> {
    private T objOne;
    private T objTwo;

    public ComparablePair(T objOne, T objTwo) {
        this.objOne = objOne;
        this.objTwo = objTwo;
    }

    public T bigger(){
        return objOne.compareTo(objTwo) >= 0 ? objOne : objTwo;
    }
    public T smaller(){
        return objOne.compareTo(objTwo) <= 0 ? objOne : objTwo;
    }
}

