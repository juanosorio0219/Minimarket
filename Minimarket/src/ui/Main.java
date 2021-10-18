package ui;

import java.time.LocalDate;
import java.util.Scanner;

import exceptions.DayException;
import exceptions.YoungerException;
import model.Market;

public class Main {
	public static Scanner lector = new Scanner(System.in);
	private Market market = new Market();
	
	public static void main(String[] args) throws YoungerException, DayException {
		Main main = new Main();
		boolean salir = false;
		int option;
		while (!salir) {
				System.out.println("Welcome to the menu:\n1.Add person \n2.Show login attemps \n0.Exit");
				try {
				option=lector.nextInt();
				switch(option){
					case 1:
						main.addPerson();					 
					break;				
					case 2:
						main.showAttemps();					
					break;
					case 0:
						salir = true;
				
					default:
					System.out.println("\nThe option entered is not valid");
					break;
				}
				}
				catch(YoungerException e) {
					System.out.println(e.getMessage());
				}
				catch(DayException e) {
					System.out.println(e.getMessage());
				}
		}
		
	}
	
	private void addPerson() throws YoungerException, DayException {
		System.out.println("\nEnter the document type: \n1.TI \n2.CC \n3.PP \n4.CE");
		int t = lector.nextInt();
		lector.nextLine();
		System.out.println("\nEnter the number");
		String n = lector.nextLine();
		int date = LocalDate.now().getDayOfMonth();
		market.addPerson(t,n,date);		
	}
	
	private void showAttemps() {
		int attemps = market.getAttemps();
		String message = "\nThe total attemps is: "+attemps;
		System.out.println(message);
		
	}
	public Main() {
		market = new Market();
		
	}

}
