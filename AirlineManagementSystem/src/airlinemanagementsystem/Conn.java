
package airlinemanagementsystem;

import java.sql.*;


public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
             String url = "jdbc:mysql://localhost/";
            String dbName = "javaproject";
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c = DriverManager.getConnection(url+dbName,"root","");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
