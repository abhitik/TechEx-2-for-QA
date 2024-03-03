import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of the StoreInventory class which manages the inventory of products.
 * @author Abhiti Khare
 * @version 1.0
 */
public class StoreInventory {
    private Map<Integer, Product> inventory;

    /**
     * Constructs a new StoreInventory with an empty inventory.
     */
    public StoreInventory() {
        this.inventory = new HashMap<>();
    }

    /**
     * Adds a new product to the store inventory.
     *
     * @param product The product which needs to be added to the inventory.
     */
    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    /**
     * Removes a product from the store inventory using its ID.
     *
     * @param productId The ID of the product which needs to be removed from the inventory.
     */
    public void removeProduct(int productId) {
        inventory.remove(productId);
    }

    /**
     * Updates the quantity of a product in the inventory.
     *
     * @param productId The ID of the product which needs to be updated in the inventory.
     * @param newQuantity The new quantity which needs to be set in the inventory.
     */
    public void updateQuantity(int productId, int newQuantity) {
        if (inventory.containsKey(productId)) {
            inventory.get(productId).setQuantity(newQuantity);
        }
    }

    /**
     * Views the current inventory and lists all products with their details.
     */
    public void viewInventory() {
        for (Product product : inventory.values()) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName()
                + ", Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
    }

    /**
     * Calculates and returns the total value of the products in the inventory.
     *
     * @return The total value of the products in the inventory.
     */
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Product product : inventory.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    /**
     * Retrieves the product from the inventory based on its ID.
     *
     * @param productId The ID of the product to retrieve.
     * @return The product with the specified ID, or null if not found.
     */
    public Product getProductById(int productId) {
        return inventory.get(productId);
    }
}