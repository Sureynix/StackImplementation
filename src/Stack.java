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
        if (top == arr.length) {
            System.out.println("Sorry, this stack is full. Please pop before trying again. ");
        }
        else {
            arr[top] = a;
            top++;
        }
    }
    public Integer pop () {
        if (top == 0) {
            System.out.println("Sorry, there are no values to be removed. " +
                    "Please add something first. ");
            return null;
        }
        else {
            int poppedNumber = arr[top-1];
            arr[top-1] = 0;
            top--;
            return poppedNumber;
        }
    }
    public Integer peek () {
        if (top == 0) {
            System.out.println("Sorry, you can't look at any values because there aren't any. " +
                    "Please add something first. ");
            return null;
        }
        return arr[top-1];
    }
    public void printStack () {
        for (int i = 0; i < top; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }

}
