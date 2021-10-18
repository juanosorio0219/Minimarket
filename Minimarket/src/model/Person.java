package model;

public class Person {
	public final static String TI = "ti";
	public final static String CC = "cc";
	public final static String PP = "pp";
	public final static String CE = "ce";
	
	private String type;
	private String number;
	
	public Person(int t, String n) {
		type = setType(t);
		this.number = n;
	}

	public String setType(int t) {
		String type = "";
		if(t==1) {
			type=TI;
		}
		else if(t==2){
			type=CC;
		}
		else if(t==3) {
			type=PP;
		}
		else if(t==4) {
			type=CE;
		}
		return type;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}
	
	
	
	
	

}
