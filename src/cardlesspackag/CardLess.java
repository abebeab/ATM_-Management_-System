 package cardlesspackag;
import ATMkeyactions.InfoMigration;
 import atm_.management_.system.ATM;
import atm_.management_.system.ClssFTxtFlT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
 
 public class CardLess extends ClssFTxtFlT{
    boolean bol=false;
    private TextField rnum;
    private TextField mobno;
    Label showacionlabel1;
    private Label fnmerror;
    private Label mobnomerror;
    private Connection connection;
    private   String mobnomr;
    private static  int  pnn;
  private  static int   ccnt=0;
  
    public CardLess(int i) {
        i=0;
    }
 
 public void cardlessmethod(){
          showacionlabel1 = new Label( " ");
         showacionlabel1.setFont( new Font( "Serif",20  ) );
         FlowPane fp=new FlowPane();
         Label regisraion = new Label("Cardless Withdrawal");
         rnum= new TextField("");
         mobno = new TextField( );
        fnmerror = new Label( );
        mobnomerror = new Label();
        
     mobno .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
     rnum .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
   
        Label lfnm = new Label("mobile number:");
        Label phone  = new Label("temporary  number:");
        fnmerror.setFont( new Font( "Serif",20  ) );
         mobnomerror.setFont( new Font( "Serif",20  ) );
         rnum.setFont( new Font( "Serif",25  ) );
         mobno.setFont( new Font( "Serif",25  ) );
        lfnm.setFont( new Font( "Serif",25  ) );
         phone.setFont( new Font( "Serif",25  ) );
         regisraion.setFont( new Font( "Serif",30  ) );
          rnum.setMaxWidth(200);
          mobno.setMaxWidth(200);
         rnum.setAlignment(Pos.CENTER);
         mobno.setAlignment(Pos.CENTER);
           
             
       GridPane gp = new GridPane();
         gp.setHgap(0);  
          gp.setVgap(8); 
          
         gp.add(regisraion,1,0);
         gp.add(lfnm,0,3);
         gp.add(mobno,1,3);
          gp.add(fnmerror,2,5);
          gp.add(mobnomerror,2,3);
          gp.add(phone ,0,5);
          gp.add(rnum,1,5);  
           gp.add(showacionlabel1,1,8);
         fp.setPadding(new Insets(0,0,0,20));
         fp.setStyle("-fx-background-color:red ; -fx-text-fill: darkslateblue;");
         fp.setStyle("-fx-background-color: BEIGE;");
         fp.getChildren().addAll(gp );
         StackPane root = new StackPane();
         root.getChildren().add(fp);
         ATM.p.getChildren().addAll(root);
      enter.setOnMouseClicked(e
             ->  otherOperatorClicked(e ));
    
    
      
      
      mobno.requestFocus ();
     btnZero.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnOne.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnTwo.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnThree.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnFour.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnFive.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnSix.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnSeven.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum  ));
     btnEight.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum ));
     btnNine.setOnMouseClicked(e
             -> numberClicked(e,mobno,rnum ));
     arrowdown.setOnMouseClicked(ev
             -> {
         rnum.requestFocus ();
         bolcnf=false;
         btnThree.setOnMouseClicked(evv
                 -> super.numberClicked (evv,mobno,rnum ));
         btnZero.setOnMouseClicked(e
                 ->super.numberClicked (e,mobno,rnum  ));
         btnFour.setOnMouseClicked(e
                 ->super.numberClicked (e,mobno,rnum   ));
         btnFive.setOnMouseClicked(e
                 -> super.numberClicked(e,mobno,rnum  ));
         btnOne.setOnMouseClicked(e
                 -> super.numberClicked (e,mobno,rnum  ));
         btnTwo.setOnMouseClicked(e
                 ->super.numberClicked (e,mobno,rnum   ));
         btnSix.setOnMouseClicked(e
                 ->super.numberClicked (e,mobno,rnum  ));
         btnSeven.setOnMouseClicked(e
                 -> super.numberClicked(e,mobno,rnum ));
         btnEight.setOnMouseClicked(e
                 -> super.numberClicked(e,mobno,rnum ));
         btnNine.setOnMouseClicked(e
                 -> super.numberClicked(e,mobno,rnum  ));
     });
     arrowupp.setOnMouseClicked(e->{
         mobno.requestFocus ();
         bolcnf=true;
         super.numberClicked(e,mobno,rnum   );
     });
     clear.setOnMouseClicked(e
             -> {
         try {
             otherOperatorClicked(e,mobno,rnum );
         }    catch (SQLException ex) {  
                  Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
              }  
     });
     cancel.setOnMouseClicked(e
             -> {
         try {
             otherOperatorClicked(e,mobno,rnum );
         }    catch (SQLException ex) {  
                  Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
              }  
     });
     backspace.setOnMouseClicked(e
             -> {
          
              try {
                  otherOperatorClicked(e,mobno,rnum );
              } catch (SQLException ex) {
                  Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
              }
          
     });
     enter.setOnMouseClicked(e
             ->  otherOperatorClicked(e ));
  
      
      
      
      
