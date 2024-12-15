public class ThreadExample {
    public static void main(String[] args) {
                Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("BMSCE");
                try 
                 {
                    Thread.sleep(10000); 
                 } 
                catch (InterruptedException e) 
                {
                    System.out.println("Thread t1 interrupted: " + e.getMessage());
                }
            }
        });

       
        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("CSE");
                try 
                 {
                    Thread.sleep(2000); 
                 } 
                catch (InterruptedException e) 
                 {
                    System.out.println("Thread t2 interrupted: " + e.getMessage());
                 }
            }
        });

        t1.start();
        t2.start();
    }
}
