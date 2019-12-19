package spring.model;

public class Member {
    private String firstName;
    private String lastName;
    public Member() {
    }
    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    // pomininęte pozostałe settery i gettery
    public String toString() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String string) {
        string = firstName;
    }

    public void setLastName(String string) {
        string = lastName;
    }
}
