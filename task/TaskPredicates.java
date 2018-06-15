package java_oop.lesson7_8.task;

import java.time.LocalDateTime;
import java.util.function.Predicate;

public class TaskPredicates {
    public static Predicate<Task> nameContains(String substring){
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getName().contains(substring);
            }
        };
    }
    public static Predicate<Task> hasExpiredDeadline(){
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getDeadline().isBefore(LocalDateTime.now());
            }
        };
    }

    public static Predicate<Task> hasPriority(Priority priority){
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getPriority().equals(priority);
            }
        };
    }
}
