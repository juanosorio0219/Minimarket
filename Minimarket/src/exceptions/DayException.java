package exceptions;

public class DayException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DayException() {
		super("Can´t been added because today can´t enter these id´s numbers\n");
	}
	
	

}
