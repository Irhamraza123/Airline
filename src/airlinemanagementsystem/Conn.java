package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3305/airlinemanagementsystem", "root","786110Irham.");
            s= c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
