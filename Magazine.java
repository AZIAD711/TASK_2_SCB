import java.lang.*;
class Magazine extends LibraryItem {
//    Attributes
    private int issueNumber;
    private  int month;
    private String monthMessage="";
;
    //    Constructor calling super constructor
    public Magazine(int issueNumber, int month, String title, String author,String isbn,boolean isAvailable ) {
        super(title, author, isbn, isAvailable);
        this.issueNumber = issueNumber;
        this.month = month;
    }
//    Validate If Month Is Invalid Method
    public void invalidMonth(){
            System.out.println("❌ ERROR MESSAGE : INPUT VALUE SHOULD BE IN RANGE ( 1 - 12 ) ");
    }
//    Getter methods for new attributes
    public int getIssueNumber() {
        return issueNumber;
    }
    public int month(){
        return month;
    }
    public String getMonthMessage() {
        return monthMessage;
    }
//    Implement displayInfo() method
@Override
public void displayInfo(){
            System.out.println("✅ TITLE : "+getTitle());
            System.out.println("✅ AUTHOR : "+getAuthor());
            System.out.println("✅ ISBN : "+getIsbn());
            System.out.println("✅ ISSUE NUMBER : "+issueNumber);
            System.out.println("✅ MONTH : "+month);
}
//Implement calculateLateFee() method (₹1 per day)
@Override
public double calculateLateFee(int dayLate) {
    return  dayLate*0.2;
}
}
