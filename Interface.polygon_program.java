interface Polygon {
    double getArea();
    double getPerimeter();
}

class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Polygon {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return Math.PI * rad * rad;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rad;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Polygon r = new Rectangle(3.5, 5);
        Polygon c = new Circle(23);

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        System.out.println("Name : Deepthi M ");
        System.out.println("USN : 1BM23CS088");
    }
}
