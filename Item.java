public class Item {
    private String name;
    private double price;
    private int index;
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}