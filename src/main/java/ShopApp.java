import java.util.*;

public class ShopApp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Manager m1 = (Manager) o1;
        Employee e1 = (Employee) o2;
        if (m1.getDiscount() == e1.getDiscount())
            return 0;
        else if (m1.getDiscount() > e1.getDiscount())
            return 1;
        else
            return -1;
    }


    public static double calcTotal(Clothing clothing){
        double total;
        for(double i = 0; i < clothing.getPrice();){
        }

        return clothing.getPrice();
    }
    public static boolean isAFit(Customer customer,Clothing clothing){
        char size = 'L';
       if(size != 'L'){
           System.out.println("Does not fit");
       }
        return true;

    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingList){



    }
    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());

    }
    public static void printDiscAmtOff(IDiscountable[] discountable, Clothing clothing){

    }


}
