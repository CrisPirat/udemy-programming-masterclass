import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int index = findContact(contact);
        if(index < 0){
            this.myContacts.add(Contact.createContact(contact.getName(),contact.getPhoneNumber()));
            return true;
        }else{
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if(index >= 0){
            this.myContacts.set(index, Contact.createContact(newContact.getName(),newContact.getPhoneNumber()));
            return true;
        }else{
            return false;
        }
    }
    
    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if(index >= 0){
            this.myContacts.remove(index);
            return true;
        }
        return false;
    }
    
    private int findContact(Contact contact){
        return findContact(contact.getName());
    }
    
    private int findContact(String name){
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (name.equals(this.myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if(index >= 0){
            System.out.println("Yes... the contact exist...");
            System.out.println(this.myContacts.get(index).getName()+" -> "+this.myContacts.get(index).getPhoneNumber());
            return this.myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(this.myContacts.get(i).getName()+" -> "+this.myContacts.get(i).getPhoneNumber());
        }
    }
}
