 package atm_.management_.system;
 import ATMkeyactions.BankDatabase;
import java.sql.SQLException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
 
 public class Keypad   implements adinerface {
      GridPane gp = new GridPane();
      FlowPane pane = new FlowPane();
      VBox vBox = new VBox( );
      Stage sg;
      int count;
//      String ffname;
//      String llname;
       WithdrawOther wihoher=new WithdrawOther();   
      ATMdefaultScenne srn=new ATMdefaultScenne();
      private int   cnt =0 ;
   Keypad( ) {  
        this.count = 0;
            }
//
//    public Keypad(String fname, String lname) {
//     ffname=fname;
//    llname=lname;
//            }
   public   VBox getVBox( ) {
    vBox.setPadding(new Insets(8,222,20, 300));
    gp.setAlignment(Pos.CENTER);
    gp.setVgap(20);
    gp.setHgap(40);
    gp.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
    enter .setStyle("-fx-background-color: white; -fx-text-fill: blue;"); 
    vBox.setAlignment(Pos.CENTER);
    vBox.setStyle("-fx-background-color: ORANGE;");
    gp.setPadding(new Insets(5, 5, 10, 5));
     gp.addRow(0, btnSeven, btnEight, btnNine ,arrowupp );
       gp.addRow(1, btnFour,btnFive,btnSix,backspace);
       gp.addRow(2, btnOne,btnTwo ,btnThree , arrowdown );
       gp.addRow(3,btnZero ,clear, enter,cancel);
       vBox.getChildren().add(gp);
        arrowupp.setFont( new Font( "Serif",16 ) );
        arrowupp .setStyle(" -fx-text-fill: black;"); 
        arrowdown.setFont( new Font( "Serif;italic",16 ) );
        arrowdown .setStyle(" -fx-text-fill: black;"); 
        btnSix.setFont( new Font( "Serif",16 ) ); 
        btnFive.setFont( new Font( "Serif",16 ) ); 
        btnFour.setFont( new Font( "Serif",16  ) ); 
        btnThree.setFont( new Font( "Serif",16 ) ); 
        btnTwo.setFont( new Font( "Serif",16) ); 
        btnOne.setFont( new Font( "Serif",16  ) ); 
        btnZero.setFont( new Font( "Serif",16 ) ); 
        btnNine.setFont( new Font( "Serif",16 ) ); 
        btnEight.setFont( new Font( "Serif",16  ) ); 
        btnSeven.setFont( new Font( "Serif",16  ) ); 
        backspace.setFont( new Font( "Serif",16 ) ); 
        clear.setFont( new Font( "Serif",14 ) ); 
        enter.setFont( new Font( "Serif",14 ) ); 
        cancel.setFont( new Font( "Serif",14 ) ); 
       point.setFont( new Font( "Serif",16 ) ); 
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
        enter.setOnMouseClicked(this::otherOperatorClicked);
        cancel.setOnMouseClicked(e
                -> otherOperatorClicked(e)); 
//        point.setOnMouseClicked(e
//                -> numberClicked(e ));
//        
     return vBox;
       }
     @Override
  public   void numberClicked(MouseEvent e  ) {
     ATMdefaultScenne.f .setText(  ATMdefaultScenne.f.getText() + ((Button) e.getSource()).getText());
             } 
   @Override
 public   void otherOperatorClicked(MouseEvent e) {
        if ("clear".equals(((Button) e.getSource()).getText().trim())) {
            ATMdefaultScenne.f. setText(" ");
            ATMdefaultScenne.f.clear();
            count = 0;
             }
    if ("X".equals(((Button) e.getSource()).getText().trim())) {
            String result = ATM.f.getText().trim();
       if(result.length()==0)
            ATM.f.clear();
            else{
            result = result.substring(0, result.length() - 1);
           ATMdefaultScenne.f.setText(result);  }
            }
    if ("enter".equals(((Button) e.getSource()).getText().trim())) {//oooook
            String sr=ATMdefaultScenne.f.getText().trim()  ;
             LoginerrorScene erlog  =new LoginerrorScene();
        for(int i=0;i< sr.length();i++) {
            if(!(Character.isDigit(sr.charAt(i)))){
                 sr="❎ must contain only digits❓";
                 erlog.showerror();
                 cnt=1;
                break;}
             }
  if(cnt!=1&&sr.length()>0){
       try {
             BankDatabase atmBankDatabase=new  BankDatabase();
                 sg=ATMdefaultScenne.primaryStage;
                 int d= Integer.parseInt(sr );
                 int  adminn = atmBankDatabase.connecdb(d);
                 System.out.println(adminn );
                 String admin =adminn+"".trim();
    if( admin.equals(sr) &&sr.length()== 1  ){
                  erlog.showerror(); }
    
      else if( admin.equals(sr) &&  sr.length()==4  ) {
           //Mainmenu srnm=new Mainmenu();
         Mainmenu srnm=new Mainmenu( );
  
    srnm.showmain(  );
//         ATM.ffp.setStyle(  "-fx-background-color: white; "); 
//         ATMdefaultScenne.f.clear();
//          StackPane rootm = new StackPane();
//          Mainmenu. fp.getChildren().add(Mainmenu.gp);
//         rootm.getChildren().add(Mainmenu.fp);
//         ATM.p.getChildren().addAll(Mainmenu.pane); 
      }
      
    else if( sr.equals(admin) ){
                Customer_registration customreg=new Customer_registration();
                customreg.regiser(); }
    else if(    !admin.equals(sr) &&sr.length()== 4  ){
                  erlog.showerror(); }
    else if ( !admin.equals(sr) && sr.length()!=4) 
            erlog.showerror(); }
 catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Keypad.class.getName()).log(Level.SEVERE, null, ex);
             } 
           } 
         }
   if ("cancel".equals(((Button) e.getSource()).getText().trim())) {
         ATM.ffp.setStyle(  "-fx-background-color: white; "); 
         ATMdefaultScenne.f.clear();
         StackPane root = new StackPane();
         root.getChildren().add(ATM.ffp);
         ATM.p.getChildren().addAll(root);
         sg=ATMdefaultScenne.primaryStage;
            try {
                srn.run(0);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Keypad.class.getName()).log(Level.SEVERE, null, ex);
            }
         sg.close();
     
       }    
      }  
    }
  