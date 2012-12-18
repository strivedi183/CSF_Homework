import java.util.Scanner;

public class Lab3Samples {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("\nEnter 'list' or 'stack' to start: ");
        String command = consoleScanner.next();
        if (command.equals("list")) {
            linkedList();
        }
        else if (command.equals("stack")) {
            stack();
        }
        else {
            System.out.println("Invalid input, bailing");
        }
    }

    public static void linkedList() {
        IntLinkedList list =  new IntLinkedList();

        while(true) {
            Scanner consoleScanner = new Scanner(System.in);
            System.out.print("\nEnter a command: \n {add/remove} number to modify the list, \n {count} to see how many nodes exist in the list, \n {print} to return the values stored in each node: ");
            String command = consoleScanner.next();
            

            if (command.equals("add")) {
            	int value = consoleScanner.nextInt();       	  
            	list.insert(value);
            }
            else if (command.equals("remove")) {
            	int value = consoleScanner.nextInt();  
            	list.remove(value);
            }
            else if (command.equals("count")) {
            	
            	System.out.println("There are " + list.count() + " items in the list.");
            }
            else if (command.equals("print"))
            {
                list.print();
            }
        }
    }

    public static void stack() {
        IntStack stack = new IntStack();

        while(true) {
            Scanner consoleScanner = new Scanner(System.in);
            System.out.print("\nEnter {push/pop} number to modify the stack: ");
            String command = consoleScanner.next();

            if (command.equals("push")) {
                int value = consoleScanner.nextInt();

                stack.push(value);
                System.out.println("Stack pushed value: " + value + ", size is: " + stack.size());
            }
          
            else if (command.equals("pop")) {
                System.out.println("Stack popped value: " + stack.pop() + ", size is: " + stack.size());
            }
           
        }
    }
}