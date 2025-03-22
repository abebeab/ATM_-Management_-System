 package atm_.management_.system;
 import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

 public class CustomerAccount    {
   public void accountcreat(String sr,String sd,String s ) {
       
       Customer_registration   cusmreg=new Customer_registration();
        FlowPane fp=new FlowPane();
        Label cusomacc = new Label("Customer Account");
        Button con = new Button("continue");
          Label lnm = new Label(" " );
          TextField fnm = new TextField(" " );
          Label id  = new Label(" " );
          TextField sub = new TextField(" " );
          Label pin  = new Label("      " );
          Label balf = new Label(" " );
           
          Label rannum = new Label("ID:");
          Label digi = new Label(" ");
          Label llnm = new Label("first name:");
          Label lfnm = new Label("last name:");
          Label phone  = new Label("mobile number:");
          Label bal  = new Label("balance:");
          Label pn  = new Label("PIN number:");
          Label accun = new Label("account number:");
         
         con.setFont( new Font( "Serif",12  ) );
         llnm.setFont( new Font( "Serif",20  ) );
         lfnm.setFont( new Font( "Serif",20  ) );
         phone.setFont( new Font( "Serif",20  ) );
         accun.setFont( new Font( "Serif",20  ) );
         bal.setFont( new Font( "Serif",20  ) );
         pn.setFont( new Font( "Serif",20  ) );
         rannum.setFont( new Font( "Serif",20  ) );
         digi.setFont( new Font( "Serif",20  ) );
         id.setFont( new Font( "Serif",20  ) );
         pin.setFont( new Font( "Serif",20  ) );
           
         
           GridPane gp = new GridPane();
          gp.setHgap(0);  
          gp.setVgap(5); 
          gp.add(cusomacc,0,0);
          gp.add(llnm ,0,1);
          gp.add(lnm,1,1);
          gp.add(lfnm,0,2);
          gp.add(fnm,1,2);
          gp.add(accun ,0,3);
          gp.add(id,1,3);
          gp.add(phone ,0,4);
          gp.add(sub,1,4);
          gp.add(pn,0,5);
          gp.add(pin ,1,5);
          gp.add(balf ,1,6);
          gp.add(bal  ,0,6);
          gp.add(con  ,0,10);
          gp.add(rannum  ,0,7);
          gp.add(digi  ,1,7);
          
        fp.setPadding(new Insets(0,0,0,100));
         cusomacc.setFont( new Font( "Serif",30  ) );
         fp.setStyle("-fx-background-color:red ; -fx-text-fill: darkslateblue;");
         con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
         cusomacc .setStyle("-fx-background-color:BEIGE  ; -fx-text-fill: red;");
         fp.setStyle("-fx-background-color: BEIGE;");
         
         fp.getChildren().addAll(gp );
         StackPane root = new StackPane();
         root.getChildren().add(fp);
         ATM.p.getChildren().addAll(root);
     
        con.setOnMouseClicked(e  ->  {
              
             cusmreg.regiser( );
             });
         }
      }
