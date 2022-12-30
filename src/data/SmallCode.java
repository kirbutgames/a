package data;

import java.util.Arrays;

final public class SmallCode {


    private final String smallcode;

    public SmallCode(String code){this.smallcode = code;}

    public String getSmallCode () { return smallcode; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallCode small = (SmallCode) o;
        return smallcode.equals(small.smallcode);
    }
    @Override
    public int hashCode () { return smallcode.hashCode(); }
    @Override
    public String toString() {
        return "SmallCode{" + "smallcode='" +smallcode+ '\'' + '}';
    }
}