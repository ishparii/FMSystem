package test.facilitymaintenance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.facilityMaintenance.Cost;

public class CostTest {
	
	
	@Test
	public void testGetCostID(){
		Cost cost= new Cost();
		cost.setCostID(1);
		assertEquals(1, cost.getCostID());
	}
	
	
}
