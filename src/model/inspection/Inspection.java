package model.inspection;

import java.util.Date;

public class Inspection {
    private int inspectionID;
    private String inspectionType;
    private Date inspectionDate;
    private String inspector;
    private String outcome;

    public int getInspectionID() {
        return inspectionID;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public String getInsepctor() {
        return inspector;
    }

    public String getOutcome() {
        return outcome;
    }
}
