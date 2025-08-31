import java.lang.*;
import java.util.ArrayList;

class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<Member> members;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("✅ "+item.getTitle() + " ADDED TO LIBRARY");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("✅ MEMBER " + member.getName() + " ADDED.");
    }

    public LibraryItem findItemByIsbn(String isbn) {
        for (LibraryItem item : items) {
            if (item.getIsbn().equals(isbn)) return item;
        }
        return null;
    }

    public Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void displayAllItems() {
        System.out.println("\n--- LIBRARY ITEMS ---");
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    public void displayAllMembers() {
        System.out.println("\n--- LIBRARY MEMBERS  ---");
        for (Member member : members) {
            member.displayMember();
        }
    }
}
