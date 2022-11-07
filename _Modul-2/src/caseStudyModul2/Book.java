package caseStudyModul2;

import java.io.Serializable;

public class Book implements Serializable {
    private String id;
    private String namebook;
    private String author;
    private String category;

    public Book() {
    }

    public Book(String id, String namebook, String author,String category) {
        this.id = id;
        this.namebook = namebook;
        this.author = author;
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return "Book ID: "+ getId()+", Name: "+getNamebook()+", Author: "+getAuthor()+", Category: "+getCategory();
    }
}
