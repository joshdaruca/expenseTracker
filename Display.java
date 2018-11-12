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
public class Display {
    private String category;
    private String date;
    private String nameOfTrans;
    private float totalTransAmn;
    
    public Display(){
        
    }
    
    public void setCategory(String x){
        category = x;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setDate(String x){
        date = x;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setNameOfTrans(String x){
        nameOfTrans = x;
    }
    
    public String getNameOfTrans(){
        return nameOfTrans;
    }
    
    public void setTotalTransAmn(float x){
        totalTransAmn = x;
    }
    
    public float getTotalTransAmn(){
        return totalTransAmn;
    }
    
//
}
