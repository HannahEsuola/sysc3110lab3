import java.util.Scanner;

public class BuddyInfo {
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    static void main(String[] args) {

        BuddyInfo buddy1 = new BuddyInfo("Homer", "4567", "613423");
        System.out.println("Hello " + buddy1.getName() + "!" );
    }






}
