
class Parent {
public static void display() {
        System.out.println("From Parent Class");
        }
        }

class Child extends Parent {
    public static void display() {
        System.out.println("From Child Class");
    }
}

public class session3task2 {
    public static void main(String[] args) {
        Child.display();
    }
}

