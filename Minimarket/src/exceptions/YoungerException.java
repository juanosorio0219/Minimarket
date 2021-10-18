package exceptions;

public class YoungerException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public YoungerException(){
		super("Can´t been added because is younger\n");
		
	}

}
