package model.facilityMaintenance;

import javax.persistence.*;


@Entity
@Table(name = "COST")
public class Cost {
	// TODO FK
	private int costID;
	@Column(name = "LABORCOST")
	private float laborCost;
	@Column(name = "MATERIALCOST")
	private float materialCost;
	@Column(name = "EXTRA")
	private float extra;
	
	public int getCostID() {
		return costID;
	}
	public void setCostID(int costID) {
		this.costID = costID;
	}
	public float getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(float laborCost) {
		this.laborCost = laborCost;
	}
	public float getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(float materialCost) {
		this.materialCost = materialCost;
	}
	public float getExtra() {
		return extra;
	}
	public void setExtra(float extra) {
		this.extra = extra;
	}
}
