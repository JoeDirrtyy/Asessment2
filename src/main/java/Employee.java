public abstract class Employee extends Customer {
    private final double DISCOUNT = 0.10;

    public Employee(String name, Clothing[] clothing, char size) {
        super(name, clothing, size);
    }



    public double getDiscount() {
        return DISCOUNT;
    }
    abstract void printEmpPriceAfterDic(Clothing clothing);


}
