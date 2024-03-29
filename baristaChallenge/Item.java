public class Item {

    // Member variables
    private String name;
    private double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // name getter
    public String getName() {
        return this.name;
    }

    // name setter
    public void setName(String name) {
        this.name = name;
    }

    // price getter
    public double getPrice() {
        return this.price;
    }

    // price setter
    public void setPrice(double price) {
        this.price = price;
    }

}