interface Client {
    double getDiscount();
}

class Regular implements Client {
    public double getDiscount() {
        return 0;
    }
}

class VIP implements Client {
    public double getDiscount() {
        return 20;
    }
}

class Partner implements Client {
    public double getDiscount() {
        return 15;
    }
}

class DiscountService {
    void apply(Client c) {
        System.out.println("Discount: " + c.getDiscount() + "%");
    }
}

public class OCPExample {
    public static void main(String[] args) {
        DiscountService s = new DiscountService();
        s.apply(new Regular());
        s.apply(new VIP());
        s.apply(new Partner());
    }
}
