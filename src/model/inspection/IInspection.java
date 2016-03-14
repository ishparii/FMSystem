package model.inspection;

import java.util.Date;

public interface IInspection {
	public int getInspectionID();
	public void setInspectionID(int inspectionID);
	public String getInspectionType();
	public void setInspectionType(String inspectionType);
	public Date getInspectionDate();
	public void setInspectionDate(Date inspectionDate);
	public String getInspector();
	public void setInspector(String inspector);
	public String getOutcome();
	public void setOutcome(String outcome);
}
