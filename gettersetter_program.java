import java.util.Scanner;

class Books {
    private String name;
    private String author;
    private int price;
    private int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book [Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + numPages + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF BOOKS");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Books[] books = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE NAME OF THE BOOK");
            String name = scanner.nextLine();

            System.out.println("ENTER THE AUTHOR OF THE BOOK");
            String author = scanner.nextLine();

            System.out.println("ENTER THE PRICE OF THE BOOK");
            int price = scanner.nextInt();

            System.out.println("ENTER THE NUMBER OF PAGES OF THE BOOK");
            int numPages = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            books[i] = new Books(name, author, price, numPages);
        }

        System.out.println("\nDetails of the books:");
        for (Books book : books) {
            System.out.println(book);
        }

        System.out.println("\nNAME: Deepthi M");
        System.out.println("USN: 1BM23CS088");

        scanner.close();
    }
}
