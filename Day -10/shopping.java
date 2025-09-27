
public class shopping {
    private String name;
    private double price;
    private int quantity;

    public void addStock(int quantity) {
        this.quantity += quantity;
    }
    public void reduceStock(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Insufficient stock to reduce.");
        }
    } 
    String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void getTotalValue() {
        double totalValue = price * quantity;
        System.out.println("Total value of " + name + " in stock: " + totalValue);
    }
    public static void main(String[] args) {
        shopping item = new shopping();
        item.setName("Laptop");
        item.setPrice(1500.0);
        item.setQuantity(5);
        item.getTotalValue();

    }
}
