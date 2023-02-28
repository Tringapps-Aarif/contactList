
//"" Create a program that stores and manages a list of contacts. Each contact should have a name, phone number, and email address.
//  The program should allow the user to add, delete, and search for contacts.
//  This project will help you understand data structures such as linked lists and hash tables."
import java.util.*;

class contact {
    long num;
    String emailId;

    contact(long num, String id) {
        this.num = num;
        this.emailId = id;
    }

    public String toString() {
        return "Mobile number : " + num + "Email id : " + emailId;
    }
}

class contactList {
    public static void main(String args[]) {
        int ch = 0;
        String name = " ";
        Hashtable<String, contact> hstable = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        while (ch != 5) {
            System.out.println(" \n1.Create new Contact \n2.Delete existing contact \n3.Search a contact list \n4.Contct list \n5.Exit \nEnter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Name : ");
                    name = sc.next();
                    System.out.println("Number : ");
                    Long num = sc.nextLong();
                    System.out.println("Email Id : ");
                    String emailId = sc.next();
                    contact obj = new contact(num, emailId);
                    hstable.put(name, obj);
                }
                    break;
                case 2: {
                    System.out.println("Name : ");
                    name = sc.next();
                    hstable.remove(name);
                }
                    break;
                case 3: {
                    System.out.println("Name : ");
                    name = sc.next();
                        System.out.println("Name: " + name + " " + hstable.get(name));            
                }
                    break;
                case 4:
                    System.out.println(hstable);
                    break;
                default:
                    System.out.println("\nInvalid Choice\n");
                    break;
            }
        }
    }
}
