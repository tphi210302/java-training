package Day_10_interface_3;

import java.util.List;

public class DeliveryService {
    public DeliveryVehicle chooseVehicle(List<DeliveryVehicle> list, double budget){
        DeliveryVehicle best = null;
        for(DeliveryVehicle veh : list){
            if (veh.getCost() <= budget){
                if ( best == null || veh.getCost() > best.getCost()){
                    veh = best ;
                }
            }
        }
        return best;
    }


}
