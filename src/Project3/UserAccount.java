/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project3;
import java.util.*;
/**
 *
 * @author fireb
 */
public class UserAccount extends FoodBank {
    
    private Volunteer accountType1; 
    private Employee accountType2; 
    private Donor accountType3; 
    
    private int number; 
    private String accountType;
    private int id; 
    private String name; 
    private String email; 
    private ArrayList<Volunteer> volunteers = new ArrayList<>(); 
    private ArrayList<Employee> employees = new ArrayList<>(); 
    private ArrayList<Donor> donors = new ArrayList<>();
    private ArrayList<String> ppl = new ArrayList<>(); 
    
    
   public UserAccount(String accountType, String name, int id, String email, int number){
        this.accountType = accountType; 
        this.name = name; 
        this.id = id; 
        this.email = email;
        this.number = number; 
        
    } 

   /* public UserAccount(Volunteer accountType1, Employee accountType2, Donor accountType3) {
        this.accountType1 = accountType1;
        this.accountType2 = accountType2;
        this.accountType3 = accountType3;
    }
    */
   
   String sds = getName(); 
   String eml = getEmail(); 
   int num = getId(); 
  int  numbr = getNumber();
  
  

    public String getAccountType() {
        return accountType;
    }
/*
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
     public void addEmployee( Volunteer accountType) {
        
     volunteers.add(accountType); 
    }
      public void addVolunteer( Employee accountType) {
        
      employees.add(accountType); 
    }
       public void addDonor( Donor accountType) {
        
      donors.add(accountType); 
    }
     
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
   public void hopefully(){
       if (numbr == 1){
           Donor per = new Donor( sds,eml,num);
           per.storeName();
       }
       else if ( numbr == 2){
           Volunteer per2 = new Volunteer( sds,eml,num);
       }
       else{
           Employee per = new Employee( sds,eml,num);
       }
       
   }
   
  
}
