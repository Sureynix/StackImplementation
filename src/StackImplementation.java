import java.util.Scanner;

/**
 * Created by Sureynix on 11/28/16.
 */
public class StackImplementation {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the stack machine! \n" +
                "How big would you like your stack to be today? \n" +
                "Please put in only integers and enter something 0 or less to quit. ");
        int size = in.nextInt();
        if (size <= 0) System.exit(0);
        Stack myStack = new Stack(size);
        while(true) {
            System.out.println("1 for push, 2 to pop, 3 to peek, 4 to print, and 5 to quit:");
                int i = in.nextInt();
                switch (i) {
                    case 1: System.out.println("What do you want to add:");
                        int addVal = in.nextInt();
                        myStack.push(addVal);
                        break;
                    case 2: System.out.println(myStack.pop()); break;
                    case 3: System.out.println(myStack.peek()); break;
                    case 4: myStack.printStack();break;
                    case 5: System.exit(0);break;
                }
            }
        }
    }
