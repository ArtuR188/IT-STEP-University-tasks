package mypackage;

class One {
    private int a;
    private double b;
    private String c;

    One(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    One(double a, double b, String c) {
        this.a = (int) a;
        this.b = b;
        this.c = c;
    }

    One(One another) {
        this.a = another.a;
        this.b = another.b;
        this.c = another.c;
    }

    One() {
        this.a = 0;
        this.b = 0.0;
        this.c = "Default";
    }

    void displayInfo() {
        System.out.println("One: " + a + ", " + b + ", " + c);
    }

    double sumValues(double x) {
        return a + b + x;
    }

    int sumValues() {
        return a + (int) b;
    }

    static void printStatic() {
        System.out.println("Static method in One");
    }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
    public double getB() { return b; }
    public void setB(double b) { this.b = b; }
    public String getC() { return c; }
    public void setC(String c) { this.c = c; }
}

class Two {
    private double x;
    private int y;
    private boolean z;

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

    static void printStatic() {
        System.out.println("Static method in Two");
    }
}

class Three {
    private String name;
    private int age;
    private One obj;

    Three(String name, int age, One obj) {
        this.name = name;
        this.age = age;
        this.obj = obj;
    }

    void showInfo() {
        System.out.println("Three: " + name + ", " + age);
        obj.displayInfo();
    }

    void showInfo(Two anotherObj) {
        System.out.println("Three with Two: " + name + ", " + age);
        anotherObj.printStatus();
    }
}

public class MainClass {
    public static void main(String[] args) {
        One obj1 = new One(5, 10.5, "Hello");
        One obj2 = new One(7.5, 12.3, "World");
        One obj3 = new One(obj1);
        One obj4 = new One();

        Two obj5 = new Two(2.5, 4, true);
        Three obj6 = new Three("Alice", 25, obj1);

        obj1.displayInfo();
        System.out.println("Sum: " + obj1.sumValues(5.5));

        obj2.displayInfo();
        obj3.displayInfo();
        obj4.displayInfo();

        obj5.printStatus();
        System.out.println("Multiplication: " + obj5.multiplyValues());

        obj6.showInfo();
        obj6.showInfo(obj5);

        One.printStatic();
        Two.printStatic();
    }
}
