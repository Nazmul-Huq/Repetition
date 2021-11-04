
// this class extends the parent class Product.java
public class Shirt extends Product{
    private String fabricType; // unique property (instance variable) for shirt

    public Shirt(int id, String name, int size, double price, String fabricType) {
        super(id, name, size, price);
        this.fabricType = fabricType;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "fabricType='" + fabricType + '\'' +
                "} " + super.toString();
    }
}
