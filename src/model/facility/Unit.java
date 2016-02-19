package model.facility;

import java.util.Date;

import model.constantValue.UsageType;

public class Unit extends Facility {
	public Unit() {
		super();
	}

	private int unitID;
	private int unitNumber;
	private UsageType usageType;


	@Override
	public Facility getFacilityInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFacilityDetail() {
		// TODO Auto-generated method stub

	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	public UsageType getUsageType() {
		return usageType;
	}

	public void setUsageType(UsageType usageType) {
		this.usageType = usageType;
	}
	



}
