package model;

import static org.junit.Assert.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exceptions.DayException;
import exceptions.YoungerException;

class MarketTest {
	private Market market;

	private void setupScenary1() {
		market = new Market();
	}
	@Test
	public void testAddPerson1() {
		setupScenary1();
		int type = 2;
		int date = LocalDate.now().getDayOfMonth();
		String id = "13132905"+(date+1)+"5";
		
		try {
			market.addPerson(type, id, date);
		}
		catch(YoungerException | DayException e) {
			System.out.println(e.getMessage());
			fail();
		}
		
		
		
	}
	@Test
	public void testAddPerson2() {
		setupScenary1();
		int type = 1;
		int date = LocalDate.now().getDayOfMonth();
		String id = "1313290582";
		
		try {
			market.addPerson(type, id, date);
		}
		catch(YoungerException | DayException e) {
			System.out.println(e.getMessage());
			fail();
		}
		
		
		
	}
	@Test
	public void testAddPerson3() {
		setupScenary1();
		int type = 2;
		int date = LocalDate.now().getDayOfMonth();
		String id = "1313290"+date+"5";
		
		try {
			market.addPerson(type, id, date);
		}
		catch(YoungerException | DayException e) {
			System.out.println(e.getMessage());
			fail();
		}
		
		
		
	}
	
	

	

}
