 
package atm_.management_.system;

import cardlesspackag.CardLess;
import static atm_.management_.system.ATM.f;
import static atm_.management_.system.ATM.p;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.util.Duration;
 public class ATMdefaultScenne extends ATM {
       
        @Override
 protected  HBox getHBox(HBox hBox ) {
       
                     
        cardless = new Button(" cardless");          
        cardless.setFont( new Font( "Serif",25  ) );
        cardless .setStyle("-fx-background-color:red ; -fx-text-fill: BLACK;");
              
        txtResult = new TextArea("  ");
        txtResult.setEditable(false);
        txtResult.setMinWidth(850);
        txtResult.setMinHeight(360);
        f= new PasswordField();
    
       ATMdefaultScenne.hBox =hBox;
        p=new StackPane ();
        ffp=new FlowPane();
        ffp.setVgap(10);
        ffp.setPadding(new Insets(60,0,10,200));
        ffp.setHgap(221); 
        Label x=new Label (" Well come to CBE birr!");
        x.setFont( new Font( "Serif", 50 ) );
   
          f.setPromptText("Enter PIN");
          f.setMaxWidth(300);
          f.setMaxHeight(55);
          f.setStyle(  "-fx-background-color: blue; -fx-textfill: white;"); 
          f. setFont(Font.font("Times", 30));
          f.setAlignment(Pos.CENTER);

        txtResult.setFont(Font.font("Times", 20));
        ffp.getChildren().addAll( x,f,cardless );
        p.getChildren().add(txtResult);      
        p.getChildren().add(ffp);

       hBox.setAlignment(Pos.CENTER);
       hBox.setPadding(new Insets(70,40, 40,40));
       hBox.setStyle("-fx-background-color: MAGENTA;"); 
       hBox.getChildren().addAll( p ) ;
   
  PathTransition pt = new PathTransition(Duration.millis(2000),
      new Line(45,0,350,0),x);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.play(); 
  
  
   
  cardless .setOnMouseClicked(e  ->  {
      CardLess crdlbn=new CardLess(8);
  
    crdlbn.cardlessmethod();
      });
  
    
  return  hBox ;
      }
   }
 
     
