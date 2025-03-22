 //Database=Atm_db,table=Customer(Fname,Lname,Phonnumber,Accntnumber,ID,Pinnumber,Balance,Date,Rnumber,Active)
//  Character.toUpperCase(fnm.getText().trim().charAt(0));
  
package ATMkeyactions;
import atm_.management_.system.ATMdefaultScenne;
import atm_.management_.system.BalanceScene;
import atm_.management_.system.Change_pin;
import atm_.management_.system.Customer_registration;
import atm_.management_.system.DepositScene;
import atm_.management_.system.DepositToself;
import atm_.management_.system.Mainmenu;
import atm_.management_.system.Ministatement;
import atm_.management_.system.TransferScene;
import atm_.management_.system.WithdrawalScene;
 import java.sql.*;
import java.sql.DriverManager;


public class BankDatabase {
    private   static String fname="Abebe";
    private   static  String  lname="Tafere";     
    private static  Double  lavilbal;
   public static   int  pnn;
   private Connection connection;
   // private final Account[] accounts; // array of Accounts
    
    
  public   int connecdb(int str) throws SQLException, ClassNotFoundException {
     int srng = 0;
     System.out.println("Driver loaded");
     Class.forName("com.mysql.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
     System.out.println("Database connected");
     System.out.println();
  String query= "select * from customer where Pinnumber=?";
       PreparedStatement pst= connection.prepareStatement(query);
       pst.setInt(1, str);
       ResultSet resultSet = pst.executeQuery( ); 
 if( resultSet.next( )) {
     srng=str ;
     pnn=srng;
     ResultSetMetaData rsMetaData = resultSet.getMetaData();
     
   for (int i = 1; i <= rsMetaData.getColumnCount(); i++){
     System.out.printf("%-12s\t", resultSet.getObject(i));
     System.out.println();
     //pnn=   resultSet.getInt(3) ;
     lavilbal=   resultSet.getDouble(7) ;
     fname=   resultSet.getString(1) ;
     lname=   resultSet.getString(2) ;
       
    
        }
   System.out.println(fname+"kerrrrjkjj");
    System.out.println(lavilbal+"wha");
    System.out.println(lname+"kerrrrjkjj");
      setfname(fname);
      setlname(lname);
    // setAvilableBalance(lavilbal);
          //  Mainmenu mmenu=new Mainmenu( lavilbal );
             Mainmenu mmenu=new Mainmenu(fname,lname ,lavilbal);
             UpdateItem upd=new UpdateItem(srng);
             BalanceScene  bal=new BalanceScene( lavilbal);
             Account  accn=new Account( lavilbal);
             WithdrawalScene with =new WithdrawalScene(lavilbal);
             Change_pin  pn  =new Change_pin(fname,lname);
             TransferScene  rmenu=new TransferScene(fname,lname); 
             Ministatement    minis=new Ministatement(fname,lname);
             DepositScene depoob=new DepositScene(fname,lname);
             Customer_registration   cusmreg=new Customer_registration(fname,lname,lavilbal);
            ATMdefaultScenne srn=new ATMdefaultScenne();
            DepositToself depoself=new DepositToself(lavilbal);
      
 }
 
 
   connection.close();
   return  srng;
     
  }
  public String getfname() {
        return  fname.toUpperCase() ;
    }
 
 
  public void setfname(String fname) {
     this.fname=fname  ; 
    }
 
  public  void setlname(String lname) {
     this.lname=lname ; 
    }

  public    String getlname() {
        return  lname.toUpperCase() ;
   }
  public  void setAvilableBalance(Double availbalnce) {
      lavilbal=availbalnce ; 
     }
 
   public    Double getAvilableBalance() {
         return  lavilbal ;
    }
 
 
   }
    