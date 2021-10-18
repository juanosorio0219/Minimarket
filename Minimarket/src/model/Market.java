package model;
import java.util.ArrayList;
import java.util.List;

import exceptions.DayException;
import exceptions.YoungerException;

public class Market {
	private List<Person> persons;
	private int attemps;
	
	public Market() {
		persons = new ArrayList<Person>();
		attemps = 0;
	}
	
	public void addPerson(int t, String n, int date) throws YoungerException, DayException {
		attemps++;
		Person p = new Person(t, n);
		if(p.getType().equals("ti")) {
			throw new YoungerException();			
		}
		else {
			char penum = n.charAt(n.length()-2);
			String chain = ""+penum;			
			int num = Integer.parseInt(chain);
			boolean pairDate = isPairDate(date);
			boolean pairDay = isPairDay(num);
			if(pairDate==false&&pairDay==true || pairDate==true&&pairDay==false) {
				persons.add(p);
				System.out.println("The person has been added successfully\n");
					
			}else {
				throw new DayException();
			}
			
		}
		
	}
	
	public boolean isPairDate(int date) {
		boolean isPair = false;
		if(date%2==0) {
			isPair = true;
		}
		return isPair;
		
	}
	
	public boolean isPairDay(int num) {
		boolean isPair = false;
		if(num%2==0) {
			isPair = true;
		}
		return isPair;
		
	}

	public int getAttemps() {
		return attemps;
	}

	public void setAttemps(int attemps) {
		this.attemps = attemps;
	}
	

}
