/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String author, String bookName, int bookPages){
        this.author = author;
        this.name = bookName;
        this.pages = bookPages;    
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.author + ", " + this.name + ", "+ this.pages + " pages";
    }
}
