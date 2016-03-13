package model.inspection;

import java.util.List;

public interface IInspectionLog {
	public List<IInspection> listInspection();
	public void setInspections(List<IInspection> inspections);
	public IInspection addInspection(IInspection inspection);
}
