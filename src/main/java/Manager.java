public  class Manager extends Employee implements IDiscountable{

   private final double DISCOUNT = 0.25;

    public Manager(String name, Clothing[] clothing, char size) {
        super(name, clothing, size);
    }

    public double getDiscount(){
        return DISCOUNT;
    }

    @Override
    void printEmpPriceAfterDic(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * DISCOUNT;
    }



}
