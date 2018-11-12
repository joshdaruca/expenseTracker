/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensetracker;
import java.sql.*;

/**
 *
 * @author paulinavarela
 */
public class SharedExpense extends Display {
    private double amountOwed;
    private boolean debt;
    private String correction;
    private String admin;
    private String adminPassword;
    
    
    //constructor to enter a Shared Expense
    public SharedExpense(){
        
    }
    
    //get and set functions for the Shared Expense class
    public void setAmountOwed(double x){
        amountOwed = x;
    }
    
    public double getAmountOwed(){
        return amountOwed;
    }
    
    public void setDebt(boolean x){
        debt = x;
    }
    
    public boolean getDebt(){
        return debt;
    }
    
    public void setCorrection(String x){
        correction = x;
    }
    
    public String getCorrection(){
        return correction;
    }
    
    public void setAdmin(String x){
        admin = x;
    }
    
    public String getAdmin(){
        return admin;
    }
    
    public void setAdminPassword(String x){
        adminPassword = x;
    }
    
    public String getAdminPassword(){
        return adminPassword;
    }
    
    public void whoOweswho(){
        
    }
    
    public double howMuchOwed(){
        double  value = 0;
        return value;
    }
    
    public void correctError(int expenseNum, String admin, String adminPassword){
        
    }
}
