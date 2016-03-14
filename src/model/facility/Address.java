package model.facility;

import javax.persistence.*;


@Entity
@Table(name = "ADDRESS")
public class Address {
	// TODO FK
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private int addressID;
	@Column(name = "UNITNUMBER")
	private int unitNumber;
	@Column(name = "STREETNUMBER")
	private int streetNumber;
	@Column(name = "STREET" )
	private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATEPROVINCE")
	private String stateProvince;
	@Column(name = "ZIPCODE")
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
}
