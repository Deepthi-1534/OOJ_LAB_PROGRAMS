abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat");
    }

    void sleep() {
        System.out.println("Lion sleeps at night");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass");
    }

    void sleep() {
        System.out.println("Deer sleeps during the day");
    }
}

class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal deer = new Deer();

        System.out.println("Lion:");
        lion.eat();
        lion.sleep();

        System.out.println("\nDeer:");
        deer.eat();
        deer.sleep();  
        System.out.println("Name : Deepthi M ");
        System.out.println("USN : 1BM23CS088");
    }
}
