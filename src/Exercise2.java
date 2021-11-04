public class Exercise2 {
    public static void main(String[] args) {
        // Let's assume we are making a software for a super shop
        // We will need to add different products for example shirt, pant, shoe etc.
        // all product have some common feature for example product id, name, size, price etc
        // therefore we can make a super class namely "Product.java" which Shirt/Pant/shoe... class can inherit

        // To explain I have created one parent class "Product.java" and two subclass: "Shirt.java" and "Shoe.java"
        // Product.java has the following attributes: id, name, size, price and one methods "showInModel", "show360Degree"
        // Shirt.java has one unique attribute fabricType
        // Shoe.java has one unique attribute soleType
        // as Shirt.java and Shoe.java both inherit/extends Product.java,
            // it gets it, name, size and price property from it's parent class automatically
            // so if we create shoe or shirt object we can apply both methods to that object

        Shoe shoe = new Shoe(1, "NB", 40, 500, "Memory Foam"); // create shoe object
        shoe.showInModel(); // apply show in model to shoe object
        shoe.show360Degree(); // apply show 360 degree to shoe object

        Shirt shirt = new Shirt(1, "Tommy Jeans", 42, 1000, "Cotton");
        shirt.showInModel(); // apply show in model to shirt object
        shirt.show360Degree(); // apply show 360 degree to shirt object

    }
}
