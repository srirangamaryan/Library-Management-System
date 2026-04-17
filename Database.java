package CWH.Library_Management;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class BookNotFound extends Exception {
    public BookNotFound(String message) {
        super(message);
    }
}

public class Database {
    static LinkedList<ArrayList<String>> books = new LinkedList<>();
    static LinkedList<ArrayList<String>> issuedbooks = new LinkedList<>();

    static void addBook(String name, String aName) {
        ArrayList<String> book = new ArrayList<>();
        book.add(name);
        book.add(aName);
        books.add(book);
    }

    static void issueBook(String bookname, String issName, String issDate) throws BookNotFound {
        Iterator<ArrayList<String>> iterator = books.iterator();
        boolean found = false;
        
        while (iterator.hasNext()) {
            ArrayList<String> a = iterator.next();
            if (a.contains(bookname)) {
                a.add(issName);
                a.add(issDate);
                issuedbooks.add(a);
                iterator.remove();
                found = true;
                System.out.println("Book issued successfully!");
                break;
            }
        }
        
        if (!found) {
            throw new BookNotFound("Error: Book not found.");
        }
    }

    static void returnBook(String bookname) {
        Iterator<ArrayList<String>> iterator = issuedbooks.iterator();
        boolean found = false;
        
        while (iterator.hasNext()) {
            ArrayList<String> a = iterator.next();
            if (a.contains(bookname)) {
                ArrayList<String> returnedBook = new ArrayList<>();
                returnedBook.add(a.get(0));
                returnedBook.add(a.get(1));
                
                books.add(returnedBook);
                iterator.remove();
                found = true;
                System.out.println("Book returned successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in issued list.");
        }
    }

    static void displayAvailable() {
        System.out.println("\nAvailable Books:");
        for (ArrayList<String> a : books) {
            System.out.println(a.get(0) + " - " + a.get(1));
        }
    }

    static void displayIssuedBooks() {
        System.out.println("\nIssued Books:");
        for (ArrayList<String> a : issuedbooks) {
            System.out.println(a.get(0) + " (To: " + a.get(2) + ")");
        }
    }

    public static void main(String[] args) {
        addBook("Harry Potter 1", "J.K.Rowling");
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (true) {
            System.out.println("\n1. Available 2. Issued 3. Issue 4. Return 5. Add 6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> displayAvailable();
                case 2 -> displayIssuedBooks();
                case 3 -> {
                    System.out.print("Book: ");
                    String book = sc.nextLine();
                    System.out.print("Name: ");
                    String issuer = sc.nextLine();
                    System.out.print("Date: ");
                    String date = sc.nextLine();
                    try {
                        issueBook(book, issuer, date);
                    } catch (BookNotFound e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.print("Book to return: ");
                    String b = sc.nextLine();
                    returnBook(b);
                }
                case 5 -> {
                    System.out.print("Book Name: ");
                    String n = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    addBook(n, a);
                }
                case 6 -> exit = true;
            }
            if (exit) break;
        }
        sc.close();
    }
}
