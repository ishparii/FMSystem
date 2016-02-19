package model.facility;

import java.util.Date;
import java.util.Map;

import model.facilityMaintenance.*;
import model.facilityUse.*;
import model.inspection.*;

public abstract class Facility {
	private String facilityName;
	private Address address;
	private String facilityOwner;
	private Date constructionDate;
	private Manager manager;
	private MaintenanceLog maintenanceLog;
	private UsageLog usageLog;
	private InspectionLog inspectionLog;
	private int facilityID;
	
	public Facility() {
		maintenanceLog = new MaintenanceLog();
		usageLog = new UsageLog();
		inspectionLog = new InspectionLog();
	}

	public abstract Map<String,String> getFacilityInfo();

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getName() {
		return facilityName;
	}

	public void setName(String name) {
		this.facilityName = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getOwner() {
		return facilityOwner;
	}

	public void setOwner(String owner) {
		this.facilityOwner = owner;
	}

	public Date getConstructionDate() {
		return constructionDate;
	}

	public void setConstructionDate(Date constructionDate) {
		this.constructionDate = constructionDate;
	}

	public int getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
}
