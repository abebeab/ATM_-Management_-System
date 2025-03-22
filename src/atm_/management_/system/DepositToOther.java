 package atm_.management_.system;
import ATMkeyactions.Account;
 import ATMkeyactions.BankDatabase;
import ATMkeyactions.UpdateItem;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
 public class DepositToOther extends ClssFTxtFlT  {
   private Label  pnferror;
   private Label  monferror;
   private static  int   cnt =0 ;
   private static  int   coun =0 ;
   TextField mond;
   TextField accnd;
   private static  Double baln;

    DepositToOther(Double balnn) {
    baln=balnn;    
    
    }
   public void deposittothr( ) {
       Label rfr = new Label(" Deposite  For Others ");
       Label rebk = new Label("Enter the receivers book account:");
       Label remon = new Label("Enter money  to deposite:");
       pnferror   = new Label( );
       monferror   = new Label( );
       Button con = new Button("continue");
          accnd= new TextField(  );
          accnd.setPromptText("account");
          mond = new TextField( );
          mond.setPromptText("money");
          rfr.setFont( new Font( "Serif",35  ) );
         
          monferror.setFont( new Font( "Serif",20  ) );
          pnferror.setFont( new Font( "Serif",20  ) );
          
          rebk.setFont( new Font( "Serif",24  ) );   
          remon.setFont( new Font( "Serif",24  ) );   
          con .setFont( new Font( "Serif",15  ) );   
          accnd.setFont( new Font( "Serif",20  ) );   
          mond .setFont( new Font( "Serif",20  ) ); 
          accnd .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
          mond .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
          rfr .setStyle( "-fx-background-color: white; -fx-text-fill: red;");
          pnferror .setStyle(  " -fx-text-fill: red;");
       
         accnd.setMaxWidth(200);
          mond.setMaxWidth(200);
          GridPane gp = new GridPane();
          gp.setAlignment(Pos.CENTER);
           gp.setHgap(9);  
           gp.setVgap(10); 
           gp.add(accnd,6,2);
           gp.add(mond ,6,3);
           gp.add(rfr,5,0);
           gp.add(rebk,5,2);
           gp.add(remon,5,3);
           gp.add(pnferror ,5,9);
           gp.add(monferror ,5,10);
           gp.add(con ,0,12);
        con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
     FlowPane fp=new FlowPane();
       fp.getChildren().addAll(  gp );
       fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
    StackPane root = new StackPane();
        root.getChildren().add(fp);
        ATM.p.getChildren().addAll(root);
  
    con.setOnMouseClicked(e  ->  {
         DepositScene depoob=new DepositScene( baln);
        
             depoob.deposimenu( ); });
        accnd.requestFocus ();   
        btnZero.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond  ));
        btnOne.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond  ));
        btnTwo.setOnMouseClicked(e 
                -> numberClicked(e,accnd,mond  ));
        btnThree.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond  ));
        btnFour.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond ));
        btnFive.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond ));
        btnSix.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond ));
        btnSeven.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond ));
         btnEight.setOnMouseClicked(e
                 -> numberClicked(e,accnd,mond ));
        btnNine.setOnMouseClicked(e
                -> numberClicked(e,accnd,mond ));
  arrowdown.setOnMouseClicked(ev
              -> { 
      mond.requestFocus (); 
         bolcnf=false;  
      btnThree.setOnMouseClicked(evv
                -> super.numberClicked (evv,accnd,mond  ));
      btnZero.setOnMouseClicked(e
                ->super.numberClicked (e,accnd,mond )); 
      btnFour.setOnMouseClicked(e
                ->super.numberClicked (e,accnd,mond ));
      btnFive.setOnMouseClicked(e
                -> super.numberClicked(e,accnd,mond  ));
      btnOne.setOnMouseClicked(e
                -> super.numberClicked (e,accnd,mond));
     btnTwo.setOnMouseClicked(e
                ->super.numberClicked (e,accnd,mond)); 
     btnSix.setOnMouseClicked(e
                ->super.numberClicked (e,accnd,mond ));
    btnSeven.setOnMouseClicked(e
                -> super.numberClicked(e,accnd,mond ));
    btnEight.setOnMouseClicked(e
                -> super.numberClicked(e,accnd,mond));
    btnNine.setOnMouseClicked(e
             -> super.numberClicked(e,accnd,mond  ));
            });
  arrowupp.setOnMouseClicked(e->{
        accnd.requestFocus ();
        bolcnf=true;
        super.numberClicked(e,accnd,mond);
           });
   clear.setOnMouseClicked(e
                -> {
           try {
               otherOperatorClicked(e,accnd,mond);
           } catch (SQLException ex) {
               Logger.getLogger(DepositToOther.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(DepositToOther.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
 backspace.setOnMouseClicked(e
                -> {
           try {
               otherOperatorClicked(e,accnd,mond);
           } catch (SQLException | ClassNotFoundException ex) {
               Logger.getLogger(DepositToOther.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
   enter.setOnMouseClicked(e
                -> otherOperatorClicked(e ));
         } 
    @Override
 public void numberClicked(MouseEvent e,TextField  newpfh,TextField conff) {
        accnd=newpfh;
        accnd.setText( accnd .getText() + ((Button) e.getSource()).getText());
          } 
 
    @Override
  public void otherOperatorClicked(MouseEvent e) {
     if ("enter".equals(((Button) e.getSource()).getText().trim())) {//oooook
            System.out.println("birr depositd!");
            String sraccn=accnd.getText().trim();
            
            pnferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: red;");
            monferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: red;");
       
       if(accnd.getText().trim().length() ==0|| mond.getText().trim().length()==0 )
                  sraccn= ("❎please fill  to deposit");
       for(int i=0;i< accnd.getText().trim().length();i++) {
            if(!(Character.isDigit(accnd.getText().trim().charAt(i))) || accnd.getText().trim().length()!=13 ){
                sraccn= ("❎  accounts should be  13 digits❓");
                 
                  break;
                 }
           else if( i== accnd.getText().trim() .length()-1 &&Character.isDigit(accnd.getText().trim() .charAt(i))&&i==12) {
             coun  =1; 
             sraccn="";
            }
            }
       
                
      String srbal= mond.getText().trim() ;  ;
       String strtbml;
        int countpt=0;
        if( srbal.isEmpty()){ 
            cnt=0;
           srbal="❎ please enter the  amount to deposit!";
            }
    else if( !srbal.isEmpty()) 
        for(int i=0;i< srbal.length();i++) {
             char point='.';  
          if( (Character.isDigit(srbal.charAt(i)))|| srbal.charAt(i)==point){
              if(srbal.charAt(i)==point) 
                countpt++;
            if(2 <=countpt ||srbal.length() ==countpt ){ 
                srbal="❎ use only 1 point with digits!";
                break;}
              
            if( i==srbal.length()-1 &&srbal.charAt(i)==point)   
                 { 
                 strtbml=srbal;
                 cnt=1 ;
                  break;  }
               
           if( i==srbal.length()-1 &&countpt<=1)   
                 { 
                strtbml= srbal;
                cnt=1;
                srbal="";
                 break;  }
              }
          
          
         else  { 
                 srbal= "❎ must be  digits❓"; 
                 break; } 
           }         
       
      if(cnt!=1)   
         monferror.setText(srbal);  
       else monferror.setText("");  
        
     if(coun!=1)   
         pnferror.setText(sraccn  );  
       else pnferror.setText("");   
      
   if(cnt==1&&coun==1){
         double dblblnce =Double.parseDouble(mond.getText().trim());
                           Account  accnob=new Account(  );
        double bal=accnob.checkSufficientce(dblblnce);
         if(bal<0.0){ 
           pnferror .setText("❎ Insufficient balance ,please choose less!:"  );
           }
       
       else
           try {
                    UpdateItem  updbal=new UpdateItem(  );
                    
                    String checkaccnt=updbal.checkAccountdb(accnd.getText().trim(),dblblnce);
                      if(checkaccnt!=null){
                          baln=bal;
                          BalanceScene  balob=new BalanceScene( bal );
                        /// balob.setCurrentBalance(bal);
                         Account  accnn=new Account(bal);
                         updbal. balanceupdate(bal );
             
                            pnferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");
                            pnferror.setText("✔ deposited    succesfuly to!: *********"+accnd.getText().trim().substring(9, 13));
                            monferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");  
                            monferror.setText("✔ deposited amount : "+dblblnce+"0" );
                      }
                      else {pnferror.setText("❎ The account doesnt exist!: *********"+accnd.getText().trim().substring(9, 13));
                           }
                            
                } catch (SQLException ex) {
                    Logger.getLogger(DepositToOther.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DepositToOther.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
       
   else {
       monferror.setText(srbal);
       pnferror.setText( sraccn );
               
       }
   cnt=0;
   coun=0;
                              
// }           else if(accnd.getText().trim().length() ==13&& mond.getText().trim().length()==4 ){
//               if(mond.getText().trim().equals(accnd.getText().trim()) ) {
//                   pnferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");
//                   pnferror.setText("✔ pin changed succesfuly!: "+accnd.getText().trim());
//                   BankDatabase atmBankDatabase=new  BankDatabase();
//                   int d= Integer.parseInt(accnd.getText());
//                }
//              else { pnferror.setStyle(" -fx-text-fill: red;");
//                 pnferror.setText(" ❎  pins are different!" );}
//                 } 
//                }
//         for(int i=0;i<  mond.getText().trim().length();i++) {
//            if(!(Character.isDigit(mond.getText().trim().charAt(i))) || mond.getText().trim().length()!=4 ){
//                pnferror.setText("❎ pins should be 4 digits❓");
//                 cnt =1;
//                  break;
//                 }
//            else if(accnd.getText().trim().length() !=4)
//              pnferror.setText("❎confirm   above pin ");
//          else if(accnd.getText().trim().length() ==0 )
//                  pnferror.setText("❎please fill  to change pin");
//                 }
               }
             }
  @Override
    public void numberClicked(MouseEvent e) {
     }
 }
