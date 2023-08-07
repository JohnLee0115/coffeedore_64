import java.util.ArrayList;

public class CoffeeKiosk {
    private static ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // constructor
    public CoffeeKiosk () {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // methods
    public void AddMenuItem (String name, double price) {
        Item temp = new Item(name, price);
        menu.add(temp);
        temp.setIndex(menu.indexOf(temp));
    }

    public static void displayMenu () {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public static void newOrder() {
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newGuest = new Order(name);
        displayMenu();
        
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            newGuest.addItem(menu.get(Integer.parseInt(itemNumber)));
            System.out.println("Please enter a new menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        newGuest.display();

    }




}