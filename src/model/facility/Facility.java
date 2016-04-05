package model.facility;

import java.util.Map;

import model.inspection.IInspectionLog;
import model.facilityMaintenance.IMaintenanceLog;
import model.facilityUse.IUsageLog;

public abstract class Facility {
	
	private int facilityID;
	private String facilityName;
	private String facilityOwner;
	private String usageType;
	
	private IInspectionLog inspectionLog;
	private IMaintenanceLog maintenanceLog;
	private IUsageLog usageLog;
	
	private IAddress address;
	private IManager manager;

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

	public IInspectionLog getInspectionLog() {
		return inspectionLog;
	}

	public void setInspectionLog(IInspectionLog inspectionLog) {
		this.inspectionLog = inspectionLog;
	}

	public IMaintenanceLog getMaintenanceLog() {
		return maintenanceLog;
	}

	public void setMaintenanceLog(IMaintenanceLog maintenanceLog) {
		this.maintenanceLog = maintenanceLog;
	}

	public IUsageLog getUsageLog() {
		return usageLog;
	}

	public void setUsageLog(IUsageLog usageLog) {
		this.usageLog = usageLog;
	}

	public IAddress getAddress() {
		return address;
	}

	public void setAddress(IAddress address) {
		this.address = address;
	}

	public IManager getManager() {
		return manager;
	}

	public void setManager(IManager manager) {
		this.manager = manager;
	}
}
