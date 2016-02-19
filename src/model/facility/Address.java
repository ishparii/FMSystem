package model.facility;

public class Address {
	private int addressID;
	private int unitNumber;
    private int buildingNumber;
	private String street;
	private String city;
	private String sateProvince;
	private int zipCode;
	
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public int getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSateProvince() {
		return sateProvince;
	}
	public void setSateProvince(String sateProvince) {
		this.sateProvince = sateProvince;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		String address = getBuildingNumber() + " " + getStreet() + ", UnitNo " + getUnitNumber() + ", " + getCity() + ", " + getSateProvince() + getZipCode(); 
		return address;
	}

}
