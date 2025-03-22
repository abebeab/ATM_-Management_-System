 package atm_.management_.system; 
import ATMkeyactions.BankDatabase;
     import ATMkeyactions. EnterAction;
import java.sql.SQLException;
     import javafx.scene.control.TextArea;
     import javafx.geometry.*;  
     import javafx.scene.control.*;
     import javafx.scene.layout.*;
     import javafx.scene.layout.GridPane;
     import javafx.scene.Scene;
     import javafx.scene.layout.BorderPane;
     import javafx.scene.layout.HBox;
     import javafx.scene.text.Font;
     import javafx.stage.Stage;

 public class ATM   {
   Keypad kp;
    LoginerrorScene erlog;
    WithdrawalScene with;
    Change_pin  pn ;
    TransferScene  rmenu;
    Ministatement    minis;
    DepositScene depoob;
    Customer_registration   cusmreg;
      EnterAction cancelener;
     static    HBox hBox ;
   public  static  Stage primaryStage ;
     static  FlowPane ffp;
   public  static StackPane p;
     TextArea txtResult ;

    /**
     *
     */
     static PasswordField f;
     BorderPane pane = new BorderPane();
     Scene scene;
     Button cardless;
     int k;  
     Mainmenu mmenu=new Mainmenu();
     CustomerAccount   caccwn=new CustomerAccount();
     BalanceScene  bal;
     private Object con;
    private BankDatabase atmBankDatabase;

    public ATM() {
             
//             erlog  =new LoginerrorScene();
//             with =new WithdrawalScene( );
//             pn =new Change_pin( );
//             rmenu=new TransferScene( ); 
//             minis=new Ministatement( );
//             depoob=new DepositScene( );
//             cusmreg=new Customer_registration();
//              cancelener=new    EnterAction ();
        
          bal = new BalanceScene( );
    }
 public void run(int x   ) throws SQLException, ClassNotFoundException {
            
            
                
         GridPane  gp= new GridPane();
          f=new PasswordField (); 
           k=x;     
           cardless = new Button(" cardless");          
           cardless.setFont( new Font( "Serif",30  ) );
           cardless .setStyle("-fx-background-color:MAGENTA ; -fx-text-fill: BLACK;");
              
         txtResult = new TextArea("  ");
        txtResult.setEditable(false);
        txtResult.setMinWidth(850);
        txtResult.setMinHeight(360);
         f= new PasswordField();
         gp.setAlignment(Pos.CENTER);
         gp.setHgap(28.5); 
         gp.setVgap( 11);
         gp.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
        hBox = new HBox(  ); 
        kp =new Keypad(  );
        
      pane.setBottom(kp.getVBox( ));
      pane.setTop(getHBox(hBox));
      
     primaryStage =new Stage ();
     scene = new Scene(pane,950,700);
     primaryStage.setScene(scene);
     
   primaryStage.setTitle("                                                       ATM    Management   System"); // Set the stage title
   primaryStage.setResizable(false);// Place the scene in the stage
   primaryStage.setScene(scene);
   
   if(k==1)
     mmenu.showmain(  );
    
      mmenu.blc.setOnMouseClicked(e  ->  {
             bal.showbalance( );
             });
     mmenu.whdr.setOnMouseClicked(e  ->  {
             with.withdrawalmain( );
             });
     mmenu.rsf.setOnMouseClicked(e  ->  {
             rmenu.transfermenu( );
             });
     mmenu.sm.setOnMouseClicked(e  ->  {
             minis.showmini( );
             });
     mmenu.dps.setOnMouseClicked(e  ->  {
             depoob.deposimenu( );
             });
     mmenu.pin.setOnMouseClicked(e  ->  {
             pn.changepinmain( );
             });
     mmenu.blc.setOnMouseClicked(e  ->  {
             bal.showbalance( );
             });
    primaryStage.show(); 
   }         
    
   protected  HBox getHBox(HBox hBox  ) {
      ATM.hBox= hBox;
     return  hBox;
     
       } 
     }
//ee