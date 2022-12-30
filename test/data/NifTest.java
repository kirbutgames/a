package data;

import org.junit.Test;

import static junit.framework.Assert.*;

public class NifTest {
    @Test
    public void TestEquals() {
        Nif nif1 = new Nif("12345678A");
        Nif nif2 = new Nif("12345678A");
        Nif nif3 = new Nif("12345678B");
        assertTrue(nif1.equals(nif2));
        assertFalse(nif1.equals(nif3));
    }

    @Test
    public void TesthashCode() {
        Nif nif1 = new Nif("12345678A");
        Nif nif2 = new Nif("12345678A");
        assertTrue(nif1.hashCode()==nif2.hashCode());
    }

    @Test
    public void TesttoString() {
        Nif nif1 = new Nif("12345678A");
        String dni = "Nif{nif ciudadano='12345678A'}";
        assertEquals(dni,nif1.toString());
    }
}
