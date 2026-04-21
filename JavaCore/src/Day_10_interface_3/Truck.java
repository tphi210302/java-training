package Day_10_interface_3;

public class Truck implements DeliveryVehicle{
    @Override
    public String getName() {
        return "Xe tải";
    }

    @Override
    public double getSpeed() {
        return 100;
    }

    @Override
    public double getCost() {
        return 120;
    }

    @Override
    public double getCapacity() {
        return 300;
    }
}
