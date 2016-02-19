package model.facility;

public class Unit extends Facility {
	private int unitID;
	private int unitNumber;
	private String usageType;


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

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	public int getUnitID() {
		return unitID;
	}

	public void setUnitID(int unitID) {
		this.unitID = unitID;
	}
	



}
