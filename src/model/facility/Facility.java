package model.facility;

import java.util.Date;
import model.facilityMaintenance.*;
import model.facilityUse.*;
import model.inspection.*;

public abstract class Facility {
	private int facilityID;
	private String name;
	private Address address;
	private String owner;
	private Date constructionDate;
	private Manager manager;
	private MaintenanceLog maintenanceLog;
	private UsageLog usageLog;
	private InspectionLog inspectionLog;
	
	public Facility() {
		maintenanceLog = new MaintenanceLog();
		usageLog = new UsageLog();
		inspectionLog = new InspectionLog();
	}

	public abstract Facility getFacilityInfo();
	public abstract void addFacilityDetail();



	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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
