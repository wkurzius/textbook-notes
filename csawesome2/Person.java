public class Person {
    
    // instance variables
    private String name;
    private String email;
    private String phoneNumber;

    // constructor: construct a Person copying in the data into the instance
    // variables
    public Person(String initName, String initEmail, String initPhone) {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
    }

    // Print all the data for a person
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

}
