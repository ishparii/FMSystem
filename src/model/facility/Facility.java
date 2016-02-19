package model.facility;

import java.util.Date;
import java.util.Map;

import model.facilityMaintenance.*;
import model.facilityUse.*;
import model.inspection.*;

public abstract class Facility {
	private int facilityID;
	private String name;
	private String owner;
	private MaintenanceLog maintenanceLog;
	private UsageLog usageLog;
	private InspectionLog inspectionLog;
	
	public Facility() {
		maintenanceLog = new MaintenanceLog();
		usageLog = new UsageLog();
		inspectionLog = new InspectionLog();
	}

	public abstract Map<String, String> getFacilityInfo();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
}
