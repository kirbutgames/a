package data;

import java.util.Arrays;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;
import org.junit.Test;

public class DigitalSignatureTest {

    @Test
    public void TestEquals(){
        DigitalSignature sign1 = new DigitalSignature("Signatura".getBytes());
        DigitalSignature sign2 = new DigitalSignature("Signatura".getBytes());
        DigitalSignature sign3 = new DigitalSignature("Signature".getBytes());
        assertTrue(sign1.equals(sign2));
        assertFalse(sign1.equals(sign3));
    }

    @Test
    public void TestHashcode(){
        DigitalSignature sign1 = new DigitalSignature("Signatura".getBytes());
        DigitalSignature sign2 = new DigitalSignature("Signatura".getBytes());
        assertTrue(sign1.hashCode()==sign2.hashCode());
    }
    @Test
    public void TesttoString(){
        DigitalSignature sign = new DigitalSignature("Signatura".getBytes());
        String signatura = "DigitalSignature{digital_signature='" +
                Arrays.toString("Signatura".getBytes()) + "'}";
        assertEquals(signatura,sign.toString());
    }


}
