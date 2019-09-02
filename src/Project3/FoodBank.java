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
public class FoodBank {
    
    Scanner input = new Scanner(System.in);
   // UserAccount wow = new UserAccount(); 
    
    private ArrayList<FoodItem> items = new ArrayList<>(); 
    private ArrayList<UserAccount> accounts = new ArrayList<>();
    private ArrayList<String> donors = new ArrayList<>(); 
    private ArrayList<String> employees = new ArrayList<>(); 
    private ArrayList<String> volunteers = new ArrayList<>(); 
    private ArrayList<NonPerishable> nonPerishables = new ArrayList<>(); 
    private ArrayList<Perishable> perishables = new ArrayList<>(); 
    
    //FoodBank my = new FoodBank(); 
    
    
    public void addVolunteers(){
       // Volunteer person = new Volunteer(); 
    
        System.out.println(" What is your full name"); 
       String name = input.next(); 

       
        System.out.println(" What is your ID number");
       int id = input.nextInt(); 
        System.out.println(" What is your email"); 
       String email = input.next(); 
       
         UserAccount person = new UserAccount (" Volunteer" , name,id,email,2); 
       
       
   }
    
      public void addDonor(){
       // Volunteer person = new Volunteer(); 
   // Donor me = new Donor(); 
        System.out.println(" What is your full name"); 
       String name = input.next(); 
       donors.add(name); 
       
        System.out.println(" What is your ID number");
       int id = input.nextInt(); 
        System.out.println(" What is your email"); 
       String email = input.next(); 
       
        UserAccount person1 = new UserAccount (" Donor" , name,id,email,1); 
     
   }
        public void addEmployees(){
       // Volunteer person = new Volunteer(); 
    
        System.out.println(" What is your full name"); 
       String name = input.next(); 
       employees.add(name); 
        System.out.println(" What is your ID number");
       int id = input.nextInt(); 
        System.out.println(" What is your email"); 
       String email = input.next(); 
       
     UserAccount person = new UserAccount (" Employee" , name,id,email,3); 
       
   }
    public void addNonPerishable(){
        
        System.out.println(" How many canned foods do you have?"); 
       int canned = input.nextInt(); 
        System.out.println(" How many oats do you have"); 
       int  oats = input.nextInt(); 
        System.out.println(" How many are pasta"); 
       int pasta = input.nextInt(); 
        System.out.println(" What is the amount in total?"); 
       int amount = input.nextInt(); 
        NonPerishable food = new NonPerishable(canned,oats,pasta); 
    }

    public void addPerishable(){
        System.out.println(" How many dairy foods do you have?"); 
       int  dairy= input.nextInt(); 
        System.out.println(" How many meats do you have"); 
       int meat = input.nextInt(); 
        System.out.println(" How many fruits pasta"); 
       int fruit = input.nextInt(); 
        System.out.println(" What is the expiration date?"); 
        int expiration = input.nextInt(); 
        Perishable yum = new Perishable(dairy,meat,fruit,expiration); 
    }
    
    public void foodType( int m){
        
        if ( m == 1){
            addNonPerishable(); 
        }
        else if(m == 2){
            addPerishable(); 
        }
        
    
    }
    
    public void removeItem( FoodItem item){
        
    }
    public void removeAccount( UserAccount account){
        
    }
    
    public void word(){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Welcome to the food bank"); 
        System.out.println("Are you a Donor, Volunteer or an Employee"); 
        System.out.println(" Press 1 for Donor:");
        System.out.println(" Press 2 for Volunteer:");
        System.out.println(" Press 3 for Employee:");
        int num = input.nextInt(); 
        
          System.out.println(" What type of food item will you be giving today?");
         System.out.println("press 1 for NonPerishable");
         System.out.println("Press 2 for perishable"); 
        int m = input.nextInt();
  
        
        
        if ( num == 1){ 
         addDonor(); 
       
             foodType(m);
           
        }
        else if ( num == 2){
           addVolunteers(); 
           foodType(m); 
        }
        else if( num == 3 ){
            addEmployees();
             foodType(m); 
            
        }
        
        
        
    }
    
    public  FoodBank(){
        
        word(); 
        
        
        
    }
}
