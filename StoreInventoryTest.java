import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Implementation of the StoreInventoryTest class which tests the StoreInventory class.
 * @author Abhiti Khare
 * @version 1.0
 */
public class StoreInventoryTest {
    private StoreInventory storeInventory;
    private Product product1;
    private Product product2;

    /**
     * Sets up the test environment before each test case.
     */
    @BeforeEach
    public void setUp() {
        storeInventory = new StoreInventory();
        product1 = new Product("Product 1", 1, 10.0, 5);
        product2 = new Product("Product 2", 2, 15.0, 10);
    }

    /**
     * Test case to verify the method which adds a new product to the inventory.
     */
    @Test
    public void testAddProduct() {
        storeInventory.addProduct(product1);
         Product retrievedProduct = storeInventory.getProductById(product1.getId());
        assertNotNull(retrievedProduct);
        assertEquals(product1.getName(), retrievedProduct.getName());
    }

    /**
     * Test case to verify the method which removes a product from the inventory.
     */
    @Test
    public void testRemoveProduct() {
        storeInventory.addProduct(product1);
        storeInventory.removeProduct(product1.getId());
        assertNull(storeInventory.getProductById(product1.getId()));
    }

    /**
     * Test case to verify the method which updates the quantity of a product to the inventory.
     */
    @Test
    public void testUpdateQuantity() {
        storeInventory.addProduct(product1);
        storeInventory.updateQuantity(product1.getId(), 7);
        assertEquals(7, storeInventory.getProductById(product1.getId()).getQuantity());
    }

    /**
     * Test case to verify the method which views the inventory.
     * Checks to see if an exception is thrown.
     */
    @Test
    public void testViewInventory() {
        assertDoesNotThrow(() -> storeInventory.viewInventory());
    }

    /**
     * Test case to verify the method which calculates the total value of the products in the inventory.
     */
    @Test
    public void testCalculateTotalValue() {
        storeInventory.addProduct(product1);
        storeInventory.addProduct(product2);
        assertEquals(200.0, storeInventory.calculateTotalValue());
    }
}