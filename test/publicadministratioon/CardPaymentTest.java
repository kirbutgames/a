package publicadministratioon;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

import data.Nif;
import org.junit.Test;

public class CardPaymentTest {

    @Test
    public void ToStringTest(){

        Nif nif = new Nif("12345678N");
        BigDecimal f = new BigDecimal(12);
        String ref = "2456138";
        Date date = new Date(2022,2,12);
        CardPayment card = new CardPayment(ref,nif,f,date);
        String msg = "CardPayment{refrence='2456138,Nif='12345678N,date='Sun Mar 12 00:00:00 CET 3922,import='12}";
        assertEquals(msg,card.toString());

    }
}
