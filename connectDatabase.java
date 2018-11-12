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

public class connectDatabase {
    public void submitQuery(int num, String accname, String cat, double amn, String transname ){
        String host, user, password;
        
        //host = x;
        //user = y;
        //password = z;
        
        try{
            host = "jdbc:derby://localhost:1527/Expense";
            user = "username";
            password = "password";
            Connection conn = DriverManager.getConnection(host, user, password);
            Statement stmt = conn.createStatement();
            String numstr = Integer.toString(num);
            String amnstr = Double.toString(amn);
            String sql = numstr + ", '" + accname + "', '" + cat + "', " + amnstr + ", '" + transname + "')";
            stmt.executeUpdate("INSERT INTO EXPENSES " + "VALUES (" + sql);
            conn.close();
        }
        catch ( SQLException err ){
            System.err.println(err.getMessage());
        }
    }
}


