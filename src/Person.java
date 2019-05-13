public class Person {

    String firstName;
    String lastName;

    // Set methode
    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get methode
    public String getFullName() {
        return this.firstName + " " + this.lastName.toUpperCase();
    }
}
