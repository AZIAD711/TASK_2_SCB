import java.lang.*;
abstract class LibraryItem {
//    Attributes
    private String title;
    private String author ;
    private String isbn;
    private boolean isAvailable;
    private double fee;
//    Methods
//    Constructor with parameters
public LibraryItem(String title, String author, String isbn, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}
//Getter methods for all attributes
    public String getTitle() {
    return title;
    }
    public String getAuthor() {
    return author;
    }
    public String getIsbn() {
    return isbn;
    }
    public boolean isAvailable() {
    return isAvailable;
    }
//    setAvailable(boolean available) method
    public void setAvailable(boolean available) {
    isAvailable = available;
    }
//    Abstract method: displayInfo()
    public void displayInfo(){}
//    Abstract method: calculateLateFee(int daysLate) returns double
    public double calculateLateFee(int dayLate){
    return  dayLate;
    }
}
