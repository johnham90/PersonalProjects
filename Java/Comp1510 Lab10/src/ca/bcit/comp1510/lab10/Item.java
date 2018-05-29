package ca.bcit.comp1510.lab10;

/**
 * Item represents an item with a name, price, and quantity.
 *
 * @author John Ham
 * @version 2018
 */
public class Item {
    
    /** Name of item. */
    private final String name;
    
    /** Price of item. */
    private final double price;
    
    /** Quantity of item. */
    private final int quantity;
    
    /**
     * Constructs an object of type Item.
     *
     * @param name
     *          String for name of item.
     * @param price
     *          Double value for price of item.
     * @param quantity
     *          Integer value for quantity of item.
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /**
     * Constructs an object of type Item. Quantity is set to 1.
     *
     * @param name
     *          String for name of item.
     * @param price
     *          Double value for price of item.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
    }
    
    /**
     * Returns the name of the item.
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Return the price of the item.
     * @return price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Return the quantity of the item.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Returns a string representation of the item.
     * @see java.lang.Object#toString()
     * @return String containing the name, price, and quantity of the item.
     */
    public String toString() {
        return "Item[Name : " + name + " Price : " + price + " Quantity : " 
                    + quantity + "]";
    }
}
