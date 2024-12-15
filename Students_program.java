import java.util.Scanner;

class Students {
    String usn;
    String name;
    int marks[];
    int credits[];
    int subjects;

    Students(int subjects) {
        this.subjects = subjects;
        credits = new int[subjects];
        marks = new int[subjects];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's USN: ");
        usn = sc.nextLine();
        System.out.println("Enter the student's name: ");
        name = sc.nextLine();

        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter the credits of subject : ");
            credits[i] = sc.nextInt();
            System.out.println("Enter the marks of subject : ");
            marks[i] = sc.nextInt();
        }
    }

    double SGPA_calc() {
        int totalCredits = 0;
        double weightedPoints = 0.0;

        for (int i = 0; i < subjects; i++) {
            totalCredits += credits[i];
            double gradePoint = (marks[i] / 10.0); 
            weightedPoints += gradePoint * credits[i];
        }

        return weightedPoints / totalCredits;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student USN: " + usn);
        for (int i = 0; i < subjects; i++) {
            System.out.println( "Credits: " + credits[i] + "and Marks: " + marks[i]);
        }
        System.out.printf("SGPA: %.2f%n", SGPA_calc());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int subjects = sc.nextInt();

    
        Students student1 = new Students(subjects);
        Students student2 = new Students(subjects);

        System.out.println("Enter details for Student 1:");
        student1.input();
        System.out.println("Details of Student 1:");
        student1.display();

        System.out.println("\nEnter details for Student 2:");
        student2.input();
        System.out.println("Details of Student 2:");
        student2.display();
        System.out.println("Name :  Deepthi M ");
        System.out.println("USN : 1BM23CS088");

        sc.close();
    }
}