//       if(bol==true){
//             fnmerror.setText ( "✔ saved successfuly");
//            rnum.clear();
//             mobno.clear();
//             }
//            bol=false;

  
     
        }
 public   void checkbirr(int trim0, String trim ) throws SQLException, ClassNotFoundException {
 
     System.out.println("Driver loaded");
     Class.forName("com.mysql.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
     System.out.println("Database connected");
     System.out.println();
    String query= "select * from customer where Rnumber=? and Phonnumber=?";
       PreparedStatement pst= connection.prepareStatement(query);
       pst.setInt(1, trim0);
       pst.setString(2, trim);
       ResultSet resultSet = pst.executeQuery( ); 
 if(resultSet.next( )) {
      CardlessBalance upd=new CardlessBalance(  );
      upd.cardlessbalance(resultSet.getDouble(7), trim0,trim);
      }
 else  {
     fnmerror.setText("" );
     showacionlabel1.setText("❎ you are not a cutomer,please register!");
     showacionlabel1. setStyle("  -fx-text-fill: red;");
        }
    connection.close();     
         
       }

    @Override
    public void numberClicked(MouseEvent e) {
    
    }

    @Override
    public void otherOperatorClicked(MouseEvent e) {
    if ("enter".equals(((Button) e.getSource()).getText().trim())) {
       try {
      InfoMigration  infomig = new InfoMigration( );
                mobnomr=mobno.getText().trim();
                String srmob=infomig.mobvaldn(mobnomr);
                String srpn=   rpaldn(rnum.getText().trim());  
                 
        if(srpn==""&&infomig.cnt==1){
                 pnn=Integer.parseInt(rnum.getText().trim() ); 
                 checkbirr(pnn , mobnomr);
                //ccnt=0; 
              infomig.cnt=0;  
        }
        
       else{
            mobnomerror. setStyle("  -fx-text-fill: red;");
            fnmerror. setStyle("  -fx-text-fill: red;");
            mobnomerror.setText(srmob );
            fnmerror.setText(srpn );
            
             }
                 } catch (SQLException | ClassNotFoundException ex) {
                 Logger.getLogger(CardLess.class.getName()).log(Level.SEVERE, null, ex);
             }      
    
     }
    }
//ooooo
    private String rpaldn(String pn ) {
       
        String sr=pn;
        if( sr.length()==0) 
           sr="❎  temporary number required❓";
        for(int i=1;i< sr.length();i++) {
            if(!(Character.isDigit(sr.charAt(i)))){
               sr="❎ must contain only digits❓";
               ccnt=1;
                break;}
             }
         if(ccnt!=1&&sr.length()>0){
             
             
             if(sr.length()==5){
            ccnt=2;
            sr="";}
           
         else 
           sr=" ❎ must contain only 5 digits❓";   
          }  
         
         ccnt=0;
        return sr;
    
    
    }
     
    
 }//knlj