package mypackage;

class One {
    int a;
    double b;
    String c;

    One(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void displayInfo() {
        System.out.println("One: " + a + ", " + b + ", " + c);
    }

    int sumValues() {
        return a + (int) b;
    }
}

class Two {
    double x;
    int y;
    boolean z;

    Two(double x, int y, boolean z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void printStatus() {
        System.out.println("Two: " + x + ", " + y + ", " + z);
    }

    double multiplyValues() {
        return x * y;
    }
}

class Three {
    String name;
    int age;
    One obj;

    Three(String name, int age, One obj) {
        this.name = name;
        this.age = age;
        this.obj = obj;
    }

    void showInfo() {
        System.out.println("Three: " + name + ", " + age);
        obj.displayInfo();
    }

    void processOtherClass(Two anotherObj) {
        System.out.println("Processing Two instance: " + anotherObj.multiplyValues());
    }
}

public class MainClass {
    public static void main(String[] args) {
        One obj1 = new One(5, 10.5, "Hello");
        Two obj2 = new Two(2.5, 4, true);
        Three obj3 = new Three("Alice", 25, obj1);

        obj1.displayInfo();
        System.out.println("Sum: " + obj1.sumValues());

        obj2.printStatus();
        System.out.println("Multiplication: " + obj2.multiplyValues());

        obj3.showInfo();
        obj3.processOtherClass(obj2);
    }
}

