package publicadministratioon;
import data.Nif;
import data.SmallCode;

import java.util.Date;

public class CreditCard {
    // The payment information for using the card via internet
    private final Nif nif; // The nif of the user
    private final String cardNumb; // The number of the credit card
    private final Date expirDate; // The expiration date for the credit card
    private final SmallCode svc; // The Safe Verification Code
    public CreditCard (Nif nif, String cNum, Date d, SmallCode c) {
        this.nif=nif;
        this.cardNumb = cNum;
        this.expirDate= d;
        this.svc=c;
    }
    // Initializes attributes
    // the getters
    @Override
    public String toString () { . . . } // converts to String
}

