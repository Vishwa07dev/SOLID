package org.example.srp.transformed;

public class Book {
    private String title ;
    private String author ;
    private int pageCount ;
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
}
class BookDatabase {
    public void saveToDB(Book book){
        //Code to save the book in db
    }
}
class BookPrinter {
    public void printBookDetails(Book book){
        //Code to print the book details
    }
}
