import java.util.Scanner;

public class doWhileLoop {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n=== MENU ===");
	            System.out.println("1. Find Largest of a, b, c");
	            System.out.println("2. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
                    System.out.print("Enter value of a: ");
	                    int a = scanner.nextInt();

	                    System.out.print("Enter value of b: ");
	                    int b = scanner.nextInt();

	                    System.out.print("Enter value of c: ");
	                    int c = scanner.nextInt();

	                    int largest;
	                    if (a >= b && a >= c) {
	                        largest = a;
	                    } else if (b >= a && b >= c) {
	                        largest = b;
	                    } else {
	                        largest = c;
	                    }

	                    System.out.println("The largest number is: " + largest);
	                    break;

	                case 2:
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please choose 1 or 2.");
	            }

	        } while (choice != 2);

	        scanner.close();
	    }
	}



