 
package cardlesspackag;
 import javafx.stage.Stage;
import ATMkeyactions.InfoMigration;
import atm_.management_.system.ATM;
import atm_.management_.system.ATMdefaultScenne;
import atm_.management_.system.ClssFTxtFlT;
import atm_.management_.system.adinerface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class CardlessBalance implements adinerface {
private Connection connection;
private Label showacionlabel ;
    private Label showacionlabel1;
    private TextField blf;
    private Label balceerror;
    private Label balance;
    private static  double  bal;
     private  static  int  rpnn;
     private  static  String  phone;
    CardlessBalance() {
    }
 
 
  double checkBalance(double aDouble, double dbblnce) {
      System.out.println("Database connected"+aDouble);
  
        return aDouble-dbblnce;
    
    }
//    CardlessBalance(double aDouble, double dbblnce) {
//         bal=aDouble;
//    ball=dbblnce;
//    }
  
 void cardlessbalance(double aDouble,int  rpn,String  trim  ) throws ClassNotFoundException, SQLException {
     btnZero.setOnMouseClicked(e
                -> numberClicked(e ));
     btnOne.setOnMouseClicked(e
                -> numberClicked(e ));
        btnTwo.setOnMouseClicked(e
                -> numberClicked(e ));
        btnThree.setOnMouseClicked(e
                -> numberClicked(e ));
        btnFour.setOnMouseClicked(e
                -> numberClicked(e ));
        btnFive.setOnMouseClicked(e
                -> numberClicked(e ));
        btnSix.setOnMouseClicked(e
                -> numberClicked(e ));
        btnSeven.setOnMouseClicked(e
                -> numberClicked(e ));
        btnEight.setOnMouseClicked(e
                -> numberClicked(e ));
        btnNine.setOnMouseClicked(e
                -> numberClicked(e )); 
     clear.setOnMouseClicked(e
                 -> otherOperatorClicked(e));
     backspace.setOnMouseClicked(e
                 -> otherOperatorClicked(e));
    enter.setOnMouseClicked(e
                -> otherOperatorClicked(e));
    cancel.setOnMouseClicked(e
                -> otherOperatorClicked(e));
       
     
     
     
     
     
     bal=aDouble;
     rpnn=rpn;
     phone=trim;
      Button conc = new Button("continue");
      conc.setFont( new Font( "Serif",15  ) ); 
     
     
         showacionlabel1 = new Label( " ");
         showacionlabel1.setFont( new Font( "Serif",20  ) );
         FlowPane fp=new FlowPane();
         Label regisraion = new Label("Cardless Withdrawal");
     
     blf= new TextField();
     balceerror = new Label( );
    balceerror.setFont( new Font( "Serif",20  ) );
     balance = new Label( "Enter the amount to withdraw:");
     regisraion.setFont( new Font( "Serif",30  ) );
     blf.setFont( new Font( "Serif",17  ) );
      balance.setFont( new Font( "Serif",20  ) ); 
      regisraion.setStyle(" -fx-text-fill: black;");
       
     blf.setMaxWidth(150);
     showacionlabel1 = new Label( "");
      showacionlabel  = new Label( "");
    showacionlabel1.setFont( new Font( "Serif",20  ) );  
    showacionlabel .setFont( new Font( "Serif",20  ) ); 
     GridPane gp = new GridPane();
           //gp.setAlignment(Pos.CENTER);
          gp.setHgap(0);  
          gp.setVgap(8); 
          
         gp.add(regisraion,1,0);
           gp.add(conc  ,0,17);
          gp.add(balance ,0,6);
           gp.add(blf,1,6); 
           gp.add(balceerror,2,6); 
           gp.add(showacionlabel1,1,8);
           gp.add(showacionlabel ,1,9);
           conc .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
       
             fp.setPadding(new Insets(0,0,0,0));
           fp.setStyle("-fx-background-color:red ; -fx-text-fill: darkslateblue;");
         fp.setStyle("-fx-background-color: BEIGE;");
         fp.getChildren().addAll(gp );
         StackPane root = new StackPane();
         root.getChildren().add(fp);
         ATM.p.getChildren().addAll(root);
         
    conc.setOnMouseClicked(e  ->  {
           CardLess card =new CardLess( 0);//wawawa
             card.cardlessmethod ( );
             });
   
 }   

    @Override
    public void otherOperatorClicked(MouseEvent e) {
         
       if ("clear".equals(((Button) e.getSource()).getText().trim())) {
           blf .clear();
       }
   
    if ("X".equals(((Button) e.getSource()).getText().trim())) {
            String result =   blf.getText();
           if(result.length()==0)
               blf.clear();
            else{
              result = result.substring(0, result.length() - 1);
              blf.setText(result);  }
               
           }
        double dbblncce ;
        
     if ("enter".equals(((Button) e.getSource()).getText().trim())) { 
           double balce=Double.parseDouble(blf.getText().trim()) ;
         
   
        CardlessValidateBalance  cardlessobj = new CardlessValidateBalance( );
//                mobnomr=mobno.getText().trim();
                String srbalff=cardlessobj.balncevalidation(blf.getText().trim());
//                String srpn=   rpaldn(rnum.getText().trim());  
        if(cardlessobj.cnt==1){
          System.out.println("Database connected"+phone+bal+rpnn+balce);
  
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
           dbblncce= this.checkBalance(bal,balce) ;
        
        if(dbblncce>=0){
            bal=dbblncce;
            String queryo1="UPDATE customer  SET Balance =? where Phonnumber=?" ;
            PreparedStatement statement =  connection.prepareStatement (queryo1);
            statement.setDouble(1, dbblncce);
            statement.setString(2, phone);
            statement.executeUpdate();
            System.out.println("Database connected"+dbblncce);
  
            showacionlabel . setStyle("  -fx-text-fill: green;");
            showacionlabel1. setStyle("  -fx-text-fill: green;");
            showacionlabel1.setText("✔ "+Double.parseDouble(blf.getText().trim())+"0 " +"birr debited from your account " );
            showacionlabel .setText("✔ available balance: "+dbblncce );
           }
        else  { showacionlabel1.setText("❎ you have insufficient balance,please choose less!");
        showacionlabel1. setStyle("  -fx-text-fill: red;");
        }
        
     connection.close(); 
     
      
     } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(CardlessBalance.class.getName()).log(Level.SEVERE, null, ex);
   
     }
    
   }  
        
    else balceerror.setText(srbalff);
        
        blf.clear();
         cardlessobj.cnt=0;
 }
  if ("cancel".equals(((Button) e.getSource()).getText().trim())) {  
            try { System.out.println("Database connected  ohhhhh" );
                Class.forName("com.mysql.jdbc.Driver"); 
                try {
                    int rnmbr=0;
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/atm_db", "root", "root@abew");
       String queryo1="UPDATE customer  SET Rnumber =? where Rnumber= ?" ;
                    PreparedStatement statement =  connection.prepareStatement (queryo1);
                     statement.setInt(1, rnmbr);
                    statement.setInt(2, rpnn);
                    statement.executeUpdate();
                    
   
                } catch (SQLException ex) {
                    Logger.getLogger(CardlessBalance.class.getName()).log(Level.SEVERE, null, ex);
                }
                 Stage sg=ATMdefaultScenne.primaryStage;
                
                ATMdefaultScenne srn=new ATMdefaultScenne();
                 srn.run(0);
               sg.close();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(CardlessBalance.class.getName()).log(Level.SEVERE, null, ex);
            }
      } 
     
  }
    @Override
    public void numberClicked(MouseEvent e) {
  blf .setText(   blf .getText() + ((Button) e.getSource()).getText());
         }
 

    
}
