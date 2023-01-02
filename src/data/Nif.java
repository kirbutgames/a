package data;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.NoSuchElementException;

final public class Nif {
    // The tax identification number in the Spanish state.
    private final String nif;
    private Date valiDate;

    public Nif (String code) {
        if(code == null || code.length() != 9){
            throw new NoSuchElementException();
        }
        this.nif = code;
    }
    public String getNif () { return nif; }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif niff = (Nif) o;
        return nif.equals(niff.nif);
    }
    @Override
    public int hashCode () { return nif.hashCode(); }
    @Override
    public String toString () {
        return "Nif{" + "nif ciudadano='" + nif + '\'' + '}';
    }

}
