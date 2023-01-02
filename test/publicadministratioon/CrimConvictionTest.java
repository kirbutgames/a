package publicadministratioon;

import org.junit.Test;

import java.util.Date;
import static junit.framework.Assert.assertEquals;

public class CrimConvictionTest {

    @Test
    public void ToString(){
        Date date = new Date(2022,2,12);
        String offense = "speeding on the A2 highway, with 160 km/h";
        String sentence = "250€ penalty fee";
        CrimConviction c = new CrimConviction(date,offense,sentence);
        String msg = "CardPayment{commitDate='Sun Mar 12 00:00:00 CET 3922offense='speeding on the A2 highway, with 160 km/hsentence='250€ penalty fee}";
        assertEquals(msg,c.toString());
    }
}
