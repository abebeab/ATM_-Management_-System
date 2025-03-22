 
package atm_.management_.system;

//import static atm.management.system.ATM.f;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

 public class LoginerrorScene   {
   public void showerror() {
        Label err = new Label("Incorrect  PIN code ");
         Label rh = new Label("please enter your correct  PIN code again! ");
         Button con = new Button("continue");
         
         err.setFont( new Font( "Serif",20  ) );
         rh.setFont( new Font( "Serif",20  ) );
           con.setFont( new Font( "Serif",20  ) );

         con .setStyle("-fx-background-color:black ; -fx-text-fill: white;");
         
    GridPane g=new GridPane();
    g.setMaxSize(800, 323);
    g.setVgap(10); 
    g .setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;"); 
    //g .setPadding(new Insets(5,5,5,10));
    g.add(err,5,1);
    g.add(rh,5,2);
    g.add(con,0,16);
     FlowPane fp=new FlowPane();
   fp.getChildren().addAll(  g );
  
  //fp.setPadding(new Insets(5,40,10,100));
   fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
   
  StackPane root = new StackPane();
        root.getChildren().add(fp);
       ATM.p.getChildren().addAll(root);
      
   
   con.setOnMouseClicked(e  ->  {
         ATMdefaultScenne  srn=new ATMdefaultScenne();
         ATM.ffp.setStyle(  "-fx-background-color: white; "); 
         ATMdefaultScenne.f.clear();
        StackPane rootp = new StackPane();
        rootp.getChildren().add(ATM.ffp);
       ATM.p.getChildren().addAll(rootp);
        
             });   
       
    }
     
}
 