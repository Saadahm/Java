class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    void study() {
        System.out.println(name + " is studying...");
    }
    void bark(){
        System.out.println("hello");
    }
}

class Child extends Student {
    Child(String name) {
        super(name);

    }
    @Override
    void study() {
        System.out.println(name + " is studying with colorful books...");
    }
}

public class op {
    public static void main(String[] args) {
        // Declare variable s of type Student and assign it a Child object
        Student s = new Child("Alice");
        s.bark(); // Prints "Alice is studying with colorful books..."

        System.out.println(s.name);
        // Check what s refers to
        System.out.println(s.getClass().getSimpleName()); // Prints "Child"

        // Reassign s to a different Student subtype
        s = new Student("Bob");
        s.study(); // Prints "Bob is studying..."
        System.out.println(s.getClass().getSimpleName()); // Prints "Student"
    }
}