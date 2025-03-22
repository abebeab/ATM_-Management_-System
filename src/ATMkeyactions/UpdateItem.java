 package ATMkeyactions;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateItem{
     private static  int pin;
     private Connection connection;
 
 public UpdateItem(int srng) throws SQLException {
        pin=srng; }
 public UpdateItem() throws SQLException, ClassNotFoundException {
                 Class.forName("com.mysql.jdbc.Driver");

     connection= DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
    }
 public String plfname(String fname){
     return  fname;
   }
 public String pllname (String lname ){
     return  lname ;
  } 
  
 public void pinchangedb(int parseInt) throws SQLException, ClassNotFoundException {
    //Class.forName("com.mysql.jdbc.Driver");
    int pn=parseInt;
   //connection= DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
          System.out.println("Database connected");
          String queryo="UPDATE customer  SET Pinnumber =? WHERE Pinnumber =?" ;
          System.out.println();
          PreparedStatement statement =  connection.prepareStatement (queryo);
          statement.setInt(1, pn);
          statement.setInt(2, pin);
          statement.executeUpdate();
     }  
 public void balanceupdate(double upbalce  ) throws SQLException, ClassNotFoundException {
     
         String queryo="UPDATE customer  SET Balance =? WHERE Pinnumber =?" ;
          PreparedStatement statement =  connection.prepareStatement (queryo);
          statement.setDouble(1, upbalce);
          statement.setInt(2, pin);
          statement.executeUpdate();
        }
 public String checkAccountdb(String accn,double dblblnce  ) throws SQLException, ClassNotFoundException {
      Long lg=Long.parseLong(accn);
      String srng=null;
     Class.forName("com.mysql.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
     System.out.println("Database connected");
     System.out.println();
  String query= "select * from customer where Accntnumber=?";
       PreparedStatement pst= connection.prepareStatement(query);
       pst.setLong(1, lg);
       ResultSet resultSet = pst.executeQuery( ); 
 if( resultSet.next( )) {
     double dbblnce;
      srng="yes" ;
    dbblnce=dblblnce+resultSet.getDouble(7);
      
   String queryo1="UPDATE customer  SET Balance =? WHERE Accntnumber =?" ;
          PreparedStatement statement =  connection.prepareStatement (queryo1);
          statement.setDouble(1,   dbblnce);
          statement.setLong(2, lg);
          statement.executeUpdate();
   }
 System.out.println(srng);
    
 return srng;
}
}