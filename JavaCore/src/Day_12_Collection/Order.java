package Day_12_Collection;

import java.util.ArrayList;

public class Order {
    public String id;
    public String status;
    public ArrayList<OrderItem> items = new ArrayList<>();

    public Order(String id) {
        this.id = id;
        this.items = items;
    }
    public void addItem(String productId, int quantity){
        items.add(new OrderItem(productId, quantity));
    }

    public void display(){
        System.out.println("Oder ID:"+ id);
        for (OrderItem item : items){
            System.out.println("Product: " + item.productId + ", Quantily: " + item.quantity);
        }
    }
}
