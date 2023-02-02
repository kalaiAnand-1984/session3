// Interface definition
interface Shape {
    void draw();
    double getArea();
    double getPerimeter();
    void setColor(String color);
    String getColor();
}

// Class that implements the interface
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
