package pt_pt.Dserl.Controller;



import javax.xml.transform.Result;
import java.sql.*;


public class DserlManager {



    //SQL HARD-CODE//
    private Connection myConn = null;
    private String dbUrl = "jdbc:mysql://localhost:3306/nasadserlmodel?useSSL=false";
    private String user;
    private String pass;
    private static Connection connection;
    ////////////////

    public boolean testConnection(String user, String pass){
        boolean state = false;
        try{
            Connection myConn = DriverManager.getConnection(dbUrl,"root","root");
            System.out.println("Connection Successful.");
            state = true;
            connection = myConn;
        }
        catch (SQLException e) {
            System.out.println("Failed connection.");
            state = false;
        }
        return state;
    }

    public Connection getConnection() {
        return myConn;
    }
}

