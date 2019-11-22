public class Wilder {                                                       // Class

    
    private String Firstname;                                               // Attributes
    private boolean Present;
    
    
    public Wilder(String name) {                                            // Constructor 1 allows to set only name
        this.Firstname = Firstname;
        this.Present = false;
    }
    public Wilder(String Firstname, boolean Present) {                      // Constructor 2 "" name & Present
        this.Firstname = Firstname;
        this.Present = Present;
    }
  

    public void setPresent(boolean Present) {                               // Setter Present
        this.Present = Present;
    }
    public void setFirstname(String Firstname) {                            // Setter Firstname
        this.Firstname = Firstname;
    }
    
    public boolean isPresent() {                                            // Getter Presennt
        return this.Present;
    }
    public String getFirstname() {                                          // Getter Firstname
        return this.Firstname;
    }


    public String whoAmI(){                                                 // Method that returns name & if present
       
       if  (Present == true) {
            return "My name is " + this.Firstname + " and I am present ";
            }else{
            return "My name is " + this.Firstname + " and I am not present ";
     }
    }
 }       
       
       
