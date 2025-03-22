 package ATMkeyactions;
 
public class Account {
private   static Double availbrr;
//    Account(int i, int i0, double d, double d0) {
//            }

  public  Account(Double lavilbal) {
       availbrr= lavilbal;
     }

    public Account() {
        
    }
 

//    int getAccountNumber() {
//        return 0;
//           }
//
//    double getAvailableBalance() {
//        return 0;
//          }
//
//    boolean validatePIN(int userPIN) {
//        return false;
//          }
//
//    double getTotalBalance() {
//        return 0;
//           }
//
//    void credit(double amount) {
//           }
//
//    void debit(double amount) {
//          }

  public Double    checkSufficientce(Double bnbirr) {
      availbrr=  availbrr-bnbirr; 
   return   availbrr ;
     
  } 
     }
///hhhhh