package data;
import java.util.Arrays;


final public class DigitalSignature {

    private final byte[] digital_signature;

    public DigitalSignature(byte[] signature){this.digital_signature = signature;}

    public byte[] getDigital_signature() {return digital_signature;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature sign  = (DigitalSignature) o;
        return Arrays.equals(digital_signature,sign.digital_signature);
    }

    @Override
    public int hashCode () { return Arrays.hashCode(digital_signature); }


    @Override
    public String toString() {
        return "DigitalSignature{" + "digital_signature='" + Arrays.toString(digital_signature) + '\'' + '}';
    }

}
