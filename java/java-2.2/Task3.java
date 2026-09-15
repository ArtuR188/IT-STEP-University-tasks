public class Task3 {
    public static void main(String[] args) {
        int floor = 2;
        String direction = "вгору";

        if (!direction.equals("вгору") && !direction.equals("вниз")) {
            System.out.println("Невірний напрямок!");
            return;
        }

        if (floor < 1 || floor > 9) {
            System.out.println("Невірний поверх!");
            return;
        }

        if (direction.equals("вгору")) {
            System.out.println("Ви піднялись на " + (floor == 2 ? 3 : floor) + " поверх");
        } else {
            System.out.println("Ви спустились на " + (floor == 2 ? 1 : floor) + " поверх");
        }
    }
}
