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
public class Perishable {
    
    private int dairy; 
    private int meats; 
    private int fruits; 
    private int expiration; 

    public Perishable(int dairy, int meats, int fruits, int expiration) {
        this.dairy = dairy;
        this.meats = meats;
        this.fruits = fruits;
        this.expiration = expiration;
    }

    public int getDairy() {
        return dairy;
    }

    public void setDairy(int dairy) {
        this.dairy = dairy;
    }

    public int getMeats() {
        return meats;
    }

    public void setMeats(int meats) {
        this.meats = meats;
    }

    public int getFruits() {
        return fruits;
    }

    public void setFruits(int fruits) {
        this.fruits = fruits;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }
    
    
}
