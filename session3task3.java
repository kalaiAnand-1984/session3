class A {
    public int display(int a, int b) {
        return a + b;
    }
}

class B extends A {
    public int display(int a, int b) {
        return a * b;
    }
}

class C extends B {
    public int display(int a, int b) {
        return a - b;
    }
}

public class session3task3 {
    public static void main(String[] args) {
        C obj = new C();
        int result = obj.display(5, 6);
        System.out.println("Result: " + result);
    }
}