 
package ATMkeyactions;
// DepositSlot.java
  // Represents the deposit slot of the ATM
 
public class DepositSlot {
  // indicates whether envelope was received (always returns true,
  // because this is only a software simulation of a real deposit slot)
  public boolean isEnvelopeReceived() {
      if(isFreeOfCounterFieting()&&isFreeOfBlured()&&isFreeOfTearnOut())
     return true; //
   // deposit envelope was received
    return true;
  }

    private boolean isFreeOfCounterFieting() {
        // indicates whether envelope contains free of false notes (always returns true,
  // because this is only a software simulation of a real deposit slot)
      return true;
    }

    private boolean isFreeOfBlured() {
             // indicates whether envelope is free of containing contains blured ,dirty n notes (always returns true,
        //if there is the scanner scans and detetts, and finaly reject them and count and return the true oone
  // because this is only a software simulation of a real deposit slot)
   
      return true;
     }

    private boolean isFreeOfTearnOut() {
    // indicates whether envelope is free of containing contains blured ,dirty n notes (always returns true,
        //if there is the scanner scans and detetts, and finaly reject them and count and return the true oone
  // because this is only a software simulation of a real deposit slot)
   
      return true;
    }
  }
