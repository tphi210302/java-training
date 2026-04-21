package Day_10_interface_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<DeliveryVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motobike());
        vehicles.add(new Truck());
        vehicles.add(new Drone());

        while (true) {
            System.out.println("\n===== DELIVERY SYSTEM =====");
            System.out.println("1. Choose vehicle by budget");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your budget: ");
                    double budget = sc.nextDouble();

                    DeliveryService service = new DeliveryService();

                    DeliveryVehicle result = service.chooseVehicle(vehicles, budget);

                    if (result != null) {
                        System.out.println("Best vehicle: " + result.getName());
                        System.out.println("Speed: " + result.getSpeed());
                        System.out.println("Cost: " + result.getCost());
                        System.out.println("Capacity: " + result.getCapacity());
                    } else {
                        System.out.println("No suitable vehicle found!");
                    }
                    break;

                case 0:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
