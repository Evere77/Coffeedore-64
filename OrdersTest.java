public class OrdersTest {
    public static void main(String[] args) {
    CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

    coffeeKiosk.addMenuItem("banana", 2.00);
    coffeeKiosk.addMenuItem("coffee", 1.50);
    coffeeKiosk.addMenuItem("latte", 4.50);
    coffeeKiosk.addMenuItem("cappuccino", 3.00);
    coffeeKiosk.addMenuItem("muffin", 4.00);

    coffeeKiosk.newOrder();
    }
}