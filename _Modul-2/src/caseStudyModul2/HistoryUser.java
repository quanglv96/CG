package caseStudyModul2;

import java.io.Serializable;

public class HistoryUser implements Serializable {
    private int numpage;
    private Book book;
    public void historyUser(){
    }

    public HistoryUser(int numpage, Book book) {
        this.numpage = numpage;
        this.book = book;
    }

    public int getNumpage() {
        return numpage;
    }

    public void setNumpage(int numpage) {
        this.numpage = numpage;
    }

    public Book getIdBook() {
        return book;
    }

    public void setIdBook(Book book) {
        this.book = book;
    }
}
