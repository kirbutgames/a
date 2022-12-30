package data;

import org.junit.Test;

import static junit.framework.Assert.*;

public class PasswordTest {
    @Test
    public void TestEquals() {
        Password pass1 = new Password("patata");
        Password pass2 = new Password("patata");
        Password pass3 = new Password("tomate");
        assertTrue(pass1.equals(pass2));
        assertFalse(pass1.equals(pass3));
    }

    @Test
    public void TesthashCode() {
        Password pass1 = new Password("patata");
        Password pass2 = new Password("patata");
        assertTrue(pass1.hashCode()==pass2.hashCode());
    }

    @Test
    public void TesttoString() {
        Password pass1 = new Password("patata");
        String contra = "Password{code='patata'}";
        assertEquals(contra,pass1.toString());
    }
}
