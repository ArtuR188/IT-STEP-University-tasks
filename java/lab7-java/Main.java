import java.util.*;

// Task 1: Library Management System
class Book {
    String title, author, genre;
    int year;

    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " | Author: " + author + " | Genre: " + genre + " | Year: " + year);
    }
}

class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.title.equals(title));
    }

    public void searchByGenre(String genre) {
        for (Book book : books) {
            if (book.genre.equalsIgnoreCase(genre)) {
                book.displayInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("All books in library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

// Task 2: Student Group Management
class Student {
    String name;
    String groupNumber;
    double averageScore;

    public Student(String name, String groupNumber, double averageScore) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.averageScore = averageScore;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + " | Group: " + groupNumber + " | Score: " + averageScore);
    }
}

class Group {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.name.equals(name));
    }

    public void searchByScore(double threshold) {
        for (Student student : students) {
            if (student.averageScore > threshold) {
                student.displayInfo();
            }
        }
    }

    public void displayAllStudents() {
        System.out.println("All students in group:");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

// Task 3: Unique Website Visitors
class Visitor {
    String ipAddress, browser;
    Date visitTime;

    public Visitor(String ipAddress, String browser) {
        this.ipAddress = ipAddress;
        this.browser = browser;
        this.visitTime = new Date();
    }
}

class WebsiteAnalytics {
    private final Set<String> uniqueVisitors = new HashSet<>();

    public void addVisitor(Visitor visitor) {
        uniqueVisitors.add(visitor.ipAddress);
    }

    public int getUniqueVisitorCount() {
        return uniqueVisitors.size();
    }

    public void displayVisitors() {
        System.out.println("Unique IP addresses:");
        for (String ip : uniqueVisitors) {
            System.out.println(ip);
        }
    }
}

// Testing the program
public class Main {
    public static void main(String[] args) {
        // Library testing
        Library library = new Library();
        library.addBook(new Book("Ukraine: A History", "Serhii Plokhy", "History", 2015));
        library.addBook(new Book("The Gates of Europe", "Serhii Plokhy", "History", 2017));
        library.addBook(new Book("Java for Beginners", "John Smith", "Programming", 2020));

        System.out.println("Books in History genre:");
        library.searchByGenre("History");

        System.out.println("\nRemoving 'The Gates of Europe'...");
        library.removeBook("The Gates of Europe");

        library.displayAllBooks();

        // Student testing
        Group group = new Group();
        group.addStudent(new Student("Artur", "CS-101", 85.5));
        group.addStudent(new Student("Vladislav", "CS-102", 90.0));
        group.addStudent(new Student("Olena", "CS-103", 88.0));

        System.out.println("\nStudents with an average score above 85:");
        group.searchByScore(85);

        System.out.println("\nRemoving 'Olena'...");
        group.removeStudent("Olena");

        group.displayAllStudents();

        // Visitor testing
        WebsiteAnalytics analytics = new WebsiteAnalytics();
        analytics.addVisitor(new Visitor("192.168.1.1", "Chrome"));
        analytics.addVisitor(new Visitor("192.168.1.2", "Firefox"));
        analytics.addVisitor(new Visitor("192.168.1.1", "Chrome")); // duplicate IP

        System.out.println("\nUnique visitor count: " + analytics.getUniqueVisitorCount());
        analytics.displayVisitors();
    }
}
