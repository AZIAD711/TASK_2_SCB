import java.lang.*;
import java.util.ArrayList;
class Member {
//    Attributes
    private String memberId;
    private  String name;
    private String email;
    private ArrayList<LibraryItem> borrowedItems;
// Constructor with parameters
    public Member(String memberId, String name, String email, ArrayList<LibraryItem> borrowedItems) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.borrowedItems = borrowedItems;
    }
//    Getter methods
    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
// Duplicate ID Method
    public void duplicateMemberId(){
            System.out.println("❌ ERROR MESSAGE : DUPLICATE MEMBER BY ID IS NOT ALLOWED !");
    }
// Duplicate Email Method
public void duplicateEmail(){
    System.out.println("❌ ERROR MESSAGE : DUPLICATE MEMBER BY EMAIL IS NOT ALLOWED !");
}
//    borrowItem(LibraryItem item) returns boolean
public boolean borrowedItem(LibraryItem item) {
    if (item.isAvailable()) {
        borrowedItems.add(item);
        item.setAvailable(false);
        System.out.println("✅ " + name + " BORROWED " + item.getTitle());
        return true;
    } else {
        System.out.println("❌ " + item.getTitle() + " IS NOT AVALIABLE ");
        return false;
    }
}
//    returnItem(LibraryItem item) returns boolean
    public boolean returnItem(LibraryItem item) {
        if(borrowedItems.remove(item)){
            item.setAvailable(true);
            System.out.println("✅ "+name + " RETURN " + item.getTitle());
            return true;
        }
        else {
            System.out.println("❌ IS NOT FOUND IN BOROWWED LIST ");
            return false;
        }
}
// displayMemberInfo() method
    public void displayMember() {
        System.out.println("✅ MEMBER ID : " + memberId);
        System.out.println("✅ MEMBER NAME : " + name);
        System.out.println("✅ MEMBER EMAIL : " + email);
//        System.out.println("✅ BORROWED LIST : ");
//        int count=0;
//        for (LibraryItem item : borrowedItems) {
//            System.out.println("✅ "+count+":"+item.getTitle());
//            count++;
//        }
    }
}
