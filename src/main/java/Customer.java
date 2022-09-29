import java.util.Arrays;

public abstract class Customer extends  Person {

    private Clothing[] clothing;
    private char size;

    public Customer(String name, Clothing[] clothingItems, char size) {
        super(name);
        this.clothing = clothingItems;
        this.size = size;
    }

    public Customer(String name, String description, double price, char size) {
        super(name);
    }
    public char getSize(){
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothing=" + Arrays.toString(clothing) +
                ", size=" + size +
                '}';
    }
}