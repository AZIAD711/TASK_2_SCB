import java.util.ArrayList;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(350, "PROGRAMMING", "JAVA BASICS", "B001", "JAMES GOSLING", true);
        Magazine mag1 = new Magazine(45, 8, "TECH TODAY", "John Editor", "M001", true);
        Member member1 = new Member("M001", "ALICE", "alice@example.com", new ArrayList<LibraryItem>());
        Member member2 = new Member("M002", "ALI", "blice@example.com", new ArrayList<LibraryItem>());
        if(member1.getMemberId() == member2.getMemberId()){
            member2.duplicateMemberId();
        }
        if(member1.getEmail()==member2.getEmail()){
            member1.duplicateEmail();
        }
        if(mag1.month()>12 || mag1.month()<1){
            mag1.invalidMonth();
        }
        else {
            library.addItem(book1);
            library.addItem(mag1);
            library.addMember(member1);
            member1.borrowedItem(book1);
            member1.displayMember();
            member1.returnItem(book1);
            library.displayAllItems();
            library.displayAllMembers();
            LibraryItem item = book1;
            System.out.println("\n✅ LATE FEE FOR 5 DAYS (BOOK): $" + item.calculateLateFee(5));
            item = mag1;
            System.out.println("✅ LATE FEE FOR 5 DAYS (MAGAZINE): $" + item.calculateLateFee(10));
        }
    }
}
