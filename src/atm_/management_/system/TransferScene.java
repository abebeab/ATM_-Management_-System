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
 
public class TransferScene extends ClssFTxtFlT{
    TextField accn ;
    TextField mon;
     private Label  monferror;
    private Label  pnferror;
     private static  int   cnt =0 ;
   private static  int   coun =0 ;
   private static  Double baln;
  public TransferScene(String fname, String lname) {
     }
 public TransferScene(Double balnn) {
    baln= balnn;
     
     
     }
   public void transfermenu( ) {
       
        pnferror   = new Label( );
       monferror   = new Label( );
       
      Label rfr = new Label("Transfer birr to:");
       Label rebk = new Label("Enter the receivers book account:");
       Label remon = new Label("Enter money  to transfer:");
        
        Button con = new Button("continue");
        accn = new TextField(  );
        accn.setPromptText("account");
        mon = new TextField( );
        mon.setPromptText("money");
        
        
          monferror.setFont( new Font( "Serif",20  ) );
          pnferror.setFont( new Font( "Serif",20  ) );
        
          rfr.setFont( new Font( "Serif",35  ) );
          rebk.setFont( new Font( "Serif",20  ) );   
          remon.setFont( new Font( "Serif",20  ) );   
          con .setFont( new Font( "Serif",15  ) );   
          accn.setFont( new Font( "Serif",20  ) );   
          mon .setFont( new Font( "Serif",20  ) ); 
          accn .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
          mon .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
          rfr .setStyle( "-fx-background-color: white; -fx-text-fill: red;");
         
        GridPane gp = new GridPane();
//        gp.setStyle("-fx-background-color:yellow ; -fx-text-fill: darkslateblue;");
           gp.setMaxSize(800, 323);
           gp.setPadding(new Insets(0,5,5,0));
           gp.setAlignment(Pos.CENTER);
           gp.setHgap(10);  
           gp.setVgap(11); 
           gp.add(accn,6,2);
           gp.add(mon ,6,3);
           gp.add(rfr,5,0);
           gp.add(rebk,5,2);
           gp.add(remon,5,3);
           gp.add(pnferror ,5,7);
            gp.add(monferror ,5,8);
           gp.add(con ,0,9);
      con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
     pnferror .setStyle("  -fx-text-fill: red;");
     FlowPane fp=new FlowPane();
       fp.getChildren().addAll(  gp );
     //   fp.setPadding(new Insets(18,10,10,5));
       fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
    StackPane root = new StackPane();
        root.getChildren().add(fp);
        ATM.p.getChildren().addAll(root);
  
     
   con.setOnMouseClicked(e  ->  {
           Mainmenu mmenu=new Mainmenu(baln); 
       try {
               mmenu.showmain(  );
           } catch (SQLException ex) {
               Logger.getLogger(TransferScene.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(TransferScene.class.getName()).log(Level.SEVERE, null, ex);
           }
             });  
   accn.requestFocus ();   
        btnZero.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
        btnOne.setOnMouseClicked(e
                -> numberClicked(e,accn,mon   ));
        btnTwo.setOnMouseClicked(e 
                -> numberClicked(e,accn,mon  ));
        btnThree.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
        btnFour.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
        btnFive.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
        btnSix.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
        btnSeven.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
        btnEight.setOnMouseClicked(e
                 -> numberClicked(e,accn,mon ));
        btnNine.setOnMouseClicked(e
                -> numberClicked(e,accn,mon  ));
   
  arrowdown.setOnMouseClicked(ev
              -> { 
     mon.requestFocus (); 
         bolcnf=false;  
     btnThree.setOnMouseClicked(evv
                -> super.numberClicked (evv,accn,mon  ));
     btnZero.setOnMouseClicked(e
                ->super.numberClicked (e,accn,mon )); 
     btnFour.setOnMouseClicked(e
                ->super.numberClicked (e,accn,mon ));
     btnFive.setOnMouseClicked(e
                -> super.numberClicked(e,accn,mon  ));
     btnOne.setOnMouseClicked(e
                -> super.numberClicked (e,accn,mon));
     btnTwo.setOnMouseClicked(e
                ->super.numberClicked (e,accn,mon)); 
    btnSix.setOnMouseClicked(e
                ->super.numberClicked (e,accn,mon ));
    btnSeven.setOnMouseClicked(e
                -> super.numberClicked(e,accn,mon ));
     btnEight.setOnMouseClicked(e
                -> super.numberClicked(e,accn,mon));
    btnNine.setOnMouseClicked(e
             -> super.numberClicked(e,accn,mon  ));
           });
 arrowupp.setOnMouseClicked(e->{
      accn.requestFocus ();
     bolcnf=true;
          super.numberClicked(e,accn,mon);
      });
    clear.setOnMouseClicked(e
                -> {
           try {
               otherOperatorClicked(e,accn,mon);
           } catch (SQLException ex) {
               Logger.getLogger(TransferScene.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(TransferScene.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
    backspace.setOnMouseClicked(e
                -> {
           try {
               otherOperatorClicked(e,accn,mon);
           } catch (SQLException ex) {
               Logger.getLogger(TransferScene.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(TransferScene.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
    enter.setOnMouseClicked(e
                -> otherOperatorClicked(e ));
      } 
    @Override
  public void numberClicked(MouseEvent e,TextField newpfh  ,TextField conff) {
              accn=newpfh;
               accn.setText( accn .getText() + ((Button) e.getSource()).getText());
            }  
  @Override
  public void otherOperatorClicked(MouseEvent e) { 
      
     if ("enter".equals(((Button) e.getSource()).getText().trim()))   {
         //oooook
            System.out.println("birr depositd!");
            String sraccn=accn .getText().trim();
            
            pnferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: red;");
            monferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: red;");
       
       if(accn .getText().trim().length() ==0|| mon .getText().trim().length()==0 )
                  sraccn= ("❎please fill  to transfered");
       for(int i=0;i< accn .getText().trim().length();i++) {
            if(!(Character.isDigit(accn .getText().trim().charAt(i))) || accn .getText().trim().length()!=13 ){
                sraccn= ("❎  accounts should be  13 digits❓");
                 
                  break;
                 }
           else if( i== accn .getText().trim() .length()-1 &&Character.isDigit(accn .getText().trim() .charAt(i))&&i==12) {
             coun  =1; 
             sraccn="";
            }
            }
       
                
      String srbal= mon .getText().trim() ;  ;
       String strtbml;
        int countpt=0;
        if( srbal.isEmpty()){ 
            cnt=0;
           srbal="❎ please enter the  amount to transfere !";
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
         double dblblnce =Double.parseDouble(mon .getText().trim());
                           Account  accnob=new Account(  );
        double bal=accnob.checkSufficientce(dblblnce);
         if(bal<0.0){ 
           pnferror .setText("❎ Insufficient balance ,please choose less!:"  );
           }
       
       else
           try {
                    UpdateItem  updbal=new UpdateItem(  );
                    
                    String checkaccnt=updbal.checkAccountdb(accn .getText().trim(),dblblnce);
                      if(checkaccnt!=null){
                          
                         //balob.setCurrentBalance(bal);
                         baln=bal;
                         updbal. balanceupdate(bal );
                         Account  accnn=new Account(bal);
                          BalanceScene  balob=new BalanceScene( bal );
                            pnferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");
                            pnferror.setText("✔ transfered    succesfuly to!: *********"+accn .getText().trim().substring(9, 13));
                            monferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");  
                            monferror.setText("✔ transfered amount : "+dblblnce+"0" );
                      }
                 else {pnferror.setText("❎ The account doesnt exist!: *********"+accn .getText().trim().substring(9, 13));
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
  
               }
     
             }

    @Override
    public void numberClicked(MouseEvent e) {
     }
  
      }
//ran