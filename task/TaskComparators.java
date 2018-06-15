package java_oop.lesson7_8.task;

import java.util.Comparator;

public class TaskComparators {
    public static Comparator<Task> byName(){
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
    public static Comparator<Task> byDeadline(){
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getDeadline().getDayOfYear() - o2.getDeadline().getDayOfYear();
            }
        };
    }
    public static Comparator<Task> byPriority(){
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getPriority().compareTo(o2.getPriority());
            }
        };
    }

}
