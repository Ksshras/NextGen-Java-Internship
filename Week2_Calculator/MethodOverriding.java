package Week2_Calculator;

class Parent {
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is Child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
