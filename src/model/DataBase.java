/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class DataBase {
    public static Connection mycon(){
        Connection con = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test_database?useSSL=true&requireSSL=true&allowPublicKeyRetrieval=true";
            con = (Connection) DriverManager.getConnection(url,"root","salma"); 
        }catch(Exception e ){
            System.out.print(e);
        }
        return con;
    }
    
    
}
