package data;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

import org.junit.Test;
public class SmallCodeTest{


    @Test
    public void TestEquals() {
        SmallCode small1 = new SmallCode("123");
        SmallCode small2 = new SmallCode("123");
        SmallCode small3 = new SmallCode("124");
        assertTrue(small1.equals(small2));
        assertFalse(small1.equals(small3));
    }

    @Test
    public void TesthashCode() {
        SmallCode small1 = new SmallCode("123");
        SmallCode small2 = new SmallCode("123");
        assertTrue(small1.hashCode()==small2.hashCode());
    }

    @Test
    public void TesttoString() {
        SmallCode small1 = new SmallCode("123");
        String scode = "SmallCode{smallcode='123'}";
        assertEquals(scode,small1.toString());
    }
}
