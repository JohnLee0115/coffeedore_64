import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // constructors
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // getters
    public String getName() {
        return name;
    }

    public boolean getReady() {
        return ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void notReady() {
        this.ready = false;
    }

    public void isReady() {
        this.ready = true;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void getStatusMessage() {
        if (ready) {
            System.out.println("Your order is ready.");
        } else {
            System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }



}