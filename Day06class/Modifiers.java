package Day06class;

// public class Modifiers {

// TODO:----------------FINAL-------------------
// final int x = 10;
// final double PI = 3.14;

// public static void main(String[] args) {
// Main myObj = new Main();
// myObj.x = 50; //! will generate an error: cannot assign a value to a final
// variable
// myObj.PI = 25; //! will generate an error: cannot assign a value to a final
// variable
// System.out.println(myObj.x);
// }

// TODO:----------------STATIC-------------------
// Static method
// static void myStaticMethod() {
// System.out.println("Static methods can be called without creating objects");
// }

// // Public method
// public void myPublicMethod() {
// System.out.println("Public methods must be called by creating objects");
// }

// // Main method
// public static void main(String[] args) {
// myStaticMethod(); // Call the static method
// // myPublicMethod(); This would output an error

// Main myObj = new Main(); // Create an object of Main
// myObj.myPublicMethod(); // Call the public method
// }

// }

// TODO:----------------ABSTRACT-------------------
// Code from filename: Main.java
// abstract class
abstract class Modifiers {
    public String fname = "John";
    public int age = 24;

    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Modifiers {
    public int graduationYear = 2018;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java
