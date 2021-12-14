
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Book)){
            return false;
        }
        
        Book compared_book = (Book)compared;
        if(this.name.equals(compared_book.name)&&
            this.publicationYear == compared_book.publicationYear){
            return true;
        }       
        return false;        
    }
}
