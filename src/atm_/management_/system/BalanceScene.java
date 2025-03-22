package atm_.management_.system;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;//Scene
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
 
public class BalanceScene   {
  private static Double  bal ; 
  
 public BalanceScene(  Double blc) {
       bal= blc ;
    }

    BalanceScene() {
    }
 
 public void showbalance( ) {
      //BankDatabase atmBankDatabase=new  BankDatabase();
          
     Label balnce = new Label("Balance");
     Label availbal = new Label("Available balance:");
     Label ledgerbal = new Label("Ledger balance:");
     Label availeb = new Label("ETB:");
     Label ledgereb = new Label("ETB:");
     Label availbrr = new Label(bal+"0");
     
     
      Label ledgerbrr = new Label( );
     Button con = new Button("continue");
     ledgerbrr.setText(bal+"0");
     
     GridPane gp = new GridPane();
     gp.setHgap(20);  
     gp.setVgap(10); 
     gp.add(balnce,3,0);
     gp.add(availbal,2,1);
     gp.add(availeb,3,1);
     gp.add(ledgerbal,2,2);
     gp.add(ledgerbrr,4,2);
     gp.add(ledgereb,3,2);
     gp.add(availbrr,4,1);
     gp.add(con ,0,15);
     
     balnce.setFont( new Font( "Serif",35  ) );
     availbal.setFont( new Font( "Serif",20  ) );
     ledgerbal.setFont( new Font( "Serif",20  ) );   
     availeb.setFont( new Font( "Serif",20  ) );
     ledgerbrr.setFont( new Font( "Serif",20  ) );   
     availbrr.setFont( new Font( "Serif",20  ) );
    ledgerbrr.setFont( new Font( "Serif",20  ) );   
    ledgereb.setFont( new Font( "Serif",20  ) );   
    con.setFont( new Font( "Serif",15  ) );
       
   FlowPane fp=new FlowPane();
   fp.getChildren().addAll(  gp );
   fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
   balnce .setStyle("-fx-background-color:white ; -fx-text-fill: red;");
   con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
   
   StackPane root = new StackPane();
   root.getChildren().add(fp);
   ATM.p.getChildren().addAll(root);
   
    Mainmenu mmenu=new Mainmenu();
    con.setOnMouseClicked(e  ->  {
          try {
              mmenu.showmain(  );
          } catch (SQLException | ClassNotFoundException ex) {
              Logger.getLogger(BalanceScene.class.getName()).log(Level.SEVERE, null, ex);
          }
             
      }); 
           }

    
        
}