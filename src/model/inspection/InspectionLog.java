package model.inspection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class InspectionLog implements IInspectionLog {

	private List<IInspection> inspections;

	public List<IInspection> listInspection() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for (IInspection i : inspections) {
			System.out.println("Inspection " + i.getInspectionID() + " of " + i.getInspectionType()
					+ " type was done by " + i.getInspector() + " on " + df.format(i.getInspectionDate()) + " with "
					+ i.getOutcome() + " outcome.");
		}
		return inspections;
	}

	public void setInspections(List<IInspection> inspections) {
		this.inspections = inspections;
	}

	public IInspection addInspection(IInspection inspection) {
		inspections.add(inspection);
		System.out.println("Inspection added.");
		return inspection;
	}
}
