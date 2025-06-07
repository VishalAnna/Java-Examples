package MethodsPractice;

class Grandparent {
    void grandparentMethod() {
        System.out.println("Grandparent's method");
    }
}

class Parent extends Grandparent {
    void parentMethod() { // Corrected as per source, this method should be defined.
        System.out.println("Parent's method"); // This line appears to be misplaced in the original PDF, it should be inside the parentMethod(). Corrected here.
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child's method"); // Corrected line as per source, it should be within childMethod() method.
    }
}

public class familytree {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.grandparentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}
