abstract class Shape {
    int x1;
    int x2;

    Shape(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    abstract void area();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void area() {
        int result = x1 * x2;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void area() {
        int result = (x1 * x2) / 2;
        System.out.println("Area of Triangle: " + result);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void area() {
        double result = 3.14 * x1 * x1;
        System.out.println("Area of Circle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        rect.area();

        Triangle tri = new Triangle(5, 4);
        tri.area();

        Circle circ = new Circle(3, 0);
        circ.area();
        System.out.println("Name : Deepthi M ");
        System.out.println("USN : 1BM23CS088");
    }
}
