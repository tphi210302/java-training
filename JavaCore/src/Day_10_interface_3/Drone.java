package Day_10_interface_3;

public class Drone implements DeliveryVehicle{
    @Override
    public String getName() {
        return "Drone";
    }

    @Override
    public double getSpeed() {
        return 400;
    }

    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public double getCapacity() {
        return 10;
    }
}
