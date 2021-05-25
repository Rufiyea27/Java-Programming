package Oops;

public class AbstractClasses {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        obj.screen();

    }

}

class Student extends show {
    void display() {
        System.out.println("Non abstract method");
    }
}

abstract class show {
    abstract void display();// abstract

    public void screen() {
        System.out.println("Non abstract");
    }
}