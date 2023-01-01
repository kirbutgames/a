package publicadministratioon;
import data.Nif;

import java.math.BigDecimal;
import java.util.Date;

public class CardPayment {
    // The information associated to the payment realized via internet
    private final String reference; // The code of the operation
    private final Nif nif; // The nif of the user
    private final Date date; // The date of the operation
    private final BigDecimal imports; // The import of the payment
    public CardPayment (Nif nif, BigDecimal imp) {
        this.nif=nif;
        this.imports=imp;

    }
// Initializes attributes
 // the getters
    @Override
    public String toString () { . . . } // converts to String
}

