package aaa;

public class javac {

	 private String message;

	   //Constructor
	   //@param message to be printed
	   public void MessageUtil(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
	
}
