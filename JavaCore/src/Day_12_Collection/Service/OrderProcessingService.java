package Day_12_Collection.Service;

import Day_12_Collection.Order;
import Day_12_Collection.OrderItem;

import java.util.LinkedList;
import java.util.Queue;

public class OrderProcessingService {
    Queue<Order> queue = new LinkedList<>();
    OrderService orderService;
    InventoryService inventoryService;
    HistoryService historyService;

    public OrderProcessingService(OrderService orderService, InventoryService inventoryService, HistoryService historyService) {
        this.orderService = orderService;
        this.inventoryService = inventoryService;
        this.historyService = historyService;
    }

    public void addToQueue(String orderId) {
        Order o = orderService.findOrder(orderId);
        if (o != null) {
            queue.add(o);
            historyService.log("Queued order: " + orderId);
        }
    }

    public void processOrder() {
        if (queue.isEmpty()) {
            System.out.println("Queue empty!");
            return;
        }

        Order o = queue.poll();

        for (OrderItem i : o.items) {
            if (!inventoryService.checkStock(i.productId, i.quantity)) {
                o.status = "FAILED";
                historyService.log("Order failed: " + o.id);
                return;
            }
        }

        for (OrderItem i : o.items) {
            inventoryService.reduceStock(i.productId, i.quantity);
        }

        o.status = "COMPLETED";
        historyService.log("Order completed: " + o.id);
    }
}
