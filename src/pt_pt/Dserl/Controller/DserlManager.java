package pt_pt.Dserl.Controller;



import pt_pt.Dserl.Model.PlanetType;
import pt_pt.Dserl.utility.ExceptionHandler;
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

    public void verifyLogin(String username, String password){

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

    public void catalogPlanet(String name,int code,double size,int discoveryDate,int planetType,double orbit,double dayTime,String description){
        try
        {
            Connection myConn = DriverManager.getConnection(dbUrl,"root","root");
            // the mysql insert statement
            String query = " insert into planet (Name, Code, Size, DiscoveryDate, PlanetType, Orbit, Daytime, description_notes, planetmodel)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setString (1, name);
            preparedStmt.setInt    (2, code);
            preparedStmt.setDouble (3, size);
            preparedStmt.setInt    (4, discoveryDate);
            preparedStmt.setInt    (5, planetType);
            preparedStmt.setDouble (6, orbit);
            preparedStmt.setDouble (7, dayTime);
            preparedStmt.setString (8, description);
            preparedStmt.setString (9, "3d_null_fornow_but_working_as_blob");
            preparedStmt.execute();

            myConn.close();
        }
        catch (Exception ex)
        {
            ExceptionHandler.ThrowEX(ex);
        }
    }
}

