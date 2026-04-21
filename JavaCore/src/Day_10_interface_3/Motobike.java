package Day_10_interface_3;

public class Motobike implements DeliveryVehicle{
    @Override
    public String getName() {
        return "Motobike";
    }

    @Override
    public double getSpeed() {
        return 60;
    }

    @Override
    public double getCost() {
        return 80;
    }

    @Override
    public double getCapacity() {
        return 10;
    }
}
