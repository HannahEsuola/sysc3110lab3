import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public static void main (String[] args){
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }


}
