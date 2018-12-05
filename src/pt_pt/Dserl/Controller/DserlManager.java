package pt_pt.Dserl.Controller;



import pt_pt.Dserl.Model.PlanetType;
import pt_pt.Dserl.utility.ExceptionHandler;

import javax.xml.transform.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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

    public List planetarianTypes(){
        ResultSet planetType = null;
        List<PlanetType> planetTypeList = new ArrayList<>();
        try{
            Connection myConn = DriverManager.getConnection(dbUrl,"root","root");
            Statement st = myConn.createStatement();
            String statement = "select * from planettype";
            planetType = st.executeQuery(statement);
            while (planetType.next()){
                PlanetType typeplanet = new PlanetType();
                typeplanet.setIdType(planetType.getInt("idType"));
                typeplanet.setPlanetType(planetType.getString("Type"));
                planetTypeList.add(typeplanet);
            }
        }
        catch (Exception ex){
            ExceptionHandler.ThrowEX(ex);
        }
        return planetTypeList;
    }


}

