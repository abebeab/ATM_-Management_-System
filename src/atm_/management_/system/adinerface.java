 package atm_.management_.system;
  import javafx.scene.control.Button;
  import javafx.scene.input.MouseEvent;
 //public static global final Double  balance ;
    public interface adinerface {
     Button btnZero = new Button("0"); 
    Button btnOne = new Button("1");
    Button btnTwo = new Button("2");
    Button btnThree = new Button("3");
    Button btnFour = new Button("4");
    Button btnFive = new Button("5");
    Button btnSix = new Button("6");
    Button btnSeven = new Button("7");
    Button btnEight = new Button("8");
    Button btnNine = new Button("9");
    Button enter = new Button("enter");
    Button cancel = new Button("cancel");
    Button backspace = new Button("X");
    Button arrowdown = new Button("↓");
    Button arrowupp = new Button("↑ ");
    Button clear = new Button("clear");
     Button point = new Button(".");
 
 public abstract void numberClicked(MouseEvent e);
 public abstract void otherOperatorClicked(MouseEvent e);
  
                
}
//wawabaka