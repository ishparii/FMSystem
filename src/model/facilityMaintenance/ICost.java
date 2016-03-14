package model.facilityMaintenance;

public interface ICost {
	public int getCostID();
	public void setCostID(int costID);
	public float getLaborCost();
	public void setLaborCost(float laborCost);
	public float getMaterialCost();
	public void setMaterialCost(float materialCost);
	public float getExtra();
	public void setExtra(float extra);
}
