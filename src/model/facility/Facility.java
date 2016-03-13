package model.facility;

import java.util.Map;
import model.inspection.InspectionLog;
import model.facilityMaintenance.MaintenanceLog;
import model.facilityUse.UsageLog;

public abstract class Facility {
	private int facilityID;
	private String facilityName;
	private String facilityOwner;
	private String usageType;
	private InspectionLog inspectionLog;
	private MaintenanceLog maintenanceLog;
	private UsageLog usageLog;
	private Address address;
	private Manager manager;

	public abstract Map<String, String> getFacilityInfo();

	// getters and setters
	public int getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getFacilityOwner() {
		return facilityOwner;
	}

	public void setFacilityOwner(String facilityOwner) {
		this.facilityOwner = facilityOwner;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	public InspectionLog getInspectionLog() {
		return inspectionLog;
	}

	public void setInspectionLog(InspectionLog inspectionLog) {
		this.inspectionLog = inspectionLog;
	}

	public MaintenanceLog getMaintenanceLog() {
		return maintenanceLog;
	}

	public void setMaintenanceLog(MaintenanceLog maintenanceLog) {
		this.maintenanceLog = maintenanceLog;
	}

	public UsageLog getUsageLog() {
		return usageLog;
	}

	public void setUsageLog(UsageLog usageLog) {
		this.usageLog = usageLog;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
