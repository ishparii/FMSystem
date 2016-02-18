package model.facilityMaintenance;

import java.sql.Timestamp;
import java.util.Date;

public class Service {
    private int serviceID;
    private Timestamp serviceTime;
    
    private Cost cost;

    public int getServiceID() {
        return serviceID;
    }

    public Timestamp getServiceTime() {
        return serviceTime;
    }

}
