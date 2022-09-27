public class Employee extends Customer {
    private final double discount = .10;

    public Employee(String name, char size) {
        super(name, size);
    }

    public double getDiscount() {
        return discount;
    }


}
