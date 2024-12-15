import java.util.Scanner;

class Quadratic {
    int a, b, c;
    double r1, r2, d;

    void get() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = in.nextInt();
        System.out.println("Enter the value of b");
        b = in.nextInt();
        System.out.println("Enter the value of c");
        c = in.nextInt();
    }

    void compute() {
        if (a == 0) {
            System.out.println("The value of a shouldn't be zero");
        } else {
            d = (b * b) - (4 * a * c);
            if (d > 0) {
                r1 = (-b + Math.sqrt(d)) / (2 * a);
                r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("The roots are real and distinct");
                System.out.println("Root 1 = " + r1 + " Root 2 = " + r2);
            } else if (d == 0) {
                r1 = -b / (2.0 * a);
                System.out.println("The roots are equal");
                System.out.println("Root 1 = Root 2 = " + r1);
            } else {
                double real = -b / (2.0 * a);
                double imag = Math.sqrt(-d) / (2.0 * a);
                System.out.println("The roots are imaginary");
                System.out.println("Root 1 = " + real + " + " + imag + "i");
                System.out.println("Root 2 = " + real + " - " + imag + "i");
            }
        }
    }
}

class QuadraticMain {
    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        q.get();
        q.compute();
        System.out.println("Name: Deepthi M");
        System.out.println("USN: 1BM23CS088");
    }
}
