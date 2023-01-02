package publicadministratioon;
import data.Nif;
import data.SmallCode;

import java.util.Date;

public class CreditCard {
    // The payment information for using the card via internet
    private final Nif nif; // The nif of the user

    private final Date expirDate; // The expiration date for the credit card
    private final SmallCode svc; // The Safe Verification Code

    private final String cardNumb;
    public CreditCard (Nif nif, String cNum, Date d, SmallCode c) {
        this.nif=nif;
        this.cardNumb = cNum;
        this.expirDate= d;
        this.svc=c;
    }
    // Initializes attributes
    // the getters


    public Nif getNif() {
        return nif;
    }

    public Date getExpirDate() {
        return expirDate;
    }

    public SmallCode getSvc() {
        return svc;
    }

    public String getCardNumb() {
        return cardNumb;
    }
    @Override
    public String toString () {return "CreditCard{" + "Nif='" +nif.getNif() +
                                                    ",expirDate='" +expirDate.toString() +
                                                    ",svc='" +svc.getSmallCode() +
                                                    ",cardNumb='" +cardNumb+ '}';} // converts to String
}

