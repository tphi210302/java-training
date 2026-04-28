package Day_12_Collection;

import Day_12_Collection.Service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HistoryService history = new HistoryService();
        ProductService productService = new ProductService(history);
        InventoryService inventoryService = new InventoryService(history);
        OrderService orderService = new OrderService(history);
        OrderProcessingService processingService =
                new OrderProcessingService(orderService, inventoryService, history);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Stock In");
            System.out.println("3. Create Order");
            System.out.println("4. Add Order to Queue");
            System.out.println("5. Process Order");
            System.out.println("6. Show Products");
            System.out.println("7. Show Orders");
            System.out.println("8. Show Inventory");
            System.out.println("9. Show History");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    productService.addProduct(id, name, price);
                    break;

                case 2:
                    System.out.print("Product ID: ");
                    String pid = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    inventoryService.stockIn(pid, qty);
                    break;

                case 3:
                    System.out.print("Order ID: ");
                    String oid = sc.nextLine();
                    orderService.createOrder(oid);

                    while (true) {
                        System.out.print("Product ID (done to finish): ");
                        String p = sc.nextLine();
                        if (p.equals("done")) break;

                        System.out.print("Quantity: ");
                        int q = sc.nextInt();
                        sc.nextLine();

                        orderService.addItem(oid, p, q);
                    }
                    break;

                case 4:
                    System.out.print("Order ID: ");
                    String queueId = sc.nextLine();
                    processingService.addToQueue(queueId);
                    break;

                case 5:
                    processingService.processOrder();
                    break;

                case 6:
                    productService.showProducts();
                    break;

                case 7:
                    orderService.showOrders();
                    break;

                case 8:
                    inventoryService.showInventory();
                    break;

                case 9:
                    history.showHistory();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid!");
            }
        }
    }
}