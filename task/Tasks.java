package java_oop.lesson7_8.task;

import java_oop.lesson7_8.filter.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    private final List<Task> tasks = new ArrayList<>();

    public Tasks() {
    }

    public Tasks(List<Task> tasks){
        this.tasks.addAll(tasks);
    }

    public void add(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<String> getTasksNames(){
        ArrayList<String> names = new ArrayList<>();
        for(Task elem: tasks){
            names.add(elem.getName());
        }
        return names;
    }

    public void sort(Comparator<Task> comparator){

        tasks.sort(comparator);
    }

    public Tasks filter(Predicate<Task> predicate){
        List<Task> taskList = Filter.filter(tasks, predicate);
        return new Tasks(taskList);
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
