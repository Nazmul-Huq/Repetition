
// this class is a parent class for Shoe.java and Shirt.java
public class Product {
    private int id;
    private String name;
    private int size;
    private double price;

    public Product(int id, String name, int size, double price) {
        // common properties (instance variables) for all class
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    //show the product as a model wear it
    public void showInModel(){
        System.out.println("It looks really nice");
    }

    // method to show product from 360-degree angle
    public void show360Degree(){
        System.out.println("Show the product from 360-degree view");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
