package model.facility;

public interface IAddress {
	public int getAddressID();
	public void setAddressID(int addressID);
	public int getUnitNumber();
	public void setUnitNumber(int unitNumber);
	public int getStreetNumber();
	public void setStreetNumber(int streetNumber);
	public String getStreet();
	public void setStreet(String street);
	public String getCity();
	public void setCity(String city);
	public int getZipCode();
	public void setZipCode(int zipCode);
	public String getStateProvince();
	public void setStateProvince(String stateProvince);
}
