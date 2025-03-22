 package atm_.management_.system;
import ATMkeyactions.Account;
import ATMkeyactions.UpdateItem;
 import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
 
public class WithdrawalScene   {
    private static double upbalce ;
    private static String bnbirr ;
    Label showacionlabel;
    Label showacionlabel1;
// public WithdrawalScene(String fname, String lname) {
//    }

  public  WithdrawalScene(double upbalc ) {
      upbalce=  upbalc;
    }

//  public  void setAvilableBalance(Double availbalnce) {
//      upbalce=availbalnce ; 
//     }
//    
    
    
    
  public void withdrawalmain (   ) {
      
//        showacionlabel1 = new Label( " ");
//         showacionlabel1.setFont( new Font( "Serif",20  ) );
//         showacionlabel1 .setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");
      
          //showacionlabel1.setMinWidth(350);
            
          
      
         showacionlabel = new Label( " ");
         showacionlabel.setFont( new Font( "Serif",20  ) );
         showacionlabel .setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");
         showacionlabel.setMinWidth(350);
                     
                 
        Button con = new Button("continue");
        Button two = new Button("200");
        Button three = new Button("300");
        Button four = new Button("400");
        Button five = new Button("500");
        Button one = new Button("100");
        Button otherbrr = new Button("Other amount"); 
        //TextField foher = new TextField(" " );
       Label foher = new Label(" Withdrawal");
       
       
    five .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
    one .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
    three .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
    four .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
    five .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
    two .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;"); 
    otherbrr .setStyle("-fx-background-color:darkslateblue ; -fx-text-fill: white;");
    foher. setStyle("-fx-background-color:white ; -fx-text-fill: red;");
      
    four.setMaxSize(120, 100);
    five.setMaxSize(120, 100);
     
    one.setMaxSize(150, 111);
    two.setMaxSize(120, 100);
    three.setMaxSize(120, 100);
        
        
           
     foher.setFont( new Font( "Serif",35  ) );
     one.setFont( new Font( "Serif",15  ) );
     five.setFont( new Font( "Serif",15  ) );
     three.setFont( new Font( "Serif",15  ) );
     con.setFont( new Font( "Serif",15  ) );
     two.setFont( new Font( "Serif",15  ) );
     four.setFont( new Font( "Serif",15  ) );
     otherbrr.setFont( new Font( "Serif",16  ) );
  
       GridPane gp = new GridPane();
//        gp.setStyle("-fx-background-color:yellow ; -fx-text-fill: darkslateblue;");
   //gp.setMaxSize(800, 323);
        // gp.setPadding(new Insets(5,0,5,5));
       
       //add(p2, BorderLayout.EAST); 
           gp.setAlignment(Pos.CENTER);
          gp.setHgap(7);  
          gp.setVgap(20); 
          
         gp.add(otherbrr, 13,4);
         gp.add(one,0,2);
         gp.add(two,0,3);
         gp.add(showacionlabel,2,3);
//          gp.add(showacionlabel1,2,4);
         gp.add(foher,4,1);
         gp.add(three,0,4);
          gp.add(four,13,2);
          gp.add(five,13,3);
          gp.add(con ,0,6);
           
         
       con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
       
   FlowPane fp=new FlowPane();
   fp.getChildren().addAll(  gp );
  
//  fp.setPadding(new Insets(0,0,10,0));
    fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
    StackPane root = new StackPane();
        root.getChildren().add(fp);
         ATM.p.getChildren().addAll(root);
         
       
      con.setOnMouseClicked(e   ->  {
          Mainmenu mmenu=new Mainmenu(upbalce);
            try {
                mmenu.showmain( );
            } catch (SQLException ex) {
                Logger.getLogger(WithdrawalScene.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(WithdrawalScene.class.getName()).log(Level.SEVERE, null, ex);
            }
             }); 
    
   
       
   
    otherbrr.setOnMouseClicked(e  ->  {
         WithdrawOther wihoher=new WithdrawOther(upbalce);
         wihoher.withdrwOther( ) ;
          
             });
    
    one.setOnMouseClicked(e
                -> birrButtonClickdd(e ));
    two.setOnMouseClicked(e
                -> birrButtonClickdd(e ));
    three.setOnMouseClicked(e
                -> birrButtonClickdd(e ));
    four.setOnMouseClicked(e
                -> birrButtonClickdd(e ));
    five.setOnMouseClicked(e
                -> birrButtonClickdd(e ));
            }
    
    
    
       

   public void birrButtonClickdd(MouseEvent e) {
       bnbirr=((Button) e.getSource()).getText();
     Double   upbalcce =Double.parseDouble(bnbirr);
          
         Account  accn=new Account(   );
       double bal=accn.checkSufficientce(upbalcce);
         if(bal<0.0){
                
                Account  accnn=new Account( upbalce );
             showacionlabel. setStyle("  -fx-text-fill: red;");
             showacionlabel.setText("❎ Insufficient balance ,please choose less!:"  );
         }
       else    {  
             
          try { BalanceScene  balob=new BalanceScene( bal );
               //balob.setCurrentBalance(bal);
              UpdateItem  updbal=new UpdateItem(  );
//               showacionlabel1. setStyle("  -fx-text-fill: green;");
//              showacionlabel1.setText("✔ press enter for check balance:"  );
//              
              showacionlabel. setStyle("  -fx-text-fill: green;");
              showacionlabel.setText("✔ "+upbalcce+"0 " +"birr debited from your account! "  );
              upbalce=bal;
              updbal. balanceupdate(bal);
              Account  accnn=new Account(bal);
          } catch (SQLException | ClassNotFoundException ex) {
              Logger.getLogger(WithdrawalScene.class.getName()).log(Level.SEVERE, null, ex);
          }
          
         }
        }
//laser
  }
    