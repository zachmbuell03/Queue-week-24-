package Final;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        
        System.out.println("Enter 5 people:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("First Name: ");
            String first = sc.nextLine();

            System.out.print("Last Name: ");
            String last = sc.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            queue.enqueue(new Person(first, last, age));
        }
        
        System.out.println("\n--- Original Queue ---");
        queue.printQueue();

        System.out.println("\n--- Sorted by Last Name (Descending) ---");
        queue.quickSortByLastName();
        queue.printQueue();

        System.out.println("\n--- Sorted by Age (Descending) ---");
        queue.quickSortByAge();
        queue.printQueue();

        sc.close();
    }
	
}
