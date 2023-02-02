public class session3task1 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        session3task1 obj = new session3task1();

        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1.0, 2.0));
        System.out.println(obj.add("Hello", " World"));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1.0f, 2.0f, 3.0f));
    }
}