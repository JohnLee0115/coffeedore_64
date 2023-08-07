import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        // Menu items
        // Item item1 = new Item("mocha", 4.5);

        // Item item2 = new Item("latte", 3.5);

        // Item item3 = new Item("drip coffee", 5.0);

        // Item item4 = new Item("cappuccino", 2.5);
        

        // Order variables -- order1, order2 etc.
        // Order unspecifiedGuest1 = new Order();
        // unspecifiedGuest1.addItem(item1);
        // unspecifiedGuest1.addItem(item2);
        // unspecifiedGuest1.notReady();
        // System.out.println(unspecifiedGuest1.getOrderTotal());
        // unspecifiedGuest1.display();

        // Order unspecifiedGuest2 = new Order();
        // unspecifiedGuest2.addItem(item3);
        // unspecifiedGuest2.addItem(item4);
        // unspecifiedGuest2.isReady();
        // unspecifiedGuest2.getStatusMessage();
        // System.out.println(unspecifiedGuest2.getOrderTotal());
        // unspecifiedGuest2.display();




        // Order order1 = new Order("Cindurhi");
        // order1.addItem(item1);
        // order1.addItem(item3);
        // order1.notReady();
        // System.out.println(order1.getOrderTotal());
        // order1.display();


        // Order order2 = new Order("Noah");
        // order2.addItem(item2);
        // order2.addItem(item4);
        // order2.isReady();
        // order2.getStatusMessage();
        // System.out.println(order2.getOrderTotal());
        // order2.display();

        // Order order3 = new Order("Sam");
        // order3.addItem(item1);
        // order3.addItem(item4);
        // order3.notReady();
        // System.out.println(order3.getOrderTotal());
        // order3.display();

        // Application Simulations
        // Use this example code to test various orders' updates

        CoffeeKiosk newCustomer = new CoffeeKiosk(); 

        newCustomer.AddMenuItem("mocha", 4.5);
        newCustomer.AddMenuItem("latte", 3.5);
        newCustomer.AddMenuItem("drip coffee", 5.0);
        newCustomer.AddMenuItem("cappuccino", 2.5);

        newCustomer.newOrder();

        
    }
}
