package ca.bcit.comp1510.lab10;

/**
 * Transaction represents a transaction with a cart of Items, the total price,
 * and number of items.
 *
 * @author John Ham
 * @version 2018
 */
public class Transaction {
    
    /** Array to hold Items. */
    private Item[] cart;
    
    /** Double to hold the total price in cart. */
    private double totalPrice;
    
    /** Integer to hold the number of items in cart. */
    private int itemCount;
    
    /**
     * Constructs an object of type Transaction.
     *
     * @param size
     *          Integer value for the size of the cart.
     */
    public Transaction(int size) {
        cart = new Item[size];
        totalPrice = 0;
        itemCount = 0;
    }
    
    /**
     * Adds an item to a cart by defining its name, price, and quantity.
     * 
     * @param name
     *          name of item
     * @param price
     *          price of item
     * @param quantity
     *          quantity of item
     */
    public void addToCart(String name, double price, int quantity) {
//        Item item = new Item(name, price, quantity);
        if (itemCount == cart.length) {
            increaseSize();
        }
//        cart[itemCount] = item;
        cart[itemCount++] = new Item(name, price, quantity);
//        itemCount++;
//        totalPrice += item.getPrice() * item.getQuantity();
        totalPrice += price * quantity;
    }
    
    /**
     * Adds an item to a cart.
     * 
     * @param item
     *          Item object
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice() * item.getQuantity();
    }
    
    /**
     * Creates a new cart of a larger size and copies the values of the old 
     * cart into it.
     */
    public void increaseSize() {
        final int moreSpace = 3;
        Item[] newCart = new Item[cart.length + moreSpace];
        
        for (int i = 0; i < cart.length; i++) {
            newCart[i] = cart[i];
        }
        
        cart = newCart;
       
        //.copyOf()
    }
    
    /**
     * Returns the total price of the cart.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Returns the total number of items in the cart.
     * @return sum of the quantity of each item
     */
    public int getCount() {
        int itemNumber = 0; 
        for (int i = 0; i < itemCount; i++) {
            itemNumber += cart[i].getQuantity();
        }
        return itemNumber;
    }
    
    /**
     * Prints a string representation of the cart.
     * 
     * @see java.lang.Object#toString()
     * @return String containing information on each item in the cart and the 
     *          total price
     */
    public String toString() {
        String string = "";
        
        for (int i = 0; i < itemCount; i++) {
            if (cart[i] != null) {
                string += cart[i].toString() + "\n";
            }
        }
        
        string += "Total : $" + getTotalPrice();
        
        return string;
    }
}
