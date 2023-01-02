package publicadministratioon;

import data.Nif;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

public class CitizenTest {

    @Test
    public void ToString(){
        Nif nif = new Nif("12345678N");
        String Name = "Juana de Arco";
        String adress= "896 Delaware St.\n" +
                "Battle Ground, WA 98604";
        String mobile = "";
        Citizen l = new Citizen(nif,Name,adress,mobile);

        String msg = "Citizen{Nif='Nif{nif ciudadano='12345678N'}name='Juana de Arcoaddress='896 Delaware St.\n" +
                "Battle Ground, WA 98604mobileNumb=''}";
        assertEquals(msg,l.toString());
    }

}
