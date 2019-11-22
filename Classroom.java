   
        
public class Classroom {        
	public static void  main(String[] args) {
	    
	Wilder Denis = new Wilder ("Denis", true);
    Wilder Linda = new Wilder ("Linda", false);
    
    System.out.println(Denis.whoAmI());
    System.out.println(Linda.whoAmI());
	
	Denis.setPresent(false);
	System.out.println(Denis.whoAmI());
	
	
	System.out.println("And after tmmr " + Linda.getFirstname() + " wont be there either");
	
	Linda.setFirstname("Rebecca");
    System.out.println("Becasue she is going to the office to changer her name to: " + Linda.getFirstname());


       
		
	}
  }
  
