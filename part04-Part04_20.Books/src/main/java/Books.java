/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Books {
    private String title;
    private int pages;
    private int year;
    
    public Books(String bookTitle, int bookPages, int year){
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = year;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
}
