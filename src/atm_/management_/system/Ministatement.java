 
package atm_.management_.system;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
 import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
public class Ministatement  {
    
 private TableView table = new TableView();

    Ministatement( ) {
          }
 public Ministatement(String fname, String lname) {
    }
 public void showmini( ) {
        final Label label = new Label("MINI STATEMENTS");
        label.setFont(new Font("Arial", 20));
         label .setStyle("  -fx-text-fill: red;");
        table.setEditable(true);
  table.setMaxSize(888, 266);   
        Button con = new Button("continue");
        TableColumn firstNameCol = new TableColumn("Tno");
        TableColumn lastNameCol = new TableColumn("Account no");
        TableColumn type = new TableColumn("Ttype");
        TableColumn date = new TableColumn("TDate");
        TableColumn amnt = new TableColumn("Amount");
     table.getColumns().addAll(firstNameCol, lastNameCol, type,date,amnt);
     
     con .setStyle("-fx-background-color:blue ; -fx-text-fill: white;");
     con .setFont( new Font( "Serif",15  ) ); 
      ////table.setMaxSize(980, 290);
     
          GridPane gp = new GridPane();
         
          gp.setVgap(5);
          
           gp.add(label,1,0);
            gp.add(table,1,1,20,10);
           gp.add(con,0,12);
      
     FlowPane fp=new FlowPane();
   fp.getChildren().addAll( gp );
  
   //fp.setPadding(new Insets(0,0,0,0));
  fp.setStyle("-fx-background-color:white ; -fx-text-fill: darkslateblue;");
       StackPane root = new StackPane();
        root.getChildren().add(fp);
        ATM.p.getChildren().addAll(root);
        
        
    Mainmenu mmenu=new Mainmenu();
   con.setOnMouseClicked(e  ->  {
            try {
                mmenu.showmain(   );
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Ministatement.class.getName()).log(Level.SEVERE, null, ex);
            }
             });    
    }
 
}
