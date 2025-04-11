class Student {
    private int studentId;
    private String name;
    private String course;
    private int age;

    // 1. No-Argument Constructor (Default Constructor)
    public Student() {
        this.studentId = 0;
        this.name = "Default Name";
        this.course = "Default Course";
        this.age = 18;
        System.out.println("No-argument constructor called for Student: " + this.name);
    }

    // 2. Parameterized Constructor with all attributes
    public Student(int studentId, String name, String course, int age) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.age = age;
        System.out.println("Parameterized constructor (all attributes) called for Student: " + this.name);
    }

    // 3. Parameterized Constructor with some attributes (e.g., id and name)
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.course = "Not Assigned";
        this.age = 19; // Default age if not provided
        System.out.println("Parameterized constructor (id and name) called for Student: " + this.name);
    }

    // 4. Copy Constructor (creates a new object with the same values as an existing object)
    public Student(Student otherStudent) {
        this.studentId = otherStudent.studentId;
        this.name = otherStudent.name;
        this.course = otherStudent.course;
        this.age = otherStudent.age;
        System.out.println("Copy constructor called for Student: " + this.name);
    }

    // Getter methods (for demonstration)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
    }
}

public class ConstructorTypesExample {
    public static void main(String[] args) {
        System.out.println("--- Creating Student using No-Argument Constructor ---");
        Student student1 = new Student();
        student1.displayDetails();

        System.out.println("\n--- Creating Student using Parameterized Constructor (all attributes) ---");
        Student student2 = new Student(101, "Alice", "Computer Science", 20);