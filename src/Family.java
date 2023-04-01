public class Family {
    String lastName;
    int birthYear;
    public Family(String  lastName,int birthYear){
        this.lastName=lastName;
        this.birthYear=birthYear;
    }
    public String getBirthYear(){
        return lastName+"is currently "+(2023-birthYear)+" years old!";
    }
}
