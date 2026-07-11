package assignment2;

public class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year =year;
    }
    void printDetails(){
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("year = " + year);
    }

    static void main(String[] args) {
        Book book1 = new Book("A","xyz",2000);
        Book book2 = new Book("B","mno",1999);
        Book book3 = new Book("C","pqr",2010);
        Book book4 = new Book("D","abc",2020);
        Book book5 = new Book("E","hij",2025);

        Book [] books = {book1,book2,book3,book4,book5};

        for (Book book : books){
            if (book.year > 2000){
                book.printDetails();
            }
        }
    }
}
