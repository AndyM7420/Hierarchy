public class Child extends Family{
    private String school;
    public Child(String lastName, int birthYear, String school) {
        super(lastName, birthYear);
        this.school=school;
    }

    public String getSchool() {
        return school;
    }
}
