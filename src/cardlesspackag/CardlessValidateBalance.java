 
package cardlesspackag;
 
public class CardlessValidateBalance {
    int cnt=0;

    String balncevalidation(String trim) {
   int countpt=0;
     String  srbal=trim.trim();
     //strtbml= bal.getText().trim();
           if( srbal.isEmpty()){ 
          // strtbml="0.0";
//           cnt++;
           srbal="Enter amount you need!";
            }
       else if( !srbal.isEmpty()) 
           for(int i=0;i< srbal.length();i++) {
             char point='.';  
            if( (Character.isDigit(srbal.charAt(i)))|| srbal.charAt(i)==point){
              if(srbal.charAt(i)==point) 
                countpt++;
             if(2 <=countpt ||srbal.length() ==countpt ){ 
                srbal="❎ use only 1 point!";
                break;}
              
               if( i==srbal.length()-1 &&srbal.charAt(i)==point)   
                 { 
                //strtbml= bal.getText().trim() ;
                cnt=1;
                srbal=""; 
                break;  }
               
              if( i==srbal.length()-1 &&countpt<=1)   
                 { 
                //strtbml= bal.getText().trim() ;
                cnt=1;
                srbal=""; 
                break;  }
//                 { 
//                strtbml="0.0";
//                cnt++;
//                srbal=""; 
//                break;  } 
               }
        
        
        else  { 
                 srbal= "❎ must be  digits❓"; 
                 break; } 
           }
       return srbal;
       
       }
    
}
