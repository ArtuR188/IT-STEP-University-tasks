class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {}

class Penguin {
    void walk() {
        System.out.println("Walking");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.walk();
    }
}
