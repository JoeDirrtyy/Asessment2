public class Customer extends  Person{

    public Customer(String name, char size) {
        super(name);
        this.size = size;
    }

    private char size;

    public char getSize() {
        return size;
    }


}
