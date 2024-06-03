package model;

public class User {

    public static  int userCounter = 0;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;


    public User(String firstName, String lastName, String email, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("RU email are not allowed!");
        }else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        return age >= 18;
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + " Nice to see you!");
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + " Nice to see you!");
    }


    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    public static int getUserCountert() {
        return userCounter;
    }
}
