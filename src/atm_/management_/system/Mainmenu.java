 package atm_.management_.system;
 //import static atm.management.system.ATM.ffp;
import java.sql.SQLException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button; 
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
public class Mainmenu   {
  Button bnm;
  private static  Double baln;
  private static String ffname ;
  private static  String llname ;
 
     Button blc = new Button ("     balance   ");
    Button whdr = new Button(" withdrawal  ");
    Button rsf = new Button ("    transfer  ");
    Button dps = new Button ("     deposit   ");
    Button pin = new Button ("  change pin  ");
    Button sm = new Button  ("ministatement");
//     Button cusmregs = new Button  ("admin");
    Label lb = new Label("         WELL COME");
     
           
      public Mainmenu(  ) {
        
     }
      public    Mainmenu(Double availbalnce) {
      baln=availbalnce ; 
     }
           

    public Mainmenu(  String ffname, String llname,Double baln ) {
        this(baln);
      this.ffname=ffname.toUpperCase();
      this.llname=llname.toUpperCase();
     }

         
  public void showmain( ) throws SQLException, ClassNotFoundException {
//           
//             
//            
//              
//               
//           Customer_registration   cusmreg=new Customer_registration(  );
//           
           
           
           
      // BankDatabase atmBankDatabase=new  BankDatabase();
        GridPane gp = new GridPane();
         gp.setPadding(new Insets(30,0,0,0));
         gp.setAlignment(Pos.CENTER);
         gp.setVgap(36);
         gp.setHgap(32);
        //atmBankDatabase.connecdb(0);
         Label fl = new Label(  ffname);
        Label ln = new Label( llname);
    
        
     
 
 
        
//        
//         gp.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
         lb.setFont( new Font( "Serif",20  ) );
         fl.setFont( new Font( "Serif",20  ) );
         ln.setFont( new Font( "Serif",20  ) );
         
         blc.setFont( new Font( "Serif",16  ) );
     sm.setFont( new Font( "Serif",16  ) );
      rsf.setFont( new Font( "Serif",16  ) );
     pin.setFont( new Font( "Serif",16  ) );
//     con.setFont( new Font( "Serif",15  ) );
     dps.setFont( new Font( "Serif",16  ) );
//     four.setFont( new Font( "Serif",15  ) );
     whdr.setFont( new Font( "Serif",16  ) );
     
      fl  .setStyle(" -fx-text-fill: red;"); 
      lb  .setStyle(" -fx-text-fill: red;"); 
      ln  .setStyle(" -fx-text-fill: red;"); 
      blc .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
     sm .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
      rsf .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
     dps .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
     whdr .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
     pin .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
//      con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;"); 
//      cusmregs .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
//   
         
 FlowPane fp=new FlowPane();
   fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
      StackPane pane = new StackPane();
        gp.add(sm,0,1);
        gp.add(blc,14,1);
        gp.add(rsf,0,2);
         gp.add(dps,14,3);
         gp.add(whdr,14,2);
         gp.add(pin,0,3);
          gp.add(lb,0,0);
          gp.add(fl,2,0);
          gp.add(ln,3,0);
//            gp.add(cusmregs,1,3);
//          if(cusmreg.isadmin!=true){
//              gp.add(cusmregs,1,3);
//             cusmregs.setVisible(false);
////          }
//           cusmregs. setOnMouseClicked(e  ->  {
//              cusmreg.regiser( );
//             });   
           
//       gp.add(con ,0,4);
          
       fp.getChildren().addAll(  gp );
       pane.getChildren().addAll(fp);
         ATMdefaultScenne.p.getChildren().addAll(pane);
         
         blc.setOnMouseClicked(e  ->  {
              BalanceScene  bal=new BalanceScene(baln );
              bal.showbalance( );
             }); 
         
       
        whdr.setOnMouseClicked(e  ->  {
           WithdrawalScene with =new WithdrawalScene( baln  );
             with.withdrawalmain (   );
             });       
        rsf.setOnMouseClicked(e  ->  {
            TransferScene  rmenu=new TransferScene( baln);
             rmenu.transfermenu( );
             });
          sm.setOnMouseClicked(e  ->  {
              Ministatement    minis=new Ministatement( );
             minis.showmini( );
             });
           dps.setOnMouseClicked(e  ->  {
               DepositScene depoob=new DepositScene( baln);
             depoob.deposimenu( );
             });
          pin.setOnMouseClicked(e  ->  {
               Change_pin  pn  =new Change_pin( baln);
             pn.changepinmain( );
             });
            blc.setOnMouseClicked(e  ->  {
              BalanceScene  balob=new BalanceScene( baln );
              balob.showbalance( );
             });  
         
    
    }
 
 
}
