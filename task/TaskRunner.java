package java_oop.lesson7_8.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TaskRunner {
    public static void main(String[] args) {
        LocalDateTime deadlineOne = LocalDateTime.of(LocalDate.of(2018, 6, 12),
                                                    LocalTime.of(20,0));
        LocalDateTime deadlineTwo = LocalDateTime.of(LocalDate.of(2018, 7, 1),
                                                        LocalTime.of(20, 0));
        LocalDateTime deadlineThree = LocalDateTime.of(LocalDate.of(2018, 8, 1),
                                                        LocalTime.of(20, 0));

        Task taskOne = new Task(123123, "Work", "Do some work", deadlineOne, Priority.MAJOR);
        Task taskTwo = new Task(98797, "Rest", "Get some rest", deadlineTwo, Priority.NORMAL);
        Task taskThree = new Task(654654, "Cinema", "Watch movies", deadlineThree, Priority.MINOR);

        Tasks tasks = new Tasks();
        tasks.add(taskOne);
        tasks.add(taskTwo);
        tasks.add(taskThree);

        System.out.println("Before name sorting: " + tasks.getTasks());

        tasks.sort(TaskComparators.byName());

        System.out.println("After name sorting: " + tasks.getTasks());

        tasks.sort(TaskComparators.byDeadline());
        System.out.println("After deadline sorting: " + tasks.getTasks());

        tasks.sort(TaskComparators.byPriority());
        System.out.println("After priority sorting: " + tasks.getTasks());

        System.out.println("Filter by name: " + tasks.filter(TaskPredicates.nameContains("Work")));

        System.out.println("Tasks with expired date: " + tasks.filter(TaskPredicates.hasExpiredDeadline()).getTasksNames());
        System.out.println("Task with priority MINOR: " + tasks.filter(TaskPredicates.hasPriority(Priority.MINOR)).getTasksNames());
    }
}
