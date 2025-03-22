 package atm_.management_.system;
//import ATMkeyactions.Transaction;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
 public class DepositScene    {
     private static  Double baln;
    public DepositScene(String fname, String lname) {
    }

    public DepositScene(Double balnn) {
       baln=balnn;  
        
    }
 //first the machine check wether the birr note is counterfeight ,
    //teared out,blured,or the  coin is rusted,alse arrangementoof different birr note
  public void deposimenu( ) {
        Button con = new Button("continue");
         Button self = new Button("For yourself");
         Button oher = new Button("For others");
          Label amn = new Label("Enter the amount to deposite:");
         Label depo = new Label("Deposit");
         TextField amnf = new TextField(" " );
        
         depo.setFont( new Font( "Serif",40  ) );
          amn.setFont( new Font( "Serif",20  ) );
         self.setFont( new Font( "Serif",15  ) );
         oher.setFont( new Font( "Serif",14  ) );
        con.setFont( new Font( "Serif",15  ) );
        amnf.setFont( new Font( "Serif",20  ) );
         amnf.setMaxSize(150, 160);
         oher.setMaxSize(140, 150);
         
         GridPane gp = new GridPane();
           gp.setHgap(27); 
           gp.setVgap( 14);
            gp.add(depo,7,5);
//         gp.add(amn,1,1);
//        gp.add(amnf,2,1);
         gp.add(self,20,11);
          gp.add(oher,20,13);
        gp.add(con ,0,13);
        
      FlowPane fp=new FlowPane();  
         fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
    depo. setStyle("-fx-background-color:white ; -fx-text-fill: red;");
     amnf .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
      con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
       self .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
     oher .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
       
  fp.getChildren().addAll(gp );
         StackPane root = new StackPane();
        root.getChildren().add(fp);
         ATM.p.getChildren().addAll(root);
         
  self.setOnMouseClicked(e  ->{
           DepositToself depoself=new DepositToself(baln); 
        depoself.selfdeposi(); } );
        
  con.setOnMouseClicked(e  ->  {
       Mainmenu mmenu=new Mainmenu(baln);
            try {
                mmenu.showmain( );
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(DepositScene.class.getName()).log(Level.SEVERE, null, ex);
            }
             }); 
  oher.setOnMouseClicked(e  ->  {
       DepositToOther depoher=new DepositToOther( baln);
             depoher.deposittothr( );
               });
         }

   
     }
