package publicadministratioon;

import java.util.Date;

public class CrimConviction { // Represents a criminal conviction registered
    private Date commitDate;
    private String offense;
    private String sentence;

    public CrimConviction (Date commit, String off, String sentc){
        this.commitDate=commit;
        this.offense=off;
        this.sentence=sentc;
    }
    // Initializes attributes
    // the getters

    public Date getCommitDate() {
        return commitDate;
    }

    public String getOffense() {
        return offense;
    }

    public String getSentence() {
        return sentence;
    }
    @Override
    public String toString () {return "CardPayment{" + "commitDate='" + commitDate.toString() +
                                                        "offense='" +offense +
                                                        "sentence='" +sentence+ '}';} // converts to String
}

