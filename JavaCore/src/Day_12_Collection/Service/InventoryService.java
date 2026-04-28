package Day_12_Collection.Service;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    Map<String,Integer> inventory = new HashMap<>();
    HistoryService historyService;

    public InventoryService(HistoryService historyService) {
        this.historyService = historyService;
    }
    public void stockIn(String productId, int quantity){
        inventory.put(productId, inventory.getOrDefault(productId, 0) + quantity);
        historyService.log("Stock in: " + productId + " " + quantity);
    }

    public boolean checkStock(String productId, int quantity){
        return inventory.getOrDefault(productId, 0) >= quantity;
    }

    public void reduceStock(String productId, int quantity) {
        inventory.put(productId, inventory.get(productId) - quantity);
    }

    public void showInventory() {
        for (String id : inventory.keySet()) {
            System.out.println(id + " | " + inventory.get(id));
        }
    }
}
