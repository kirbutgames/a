package data;

final public class  Password {


    private final String code;

    public Password(String code){this.code = code;}

    public String getPassword () { return code; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password pass = (Password) o;
        return code.equals(pass.code);
    }
    @Override
    public int hashCode () { return code.hashCode(); }
    @Override
    public String toString() {
        return "Password{" + "code='" +code+ '\'' + '}';
    }
}
