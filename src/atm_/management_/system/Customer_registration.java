 package atm_.management_.system;
 import ATMkeyactions.InfoMigration;
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
 public class Customer_registration     {
     boolean bol=false;
     private TextField balncef;
     private TextField fnm;
     private TextField lnm;
     private TextField mobno;
     private Label id;
     private Label digi;
     private Label pin;
     private Label fnmerror;
     private Label flmerror;
     private Label mobnomerror;
    private Label balerror;
    private InfoMigration infomig ;
    
    
    public Customer_registration() {
           }

    public Customer_registration(String fname, String lname,Double balcef) {
        
    }
     
    public void regiser( ) {
        
        Mainmenu mmenu=new Mainmenu  ();
        FlowPane fp=new FlowPane();
        Label regisraion = new Label("Customer Registration");
        Button conc = new Button("continue");
        Button acccound = new Button("creat account");
        Button save = new Button("save");
        lnm = new TextField();
        fnm= new TextField();
        id  = new Label();
        mobno = new TextField( );
        pin  = new Label();
        Label lfnm = new Label("first name");
        Label rannum = new Label("ID:");
        Label llnm = new Label("last name:");
        Label phone  = new Label("mobile number:");
          
             balncef = new TextField();
             Label balance  = new Label("balance:");
             
            balerror = new Label();
            fnmerror = new Label();
            flmerror = new Label();
            mobnomerror = new Label();
            digi = new Label();
         
       //Label bal  = new Label("balance:");
         Label pn  = new Label("PIN number:");
         Label accun = new Label("account number: ");
         
          balerror.setFont( new Font( "Serif",20  ) );
         flmerror.setFont( new Font( "Serif",20  ) );
         fnmerror.setFont( new Font( "Serif",20  ) );
         mobnomerror.setFont( new Font( "Serif",20  ) );
         fnm.setFont( new Font( "Serif",17  ) );
          
          balncef.setFont( new Font( "Serif",17  ) );
          lnm.setFont( new Font( "Serif",17  ) );
          mobno.setFont( new Font( "Serif",17  ) );
        balance.setFont( new Font( "Serif",20  ) );
        
         conc.setFont( new Font( "Serif",15  ) );
         llnm.setFont( new Font( "Serif",20  ) );
         lfnm.setFont( new Font( "Serif",20  ) );
         phone.setFont( new Font( "Serif",20  ) );
         accun.setFont( new Font( "Serif",20  ) );
         pn.setFont( new Font( "Serif",20  ) );
         rannum.setFont( new Font( "Serif",20  ) );
         digi.setFont( new Font( "Serif",20  ) );
         id.setFont( new Font( "Serif",20  ) );
         acccound.setFont( new Font( "Serif",15  ) );
         save.setFont( new Font( "Serif",15  ) );
         pin.setFont( new Font( "Serif",20  ) );
         regisraion.setFont( new Font( "Serif",30  ) );
         balncef.setMaxWidth(150);
         id.setMaxWidth(150);
         digi.setMaxWidth(150);
         pin.setMaxWidth(50);
         fnm.setMaxWidth(150);
         mobno.setMaxWidth(150);
         lnm.setMaxWidth(150);
       
         id.setAlignment(Pos.CENTER);
         digi.setAlignment(Pos.CENTER);
         pin.setAlignment(Pos.CENTER);
         
         fnm.setAlignment(Pos.CENTER);
         mobno.setAlignment(Pos.CENTER);
         lnm.setAlignment(Pos.CENTER);
         
          regisraion.setStyle(" -fx-text-fill: black;");
          id.setStyle("-fx-background-color:white ; -fx-text-fill: black;");
          pin.setStyle("-fx-background-color:white ; -fx-text-fill: black;");
          digi.setStyle("-fx-background-color:white ; -fx-text-fill: black;");
   
       GridPane gp = new GridPane();
           //gp.setAlignment(Pos.CENTER);
          gp.setHgap(0);  
          gp.setVgap(3); 
          
         gp.add(regisraion,1,0);
         gp.add(llnm ,0,2);
         gp.add(lnm,1,2);
         gp.add(lfnm,0,1);
         gp.add(fnm,1,1);
          
          gp.add(flmerror,2,2);
          gp.add(fnmerror,2,1);
          gp.add(mobnomerror,2,3);
          gp.add(accun ,0,6);
           gp.add(id,1,6);
          gp.add(phone ,0,3);
          gp.add(balance ,0,4);
          gp.add(balncef ,1,4);
          gp.add(balerror ,2,4);
          gp.add(mobno,1,3);
          gp.add(acccound,1,10);
          gp.add(pn,0,7);
          gp.add(pin ,1,7);
          gp.add(digi ,1,5);
          gp.add(conc  ,0,10);
          gp.add(save  ,2,10);
         gp.add(rannum  ,0,5);
         fp.setPadding(new Insets(0,0,0,20));
            
            conc .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
           save .setStyle("-fx-background-color:darkslateblue  ; -fx-text-fill: white;");
           acccound .setStyle("-fx-background-color:black ; -fx-text-fill: white;");
           fp.setStyle("-fx-background-color:red ; -fx-text-fill: darkslateblue;");
        
         fp.setStyle("-fx-background-color: BEIGE;");
         fp.getChildren().addAll(gp );
         StackPane root = new StackPane();
         root.getChildren().add(fp);
         ATM.p.getChildren().addAll(root);
         conc.setOnMouseClicked(e  ->  {
            try {
                mmenu.showmain( );
            } catch (SQLException ex) {
                Logger.getLogger(Customer_registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer_registration.class.getName()).log(Level.SEVERE, null, ex);
            }
             });
        
  acccound.setOnMouseClicked((MouseEvent e) -> {
        flmerror.setStyle("  -fx-background-color: BEIGE ;-fx-text-fill: red;");
        fnmerror.setStyle("  -fx-background-color: BEIGE ;-fx-text-fill: red;");
        mobnomerror.setStyle("  -fx-background-color: BEIGE ;-fx-text-fill: red;");
        balerror.setStyle("  -fx-background-color: BEIGE ;-fx-text-fill: red;");
   
         
         
         infomig = new InfoMigration(fnm,lnm   ,mobno,balncef);
         fnmerror.setText (infomig.getfnm());
         flmerror.setText ( infomig.getlnm());
         mobnomerror.setText (infomig.getmob());
         balerror.setText (infomig.getBalance());
      if(infomig.cnt==4)  {
         System.out.println(infomig.cnt);
         bol=true;
         fnmerror.setStyle("  -fx-background-color: BEIGE ;-fx-text-fill: green;");
         fnmerror.setText ("✔ registered successfuly");
         long st= 1000000000+(long) (Math.random( ) * 999999999  );
         String sr=st+"" ;
         digi.setText (sr);
         
         int pnm= 1000+ (int) (Math.random( ) * 999  );
         String pnms=pnm +"" ;
         pin.setText (pnms);
          //long lg=(10000000 *1000000);
         long accnm=   10*(long) (Math.random( ) * 100000000    );
          String accnms="1000"+accnm  ;
         id.setText (accnms);  } 
        infomig.cnt =0;
        });   
    save.setOnMouseClicked(e  ->  {
         if(bol==true){
             try {
                 infomig.migratemethod( id ,digi , pin );
             } catch (SQLException ex) {
                 Logger.getLogger(Customer_registration.class.getName()).log(Level.SEVERE, null, ex);
             }
            fnmerror.setText ( "✔ saved successfuly");
            fnm.clear();
            lnm.clear();
            mobno.clear();
            pin.setText("");
            digi.setText("");
            id.setText(""); 
            balncef.clear( );  }
            bol=false;
           });
        }
      }
