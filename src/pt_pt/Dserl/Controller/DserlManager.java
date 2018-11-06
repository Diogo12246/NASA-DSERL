package pt_pt.Dserl.Controller;



import java.sql.*;


public class DserlManager {



    //SQL HARD-CODE//
    private Connection myConn = null;
    private Statement myStmt = null;
    private ResultSet Rs = null;
    private String dbUrl = "jdbc:mysql://localhost:3306/nasadserlmodel?useSSL=false";
    private String user;
    private String pass;
    ////////////////

    public boolean testConnection(String user, String pass){
        boolean state = false;
        try{
            Connection myConn = DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("Connection Successful.");
            state = true;
        }
        catch (SQLException e) {
            System.out.println("Failed connection.");
            state = false;
        }
        return state;
    }

   /* public void SqlGetPlanets() {
        try{
            Connection myConn = DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("Connection Successful.");
            System.out.println("************************");
            myStmt = myConn.createStatement();
            Rs = myStmt.executeQuery("Select * from planet order by DiscoveryDate");
                while (Rs.next()){
                    System.out.println(Rs.getString("Name") + ", " + Rs.getString("Type") + ", Discovery Date: " + Rs.getString("DiscoveryDate"));
                }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                System.out.println("************************");
                if (myConn != null){
                    myConn.close();
                }
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    } */

   /*
    public void SqlInsPlanets(String user, String pass) {
        try{
            Connection myConn = DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("Connection Successful.");
            System.out.println("************************");

            String name = "teste";
            int Code = 00;
            double size = 00;
            int DiscoveryDate = 00;
            String Type = "teste";
            double Orbit = 00;
            double DayTime = 00;

            PreparedStatement ps =
                myConn.prepareStatement(
            "INSERT IGNORE INTO planet (Name,Code,Size,DiscoveryDate,Type,Orbit,DayTime)" +
                "VALUES (?,?,?,?,?,?,?)");
                ps.setString(1,name);
                ps.setInt(2,Code);
                ps.setDouble(3,size);
                ps.setInt(4,DiscoveryDate);
                ps.setString(5,Type);
                ps.setDouble(6,Orbit);
                ps.setDouble(7,DayTime);
                ps.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                System.out.println("************************");
                if (myConn != null){
                    myConn.close();
                }
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
*/
}



