package java_oop.lesson7_8.comparable_pair;

public class ComparableRunner {
    public static void main(String[] args) {
        ComparablePair names = new ComparablePair<>("Alexander", "Bob");
        System.out.println(names.smaller()); // Bob
    }
}
