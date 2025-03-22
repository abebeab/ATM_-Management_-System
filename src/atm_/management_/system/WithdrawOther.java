 package atm_.management_.system;
import ATMkeyactions.Account;
import ATMkeyactions.UpdateItem;
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
 
public class WithdrawOther   implements adinerface {
    
     Label showerror;
    TextField anmttettf;
     private static  int   cnt=0;
    private   String strtbml;
     private static  Double  balance=0.0;
     private  Button con;

    WithdrawOther(double upbalc ) {
       balance=upbalc; }

    WithdrawOther() {
    }
     public void withdrwOther( ) {
       
        showerror = new Label( " ");
         showerror.setFont( new Font( "Serif",20  ) );
         showerror .setStyle("-fx-background-color: BEIGE ;-fx-text-fill: red;");
         showerror.setMinWidth(350);
        
         
         
         Label entmmt = new Label("           Enter the amount  to withdraw:");
         con = new Button("continue");
          anmttettf= new TextField(" " );
           entmmt.setFont( new Font( "Serif",24  ) );   
          con .setFont( new Font( "Serif",16  ) );   
         anmttettf.setFont( new Font( "Serif",24  ) );   
           anmttettf.setMaxWidth(200);
           
          anmttettf .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
           GridPane gp = new GridPane();
//        gp.setStyle("-fx-background-color:yellow ; -fx-text-fill: darkslateblue;");
         gp.setMaxSize(800, 323);
         gp.setPadding(new Insets(0,20,0,0));
           gp.setAlignment(Pos.CENTER);
           
          gp.setHgap(1) ;
          gp.setVgap(20);
          
         gp.add(entmmt,0,2);
         gp.add(anmttettf ,1,2);
         gp.add(showerror ,1,6);
         gp.add(con ,0,8);
         
   con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
    FlowPane fp=new FlowPane();
   fp.getChildren().addAll(  gp );
    //fp.setPadding(new Insets(2,10,10,10));
      fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
      StackPane root = new StackPane();
      root.getChildren().add(fp);
     ATM.p.getChildren().addAll(root);
       
   con.setOnMouseClicked(e  ->  {
           try {
               Mainmenu mmenu=new Mainmenu(balance);
               mmenu.showmain(  );
               
           } catch (SQLException | ClassNotFoundException ex) {
               Logger.getLogger(WithdrawOther.class.getName()).log(Level.SEVERE, null, ex);
           }
             }); 
   
   
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
        }

     @Override
    public   void numberClicked(MouseEvent e  ) {
           anmttettf .setText(   anmttettf .getText() + ((Button) e.getSource()).getText());
             }

   
     @Override
    public void otherOperatorClicked(MouseEvent e) {
        
       if ("clear".equals(((Button) e.getSource()).getText().trim())) {
           anmttettf .clear();
       }
   
    if ("X".equals(((Button) e.getSource()).getText().trim())) {
            String result =   anmttettf.getText();
           if(result.length()==0)
               anmttettf.clear();
            else{
              result = result.substring(0, result.length() - 1);
              anmttettf.setText(result);  }
               
           }
   if ("enter".equals(((Button) e.getSource()).getText().trim())) { 
         String sr= anmttettf.getText().trim()  ;
              int countpt=0;
             String  srbal=sr.trim();
             strtbml= sr;
    if( srbal.isEmpty()){ 
            cnt=0;
           srbal="❎ please enter the  amount you need!  ";
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
                strtbml=sr;
                cnt=1;
                srbal=""; 
                break;  }
               
           if( i==srbal.length()-1 &&countpt<=1)   
                 { 
                strtbml= sr;
                cnt=1;
                srbal=""; 
                break;  }
  
               }
         else  { 
                 srbal= "❎ must be  digits❓"; 
                 break; } 
           }
    if(cnt==1){
        
       double upbalce =Double.parseDouble(strtbml);
        Account  accn=new Account(  );
        double bal=accn.checkSufficientce(upbalce);
         if(bal<0.0){
          //balance=upbalce;
     showerror. setStyle("  -fx-text-fill: red;");
    showerror .setText("❎ Insufficient balance ,please choose less!:"  );
     BalanceScene  balob=new BalanceScene( balance );
      //this.withdrwOther();
     cnt=1;
        }
     else {
             try {
             UpdateItem  updbal=new UpdateItem(  );
              showerror. setStyle("  -fx-text-fill: green;");
              showerror.setText("✔ "+upbalce+ "0 "+ "birr debited from your account!:"  );
               balance=bal;
               BalanceScene  balob=new BalanceScene( bal );
//                balob.setCurrentBalance(bal);
//               balob.getCurrentBalance(bal);
               DepositToself  depobalob=new DepositToself(  );
               depobalob.setAvilableBalance(  bal);
              Account  accnn=new Account(bal);
               
               WithdrawalScene  balwihob=new WithdrawalScene(balance  );
              // balwihob.setAvilableBalance(bal);
             
               
               
//             con.setOnMouseClicked(ev  ->  {
//           try {
//               balob.setCurrentBalance(balance);
//               mmenu.showmain(  );
//           } catch (SQLException | ClassNotFoundException ex) {
//               Logger.getLogger(WithdrawOther.class.getName()).log(Level.SEVERE, null, ex);
//           }
////             });
//               upbalce=bal;
             updbal. balanceupdate(bal);
             
           } catch (SQLException ex) {
               Logger.getLogger(WithdrawalScene.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(WithdrawalScene.class.getName()).log(Level.SEVERE, null, ex);
           }
     } 
          
      
    anmttettf.clear();
    cnt=0;
    }
    
    else  showerror.setText(srbal);
     anmttettf.clear();
    cnt=0;
     }
   
    
        //balance=Double.parseDouble(strtbml);
       
   
   
   }
   
     }
