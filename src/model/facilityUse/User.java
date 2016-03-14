package model.facilityUse;

import javax.persistence.*;


@Entity
@Table(name = "USER")
public class User {
    // TODO FK
	
	private int userID;
	@Column(name = "FNAME")
    private String fName;
	@Column(name = "LNAME")
    private String lName;
	@Column(name = "GENDER")
    private String gender;  
    
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
