/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensetracker;
import java.sql.Statement;

/**
 *
 * @author paulinavarela
 */
public class Expense extends Display{
    private int expenseNum;
    private String accountName;
    private String correction;
    
    public Expense(String accountName, int expenseNum, String category, String time, float totalTransAmn){
        //push to the database
    }
    
    public void setExpenseNum(int x){
        expenseNum = x;
    }
    
    public int getExpenseNum(){
        return expenseNum;
    }
    
    public void setAccountName(String x){
        accountName = x;
    }
    
    public String getAccountName(){
        return accountName;
    }
    
    public void setCorrection(String x){
        correction = x;
    }
    
    public String getCorrection(){
        return correction;
    }
    
    public void correctError(int expenseNum){
        //get the record with the expense number
        //once the row is retrieved setText of box with that
        //and then once edit is pressed get the text and update the record
    }
    

}
