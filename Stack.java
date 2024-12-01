

import java.util.Scanner;

public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] stackArray;
    private int top;

    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow! Cannot push " + value + ".");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            System.out.println("Peeked: " + stackArray[top]);
            return stackArray[top];
        } else {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.println("Stack Contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner obj = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Menu:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Display");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int valueToPush = obj.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);

        obj.close();
    }
}
