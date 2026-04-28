package Day_12_Collection.Service;

import Day_12_Collection.Order;

import java.util.ArrayList;

public class OrderService {
    ArrayList<Order> orders = new ArrayList<>();
    HistoryService historyService;

    public OrderService(HistoryService historyService) {
        this.historyService = historyService;
    }

    public void createOrder(String id){
        orders.add(new Order(id));
        historyService.log("Created Order:" +id);
    }

    public Order findOrder(String id){
        for (Order o : orders){
            if(o.id.equals(id)) return o ;
        }
        return null;
    }

    public void addItem(String orderId, String productId, int quantity) {
        Order o = findOrder(orderId);
        if (o != null) {
            o.addItem(productId, quantity);
        }
    }

    public void showOrders() {
        for (Order o : orders) {
            o.display();
        }
    }
}
