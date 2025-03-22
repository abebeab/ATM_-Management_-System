 package atm_.management_.system;
import java.sql.SQLException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public  abstract class ClssFTxtFlT  implements adinerface {
        TextField newpfr ;
        TextField conffr ;
    public    boolean bolcnf= true;//las
 
  public void numberClicked  (MouseEvent e,TextField newpf  ,TextField conff) {
        newpfr=newpf;
        conffr=conff;
        
       if(bolcnf==true){
          if((Button) e.getSource()!=arrowupp){ 
           newpfr.appendText(((Button) e.getSource()).getText());}}
       
        else
          conffr .setText( conffr.getText() + ((Button) e.getSource()).getText()) ;
         }
  
  
    public void otherOperatorClicked(MouseEvent e,TextField newpf  ,TextField conff ) throws SQLException, ClassNotFoundException {
          newpfr=newpf;
          conffr=conff;  
          
      if ("clear".equals(((Button) e.getSource()).getText().trim()) ) {
           if(bolcnf==true){
           newpfr. setText(" ");
           newpfr.clear();
            }
           else  { conffr. setText(" ");
           conffr.clear(); 
             } 
       } 
       
     if ("cancel".equals(((Button) e.getSource()).getText().trim())) {
       System.out.println("This is ATM Machine cancel");
        ATM.ffp.setStyle(  "-fx-background-color: white; "); 
          ATMdefaultScenne srn=new ATMdefaultScenne();
         ATMdefaultScenne.f.clear();
         StackPane root = new StackPane();
         root.getChildren().add(ATM.ffp);
         ATM.p.getChildren().addAll(root);
         Stage sg=ATMdefaultScenne.primaryStage;
         srn.run(0);
          sg.close();
   
    }
    if ("X".equals(((Button) e.getSource()).getText().trim())) {
        String result;
        if( bolcnf==true ){
             result=  newpfr.getText();
            if(result.length()==0)
            newpfr.clear();
            
            else{
             result = result.substring(0, result.length() - 1);
            newpfr.setText(result);}
    
            }
        
        else {
          result=  conffr.getText();
            if(result.length()==0)
            conffr.clear();
            else{
                result = result.substring(0, result.length() - 1);
            conffr.setText(result);}
                      }
                }
  
           }
     
     }