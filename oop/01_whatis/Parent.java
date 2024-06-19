import java.io.*;

class Parent {
    void display() throws IOException {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    // This is allowed, as FileNotFoundException is a subclass of IOException
    void display() {
        System.out.println("Child class method");
    }
}