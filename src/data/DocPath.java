package data;

final public class DocPath {

    private final String rute;

    public DocPath(String Path){this.rute = Path;}

    public String getDocPath () { return rute; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPath doc = (DocPath) o;
        return rute.equals(doc.rute);
    }
    @Override
    public int hashCode () { return rute.hashCode(); }
    @Override
    public String toString() {
        return "DocPath{" + "rute='" +rute+ '\'' + '}';
    }
}
