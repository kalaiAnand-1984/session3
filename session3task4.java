class Parent1 {
    int a;

    public Parent1(int b) {
        a = b;
    }

    public void display() {
        System.out.println("Value of a: " + a);
    }
}

class Child1 extends Parent1 {
    public Child1(int b) {
        super(b);
    }
}

public class session3task4 {
    public static void main(String[] args) {
        Child1 obj = new Child1(5);
        obj.display();
    }
}

