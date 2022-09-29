import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





       Clothing clothing = new Clothing("Nike",20.00, 'M');
       Clothing clothing2 = new Clothing("Adidias",5.00,'L');
       Clothing clothing3 = new Clothing("Champion",30.00, 'M');

        Clothing [] managerCart = {clothing,clothing2,clothing3};
        Clothing [] employeeCart = {clothing,clothing2,clothing3};

       Manager manager = new Manager("Jim Jones", managerCart, 'L');
      HourlyEmployee employee = new HourlyEmployee("Mike Jones",employeeCart, 'L');

      ArrayList clothingItems = new ArrayList<>();
      clothingItems.add(clothing);
      clothingItems.add(clothing2);
      clothingItems.add(clothing3);

      IDiscountable [] disountables = {manager, employee};



        for (Object x : clothingItems) {
            System.out.println(x);
    }
        System.out.println("Total price of managers cart");
        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println("can the manager fit this?");
        System.out.println(ShopApp.isAFit(manager, clothing));
        System.out.println("can the employee fit this?");
        System.out.println(ShopApp.isAFit(employee, clothing2));
        ShopApp.sortAndPrintClothingByPrice(clothingItems);
        ShopApp.printDiscAmtOff(disountables, clothing);

}
}
