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
    public CardPayment (String ref,Nif nif, BigDecimal imp, Date date) {
        this.nif=nif;
        this.imports=imp;
        this.reference=ref;
        this.date=date;

    }
// Initializes attributes
 // the getters
    public String getReference() {
        return reference;
    }

    public Nif getNif() {
        return nif;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getImports() {
        return imports;
    }
    @Override
    public String toString () {return "CardPayment{" + "refrence='" + reference +
                                                        ",Nif='" +nif.getNif() +
                                                        ",date='" +date.toString() +
                                                        ",import='" +imports+ '}';} // converts to String
}

