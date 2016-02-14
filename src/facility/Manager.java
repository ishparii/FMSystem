package facility;

public class Manager {
	private int managerID;
	private String fName;
	private String lName;
	private long ssn;
	private String companyName;
	private String phone;
	private Address managerAddress;

	public int getManagerID() {
		return managerID;
	}

	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

	public long getSsn() {
		return ssn;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getPhone() {
		return phone;
	}

	public Address getManagerAddress() {
		return managerAddress;
	}
}
