public class Student {
    // Attributes
    private String name;
    private String surname;
    private int age;
    private boolean gender; // true for Male, false for Female
    private double gpa;

    // Constructor to initialize the attributes
    public Student() {
        // Default constructor
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }


    // Method to return a string representation of the student
    @Override
    public String toString() {
        String genderString = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderString;
    }
}