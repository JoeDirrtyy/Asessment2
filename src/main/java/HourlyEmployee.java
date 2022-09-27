public class HourlyEmployee extends Employee implements IDiscountable{
    public HourlyEmployee(String name, char size) {
        super(name, size);
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return 0;
    }
}
