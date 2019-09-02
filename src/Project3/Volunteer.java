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
public class Volunteer {
    
    private String name; 
    private String email; 
    private int id; 

    public Volunteer (String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.email = email;
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
    
    
    public void setEmail(String email){
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
