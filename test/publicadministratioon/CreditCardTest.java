package publicadministratioon;

import data.Nif;
import data.SmallCode;
import org.junit.Test;

import java.util.Date;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

public class CreditCardTest {

    @Test
    public void ToString(){
        Nif nif = new Nif("12345678N");
        Date expirdate = new Date(2022,2,12);
        SmallCode svc = new SmallCode("123");
        String cardnum = "8555222233334444";
        CreditCard card = new CreditCard(nif,cardnum,expirdate,svc);
        String msg = "CreditCard{Nif='12345678N,expirDate='Sun Mar 12 00:00:00 CET 3922,svc='123,cardNumb='8555222233334444}";
        assertEquals(msg,card.toString());


    }
}
