 package ATMkeyactions;
 import java.sql.*;
 import java.util.Date;
import java.sql.DriverManager;
import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 
public class InfoMigration {
   Connection connection=null;
   PreparedStatement statement=null;
   private   String strtbml;
   private     TextField fnm;
   private     TextField lnm;
   private    TextField mob;
   private    TextField bal;
   public   int   cnt=0;
 public InfoMigration( TextField fnm,TextField lnm , TextField mobno,TextField balncef) {
        this.cnt=0;
        this.lnm=lnm ;
        this.fnm=fnm;
        mob=mobno;
        bal=balncef;
  }

    public InfoMigration() {
           
    }

 public String  getBalance( ){
     
       String srbal= balncevalidation(bal.getText().trim());
       return srbal;
    }
 
public String  getfnm(){
   String srf= infovalidation(fnm.getText().trim());
         return srf ; 
   } 
public String  getlnm(){
   
//    String srl="last name must  be filled:";
    String srl= infovalidation(lnm.getText().trim() );
    
            return srl ;
   } 

public String  getmob(){
   
    
    String srmob=mobvaldn(mob.getText().trim());
    
            return srmob;
   }
 
public String infovalidation(String tlnm  ){
   String  tlnmi=tlnm.trim();
    if(  tlnmi.isEmpty()) 
          tlnmi="❎ name required❓";
     
    else   {
      for(int i=0;i< tlnmi.length();i++) {
          
//          if(tlnmi.length()<=0)
//             tlnmi = "name is required"; 
          if((Character.isLetter(tlnmi.charAt(i)) && i==tlnmi.length()-1  )){
              tlnmi=""; 
              cnt++;
            }
          
          else if(!(Character.isLetter(tlnmi.charAt(i)) ) ){
            tlnmi="❎ must contain only letters❓";
            break; }
          }
      
     }     
   return tlnmi;
   }
 public String mobvaldn(String srmob  ){
    String mobsr=srmob;
    if(  mobsr.isEmpty()) 
          mobsr="❎  phone number required❓";
      
    else if(mobsr.length()==10){
        for(int i=0;i< mobsr.length();i++) {
           
             if(!(Character.isDigit(mobsr.charAt(i)))){
                mobsr="❎ must contain only digits❓";
               break;}
            
             if( i== mobsr.length()-1 &&Character.isDigit(mobsr.charAt(i))) {
                  char cr=mobsr.charAt(0);
                  String sr0=0+"";
                   char crc=mobsr.charAt(1);
                  String sr2=9+"";
                if(sr0.charAt(0)==cr&& sr2.charAt(0)==crc ) { 
                   mobsr="";
                   cnt++;  }
                else 
                   mobsr="❎ must start with 09 ❓";
                 break;
                }
//            else if(!(Character.isDigit(mobsr.charAt(i)))){
//               mobsr="must contain only digits";
//              break;} 
           }
       
       }
    else if ( mobsr.length()!=10) 
        for(int i=0;i< mobsr.length();i++) {
             if( i== mobsr.length()-1 &&Character.isDigit(mobsr.charAt(i))) { 
                 mobsr= "❎ must be 10  digits❓"; 
                 break;
                  }
            else if(!(Character.isDigit(mobsr.charAt(i)))){
                mobsr="❎ must contain only digit❓";
               break;}
     }
      
     return mobsr;
   }
 //balance

    public void migratemethod( Label id, Label digi,Label pin) throws SQLException, ClassNotFoundException {
     
        Date date = new Date();
        Double  balnce =Double.parseDouble( strtbml) ;
        int rann =0000;
        String bolacv="✔" ;
            Class.forName("com.mysql.jdbc.Driver");
        String quer= "INSERT INTO `customer`(`Fname`, `Lname`, `Phonnumber`, `Accntnumber`, `ID`, `Pinnumber`, `Balance`, `Datecrea`, `Rnumber`, `Active`) VALUES "
                + "(?,?,?, ?,?,?,? ,?,?,?)";
        
        connection = DriverManager.getConnection("jdbc:mysql://localhost/atm_db" , "root", "root@abew");
        statement=connection.prepareStatement(quer);
        statement.setString(1,fnm.getText().trim());
        fnm.setText("");
        statement.setString(2,lnm.getText().trim() );
        lnm.setText("");
        statement.setString(3,mob.getText().trim() );
        mob.setText("");
        statement.setLong(4,Long.parseLong(id.getText().trim()) );
        id.setText("");
        statement.setLong(5,Long.parseLong(digi.getText().trim()) );
        digi.setText("");
        statement.setLong(6,Long.parseLong(pin.getText().trim()) );
        pin.setText("");
        statement.setDouble(7,balnce );
        statement.setString(8, date.toString() );
        statement.setInt(9,rann );
        statement.setString(10, bolacv);
        statement.executeUpdate();
          }

 public String balncevalidation(String balnc) {
     int countpt=0;
     String  srbal=balnc.trim();
     strtbml= bal.getText().trim();
           if( srbal.isEmpty()){ 
           strtbml="0.0";
           cnt++;
           srbal="";
            }
       else if( !srbal.isEmpty()) 
           for(int i=0;i< srbal.length();i++) {
             char point='.';  
            if( (Character.isDigit(srbal.charAt(i)))|| srbal.charAt(i)==point){
              if(srbal.charAt(i)==point) 
                countpt++;
             if(2 <=countpt ||srbal.length() ==countpt ){ 
                srbal="❎ use only 1 point!";
                break;}
              
               if( i==srbal.length()-1 &&srbal.charAt(i)==point)   
                 { 
                strtbml= bal.getText().trim() ;
                cnt++;
                srbal=""; 
                break;  }
               
              if( i==srbal.length()-1 &&countpt<=1)   
                 { 
                strtbml= bal.getText().trim() ;
                cnt++;
                srbal=""; 
                break;  }
//                 { 
//                strtbml="0.0";
//                cnt++;
//                srbal=""; 
//                break;  } 
               }
        
        
        else  { 
                 srbal= "❎ must be  digits❓"; 
                 break; } 
           }
       return srbal;
       
     }
 
          
      }
 