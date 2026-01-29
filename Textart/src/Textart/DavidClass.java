package Textart;

import java.util.Scanner;

public class DavidClass {

    public static void main(String[] args) {
    	java.util.Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Enter your first name: ");
    	String firstName = scanner.nextLine();
    	
    	System.out.print("Enter your middle name: ");
    	String middleName = scanner.nextLine();
    	
    	System.out.print("Enter your last name: ");
    	String lastName = scanner.nextLine();
    	
    	System.out.println("\n Hi " + firstName + " " + middleName + " " +lastName + "!");
    	System.out.println(" Matthew 6:26 Look at the birds of the air; they do not sow or reap or store away \n"
    	+ "in barns, and yet your heavenly Father feeds them. Are you not much more "
    	+ "valuable than they?");
    	System.out.println("\uD83D\uDC96 God Loves You \u2764");
    	
    	scanner.close();
    	
        }
    }

