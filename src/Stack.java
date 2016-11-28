/**
 * Created by Sureynix on 11/28/16.
 */
public class Stack {
    private int [] arr;
    private int top = 0;
    public Stack (int a) {
        arr = new int[a];
    }
    public void push (int a) {
        if (top == arr.length-1) {
            System.out.println("Sorry, this stack is full. Please pop before trying again. ");
        }
        else {
            top++;
            arr[top] = a;
        }
    }
    public int pop () {
        int poppedNumber = arr[top];
        arr[top] = 0;
        top--;
        return poppedNumber;
    }
    public int peek () {
     return arr[top];
    }
    public void printStack () {
        for (int i = 0; i < top; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }

}
