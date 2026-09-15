import java.util.*;

class Student implements Comparable<Student> {
    int id, age;
    String name;
    double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.grade, this.grade);
    }

    @Override
    public String toString() {
        return id + ": " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();

    void add(Student s) { students.put(s.id, s); }
    void remove(int id) { students.remove(id); }
    void display(Comparator<Student> comp) {
        students.values().stream().sorted(comp).forEach(System.out::println);
    }

    void displayByAgeGroup() {
        Map<String, List<Student>> groups = new LinkedHashMap<>() {{
            put("18-20", new ArrayList<>());
            put("21-23", new ArrayList<>());
            put("24+", new ArrayList<>());
        }};
        students.values().forEach(s -> groups.get(s.age <= 20 ? "18-20" : s.age <= 23 ? "21-23" : "24+").add(s));
        groups.forEach((k, v) -> { System.out.println(k + ": " + v); });
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.add(new Student(1, "Artur", 19, 99.0));
        sm.add(new Student(2, "Vladislav", 22, 90.0));
        sm.add(new Student(3, "Olena", 25, 92.0));
        sm.add(new Student(4, "Maksym", 20, 88.0));

        System.out.println("By Grade:");
        sm.display(Comparator.naturalOrder());

        System.out.println("By Name:");
        sm.display(Comparator.comparing(s -> s.name));

        System.out.println("By Age:");
        sm.display(Comparator.comparingInt(s -> s.age));

        System.out.println("By Age Group:");
        sm.displayByAgeGroup();
    }
}