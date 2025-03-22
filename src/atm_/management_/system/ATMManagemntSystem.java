 package atm_.management_.system;
import ATMkeyactions.EnterAction;
import java.sql.SQLException;
 import javafx.application.Application;
import javafx.stage.Stage;
 
public class ATMManagemntSystem extends Application {
  
    
    @Override
    public void start(Stage primaryStage) throws SQLException, ClassNotFoundException {
        
       EnterAction cnlenr=new  EnterAction();
       EnterAction.mehod();
     
         ATMdefaultScenne srn=new ATMdefaultScenne();
         srn.run( 0 );
      
    }
    
    public static void main(String[] args) {
        launch(args);
        
       }
    
  }
