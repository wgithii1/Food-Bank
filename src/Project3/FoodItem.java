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
public class FoodItem extends FoodBank {
    
    private boolean tpye; 
    private int amount; 

    public FoodItem(boolean tpye, int amount) {
        this.tpye = tpye;
        this.amount = amount;
    }

    public boolean isTpye() {
        return tpye;
    }

    public void setTpye(boolean tpye) {
        this.tpye = tpye;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
    
}
