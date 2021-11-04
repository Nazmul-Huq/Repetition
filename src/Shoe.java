// this class extends the parent class Product.java

public class Shoe extends Product{
    private String soleType; // unique property (instance variable) for shoe

    public Shoe(int id, String name, int size, double price, String soleType) {
        super(id, name, size, price);
        this.soleType = soleType;
    }


    @Override
    public String toString() {
        return "Shoe{" +
                "soleType='" + soleType + '\'' +
                "} " + super.toString();
    }
}
