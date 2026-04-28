package Day_12_Collection.Service;

import Day_12_Collection.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductService {
    Map<String, Product> products = new HashMap<>();
    Set<String> productNames = new HashSet<>();
    HistoryService historyService;

    public ProductService(HistoryService historyService) {
        this.historyService = historyService;
    }

    public void addProduct(String id, String name, double price){
        if(products.containsKey(id)){
            System.out.println("Duplicate ID!");
        }

        if(productNames.contains(name)){
            System.out.println("Duplicate Name!");
        }

        products.put(id, new Product(id, name, price));
        productNames.add(name);

        historyService.log("Added product: " + id);
    }

    public void showProducts(){
        for (Product p : products.values()){
            p.display();
        }
    }

    public boolean exist(String id){
        return products.containsKey(id);
    }

}
