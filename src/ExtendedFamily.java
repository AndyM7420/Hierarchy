public class ExtendedFamily extends Family{
    String sideFamily;
    public ExtendedFamily(String lastName, int birthYear,String sideFamily) {
        super(lastName, birthYear);
        this.sideFamily=sideFamily;
    }

    public String sideFamily() {
        return super.toString()+"and is getting ready to visit their "+sideFamily+" side of the family";
    }
}
