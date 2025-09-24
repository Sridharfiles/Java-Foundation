class Product {
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    void totalPrice() {
        System.out.println("Product name : "+name);
        System.out.println("Total = " + price * quantity);
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        Product p1 = new Product("Biscuit", 10, 4);
        Product p2 = new Product("diary milk", 100, 3);
        p1.totalPrice();
        p2.totalPrice();

    }
}
