package publicadministratioon;

import java.lang.module.Configuration;
import java.util.Arrays;
import java.util.Date;

public class CrimConvictionsColl { // Represents the total criminal convictions registered for a citizen??? // Its components, that is, the set of criminal convictions


    private  CrimConviction[] convictions;
    private Citizen citizen;
    private int Num_convictions; //number of the criminal convictions of the Citizen
    public CrimConvictionsColl (CrimConviction[] conv, Citizen per){
        this.convictions=conv;
        this.citizen=per;
        this.Num_convictions=conv.length;
    } // Initializes the object
    // the getters
    public void addCriminalConviction (CrimConviction crmC){
        CrimConviction[] conv = new CrimConviction[Num_convictions+1];
        int i = 0;
        for(i=0;i<Num_convictions;i++){
            conv[i] = convictions[i];
        }
        conv[Num_convictions]= crmC;
        convictions = conv;
        Num_convictions++;
    }
    // Adds a criminal conviction
    public CrimConviction getCriminalConviction (Date date) throws Exception{
        int i=0;
        for(i=0;i<Num_convictions;i++){
            if(convictions[i].getCommitDate()==date){
                return convictions[i];
            }
        }
        throw new Exception("There are no CrimConviction in that date: "+date.toString());
    }
    // Gets a specific criminal conviction by date
    @Override
    public String toString () {return "CardPayment{" + "convictions='" + Arrays.toString(convictions) +
                                                        "citizen='" +citizen.toString() +
                                                        "NumConvictions='" +Num_convictions + '}';} // converts to String

    public CrimConviction[] getConvictions() {
        return convictions;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public int getNum_convictions() {
        return Num_convictions;
    }
}
