package model.facility;

import javax.persistence.*;


@Entity
@Table(name = "MANAGER")
public class Manager implements IManager {
	// TODO FK
	private int managerID;
	@Column(name = "FNAME")
	private String fName;
	@Column(name = "LNAME")
	private String lName;
	@Column(name = "COMPANYNAME")
	private String companyName;
	@Column(name = "PHONE")
	private String phone;

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
