package data;

import org.junit.Test;

import static junit.framework.Assert.*;

public class DocPathTest {
    @Test
    public void TestEquals() {
        DocPath rute1 = new DocPath("local/usr/place");
        DocPath rute2 = new DocPath("local/usr/place");
        DocPath rute3 = new DocPath("local/usr/place1");
        assertTrue(rute1.equals(rute2));
        assertFalse(rute1.equals(rute3));
    }

    @Test
    public void TesthashCode() {
        DocPath rute1 = new DocPath("local/usr/place");
        DocPath rute2 = new DocPath("local/usr/place");
        assertTrue(rute1.hashCode()==rute2.hashCode());
    }

    @Test
    public void TesttoString() {
        DocPath rute1 = new DocPath("local/usr/place");
        String path = "DocPath{rute='local/usr/place'}";
        assertEquals(path,rute1.toString());
    }
}
