package publicadministratioon;

import data.Nif;
import org.junit.Test;
import publicadministratioon.*;
import static junit.framework.Assert.*;

import java.util.Date;

public class ConvictionsCollTest {

    @Test
    public void addcriminalConvicitionTest(){
        Nif nif = new Nif("12345678N");
        String Name = "Juana de Arco";
        String adress= "896 Delaware St.\n" +
                "Battle Ground, WA 98604";
        String mobile = "";
        Citizen lf = new Citizen(nif,Name,adress,mobile);
        // New CrimConviction that will be added
        Date date = new Date(2022,2,12);
        String offense = "speeding on the A2 highway, with 160 km/h";
        String sentence = "250€ penalty fee";
        CrimConviction c = new CrimConviction(date,offense,sentence);

        //The general Coll of all the CrimConvictions
        CrimConvictionsColl coll = new CrimConvictionsColl(new CrimConviction[0],lf);
        coll.addCriminalConviction(c);
        assertEquals(c,coll.getConvictions()[0]);
        assertEquals(1,coll.getNum_convictions());


    }

    @Test
    public void getCriminalConvictionTest() throws Exception {
        //Sin exceocion
        Nif nif = new Nif("12345678N");
        String Name = "Juana de Arco";
        String adress= "896 Delaware St.\n" +
                "Battle Ground, WA 98604";
        String mobile = "";
        Citizen lf = new Citizen(nif,Name,adress,mobile);
        // New CrimConviction that will be added
        Date date = new Date(2022,2,12);
        Date date2 = new Date(2022,2,13);
        String offense = "speeding on the A2 highway, with 160 km/h";
        String sentence = "250€ penalty fee";
        CrimConviction c = new CrimConviction(date,offense,sentence);

        //The general Coll of all the CrimConvictions
        CrimConvictionsColl coll = new CrimConvictionsColl(new CrimConviction[0],lf);
        coll.addCriminalConviction(c);
        assertEquals(c,coll.getCriminalConviction(date));

    }
}
