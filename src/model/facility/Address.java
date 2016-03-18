package model.facility;



public class Address implements IAddress {
	private int addressID;
	private int unitNumber;
	private int streetNumber;
	private String street;
	private String city;
	private String stateProvince;
	private int zipCode;
//	private String addressType;   // Address type for different address tables


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

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	
	@Override
	public String toString(){
		return ("" + getStreetNumber() + " " + getStreet() + ", " + getUnitNumber() + "/n" +
				getCity() + ", " + getStateProvince() + " " + getZipCode());
	}

//	public String getAddressType() {
//		return addressType;
//	}
//
//	public void setAddressType(String addressType) {
//		this.addressType = addressType;
//	}
}
