package model.inspection;

import java.util.Date;
import javax.persistence.*;

<<<<<<< HEAD

@Entity
@Table(name = "INSPECTION")
public class Inspection {
    @Id
	@Column(name = "INSEPCTION_ID", unique = true, nullable = false)
	private int inspectionID;
    @Column(name = "INSPECTIONTYPE")
    private String inspectionType;
    @Column(name = "INSEPCTIONDATE")
    private Date inspectionDate;
    @Column(name = "INSPECTOR")
    private String inspector;
    @Column(name = "OUTCOME")
    private String outcome;
    
=======
public class Inspection implements IInspection {
	private int inspectionID;
	private String inspectionType;
	private Date inspectionDate;
	private String inspector;
	private String outcome;

>>>>>>> 9eae622893eb46250094911f52103fb6ee486190
	public int getInspectionID() {
		return inspectionID;
	}

	public void setInspectionID(int inspectionID) {
		this.inspectionID = inspectionID;
	}

	public String getInspectionType() {
		return inspectionType;
	}

	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}

	public Date getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public String getInspector() {
		return inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
}
