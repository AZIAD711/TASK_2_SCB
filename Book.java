import java.lang.*;
class Book extends LibraryItem{
//    Attributes
    private  int pages;
    private  String genre;
//    Methods
//    Constructor calling super constructor
public Book(int pages, String genre, String title,String isbn,String author,boolean isAvailable) {
        super(title,author,isbn,isAvailable);
        this.pages = pages;
        this.genre = genre;
}
//Getter methods for new attributes
    public int getPages() {
        return pages;
    }
    public String getGenre() {
    return genre;
    }
//    Implement displayInfo() method
    @Override
    public void displayInfo(){
    System.out.println("✅ TITLE : "+getTitle());
    System.out.println("✅ AUTHOR : "+getAuthor());
    System.out.println("✅ ISBN : "+getIsbn());
    System.out.println("✅ PAGES : "+pages);
    System.out.println("✅ GENRE : "+genre);
    }
//    Implement calculateLateFee() method (₹2 per day)
    @Override
    public double calculateLateFee(int dayLate) {
    return  dayLate*0.2;
    }
}
