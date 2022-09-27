public class Manager extends Employee implements IDiscountable{

   private final double discount = .25;

    public Manager(String name, char size) {
        super(name, size);
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return 0;
    }

}
