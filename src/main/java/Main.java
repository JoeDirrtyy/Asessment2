import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Clothing> managerCart = new ArrayList<>();
        ArrayList<Clothing> employeeCart = new ArrayList<>();

        Clothing clothing = new Clothing("Nike",'M',"Joggers",20.00);
        Clothing clothing2 = new Clothing("Adidias",'M',"Jacket", 5.00);
        Clothing clothing3 = new Clothing("Champion",'L',"T-Shirt", 30.00);
        Manager manager = new Manager("Jim Jones",'L');
        Employee employee = new Employee("Mike Jones",'L');

        managerCart.add(clothing);
        managerCart.add(clothing2);
        managerCart.add(clothing3);

        employeeCart.add(clothing);
        employeeCart.add(clothing2);
        employeeCart.add(clothing3);

        for (int x = 0; x < managerCart.size(); x++) {
            System.out.println(managerCart.get(x).toString());


    }
}
}
