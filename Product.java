/**
 * Implementation of the Product class which holds information (name, id, price, and quantity) about the products.
 *
 * @author Abhiti Khare
 * @version 1.0
 */
public class Product {
    /**
     * The name of the product stored as a String.
     */
    private String name;
    /**
     * The id of the product stored as an int.
     */
    private int id;
    /**
     * The price of the product stored as a double.
     */
    private double price;
    /**
     * The quantity of the product stored as a int.
     */
    private int quantity;


    /**
     * Constructs a new Product with given parameters as attributes of the product.
     *
     * @param name The name of the product.
     * @param id The id of the product.
     * @param price The price of the product.
     * @param quantity The quantity of the product in the inventory.
     */
    public Product(String name, int id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Returns the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product using the given parameter.
     *
     * @param name The name of the product which needs to be set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the id of the product.
     *
     * @return The id of the product.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the product using the given parameter.
     *
     * @param id The id of the product which needs to be set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product using the given parameter.
     *
     * @param price The price of the product which needs to be set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the quantity of the product.
     *
     * @return The quantity of the product.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product using the given parameter.
     *
     * @param quantity The quantity of the product which needs to be set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}