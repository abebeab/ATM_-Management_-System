 package atm_.management_.system;
import ATMkeyactions.UpdateItem;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
 
public class Change_pin extends ClssFTxtFlT {
    TextField newpf ;
    TextField conff ;
    private Label  pnferror;
    private int   cnt =0 ;
private static  Double  balance=0.0;
    
//    public Change_pin(int userAccountNumber, BankDatabase atmBankDatabase) {
//        super(userAccountNumber, atmBankDatabase);
//    }

    public Change_pin(String fname, String lname) {
     }

   public Change_pin(Double  balanc ) {
       
       balance =balanc;
   }
 
 public void  changepinmain( ) {
     Label ch = new Label("Change  PIN");
     Label newp = new Label("New PIN:");
     Label conf = new Label("Confirm PIN:");
     Button con = new Button("continue");
     newpf = new TextField( );
     conff = new TextField( );
     pnferror = new Label( );
     pnferror.setFont( new Font( "Serif",20  ) );
     ch.setFont( new Font( "Serif",35  ) );
     newp.setFont( new Font( "Serif",30  ) );
     conf.setFont( new Font( "Serif",30  ) );
     con .setFont( new Font( "Serif",15  ) );
     newpf.setFont( new Font( "Serif",20  ) );
     conff .setFont( new Font( "Serif",20  ) );
     ch .setStyle( " -fx-text-fill: red;");
     GridPane gp = new GridPane();
     gp.setMaxSize(800, 323);
     gp.setPadding(new Insets(0,5,5,0));
     gp.setAlignment(Pos.CENTER);
     gp.setHgap(10);
     gp.setVgap(10);
     gp.add(newpf,6,2);
     gp.add(conff ,6,3);
     gp.add(ch,6,1);
     gp.add(newp,5,2);
     gp.add(conf,5,3);
     gp.add(pnferror,6,7);
     gp.add(con ,0,10);
     con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
     FlowPane fp=new FlowPane();
     fp.getChildren().addAll(  gp );
     fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
     newpf .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
     conff .setStyle( "-fx-background-color: black; -fx-text-fill: white;");
     pnferror .setStyle( " -fx-text-fill: red;");
     StackPane root = new StackPane();
     root.getChildren().add(fp);
     ATM.p.getChildren().addAll(root);
     Mainmenu mmenu=new Mainmenu();
     con.setOnMouseClicked(e  ->  {
         try {
             mmenu.showmain( );
         } catch (SQLException ex) {
             Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
         }
     });
     newpf.requestFocus ();
     btnZero.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnOne.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnTwo.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnThree.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnFour.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnFive.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnSix.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnSeven.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff  ));
     btnEight.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff ));
     btnNine.setOnMouseClicked(e
             -> numberClicked(e,newpf,conff ));
     arrowdown.setOnMouseClicked(ev
             -> {
         conff.requestFocus ();
         bolcnf=false;
         btnThree.setOnMouseClicked(evv
                 -> super.numberClicked (evv,newpf,conff ));
         btnZero.setOnMouseClicked(e
                 ->super.numberClicked (e,newpf,conff  ));
         btnFour.setOnMouseClicked(e
                 ->super.numberClicked (e,newpf,conff  ));
         btnFive.setOnMouseClicked(e
                 -> super.numberClicked(e,newpf,conff  ));
         btnOne.setOnMouseClicked(e
                 -> super.numberClicked (e,newpf,conff  ));
         btnTwo.setOnMouseClicked(e
                 ->super.numberClicked (e,newpf,conff  ));
         btnSix.setOnMouseClicked(e
                 ->super.numberClicked (e,newpf,conff  ));
         btnSeven.setOnMouseClicked(e
                 -> super.numberClicked(e,newpf,conff  ));
         btnEight.setOnMouseClicked(e
                 -> super.numberClicked(e,newpf,conff  ));
         btnNine.setOnMouseClicked(e
                 -> super.numberClicked(e,newpf,conff  ));
     });
     arrowupp.setOnMouseClicked(e->{
         newpf.requestFocus ();
         bolcnf=true;
         super.numberClicked(e,newpf,conff   );
     });
     clear.setOnMouseClicked(e
             -> {
         try {
             otherOperatorClicked(e,newpf,conff);
         } catch (SQLException ex) {
                    Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
                }
     });
     cancel.setOnMouseClicked(e
             -> {
         try {
             otherOperatorClicked(e,newpf,conff);
         } catch (SQLException ex) {
             Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
         }
     });
     backspace.setOnMouseClicked(e
             -> {
         try {
                    otherOperatorClicked(e,newpf,conff);
         } catch (SQLException ex) {
             Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
         }
     });
     enter.setOnMouseClicked(e
             ->  otherOperatorClicked(e ));
 } 
 
    @Override
 public void numberClicked(MouseEvent e,TextField newpfh  ,TextField conff) {
        newpf=newpfh;
        newpf.setText( newpf .getText() + ((Button) e.getSource()).getText());
          } 
    
 
     @Override
 public void otherOperatorClicked(MouseEvent e) {
     
     
     if ("enter".equals(((Button) e.getSource()).getText().trim())) {//oooook
            System.out.println("change pin ener clicked");
            
       if(newpf.getText().trim().length() ==0|| conff.getText().trim().length()==0 )
                  pnferror.setText("❎please fill  to change pin");
                    
        for(int i=0;i< newpf.getText().trim().length();i++) {
            
            if(!(Character.isDigit(newpf.getText().trim().charAt(i))) || newpf.getText().trim().length()!=4 ){
                pnferror.setText("❎ pins should be 4 digits❓");
                 cnt =1;
                  break;
                 }
            
            else if(conff.getText().trim().length() !=4)
              pnferror.setText("❎confirm below pin!");
            else if(conff.getText().trim().length() ==0 )
               pnferror.setText("❎please fill  to change pin");
                
            else if(conff.getText().trim().length() ==4&& newpf.getText().trim().length()==4 ){
               if(conff.getText().trim().equals(newpf.getText().trim()) ) {
                   try {
                       pnferror.setStyle("-fx-background-color: BEIGE ;-fx-text-fill: green;");
                       pnferror.setText("✔ pin changed succesfuly!: "+newpf.getText().trim());
                    UpdateItem upd=new UpdateItem( );
                  int d= Integer.parseInt(newpf.getText());
                       upd.pinchangedb( d);
                   } catch (SQLException | ClassNotFoundException ex) {
                       Logger.getLogger(Change_pin.class.getName()).log(Level.SEVERE, null, ex);
                   }
                }
                
              else { pnferror.setStyle(" -fx-text-fill: red;");
                 pnferror.setText(" ❎  pins are different!" );}
                 } 
                }
           for(int i=0;i<  conff.getText().trim().length();i++) {
            if(!(Character.isDigit(conff.getText().trim().charAt(i))) || conff.getText().trim().length()!=4 ){
                pnferror.setText("❎ pins should be 4 digits❓");
                 cnt =1;
                  break;
                 }
            
            else if(newpf.getText().trim().length() !=4)
              pnferror.setText("❎confirm   above pin ");
            else if(newpf.getText().trim().length() ==0 )
                  pnferror.setText("❎please fill  to change pin");
                 }
               }
              }
 
   
    @Override
    public void numberClicked(MouseEvent e) {
     }
   
          }
 