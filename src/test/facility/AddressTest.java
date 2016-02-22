package test.facility;

import static org.junit.Assert.*;

import org.junit.Test;

import model.facility.Address;

public class AddressTest {

	@Test
	public void testGetAddressID() {
		Address address = new Address();
		address.setAddressID(1);
		assertEquals(1, address.getAddressID());
		}
	
	@Test
	public void testGetUnitNumber(){
		Address address= new Address();
		address.setAddressID(123);
		assertEquals(123,address.getAddressID());
		}
	
	@Test
	public void testGetStreetNumber(){
		Address address= new Address();
		address.setStreetNumber(456);
		assertEquals(456,address.getStreetNumber());
	}
	
	@Test
	public void testGetStreet(){
		Address address= new Address();
		address.setStreet("Ashland");
		assertEquals("Ashland", address.getStreet());
	}
	
	@Test
	public void testCity(){
		Address address= new Address();
		address.setCity("Chicago");
		assertEquals("Chicago", address.getCity());
	}
	
	@Test
	
	public void testZipCode(){
		Address address= new Address();
		address.setZipCode(60626);
		assertEquals(60626,address.getZipCode());
	}

	}


