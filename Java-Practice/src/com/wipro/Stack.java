package com.wipro;

import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        System.out.println("Popped: " + stackArray[top]);
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    		System.out.println("=====Stack Implementation=====");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter stack size: ");
            int size = scanner.nextInt();
            Stack stack = new Stack(size);
            
            int choice;
            do {
                System.out.println("\n===== Stack Operations Menu =====");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Check if Empty");
                System.out.println("5. Check if Full");
                System.out.println("6. Display Stack");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        System.out.println("Top element: " + stack.peek());
                        break;
                    case 4:
                        System.out.println(stack.isEmpty() ? "Stack is empty." : "Stack is not empty.");
                        break;
                    case 5:
                        System.out.println(stack.isFull() ? "Stack is full." : "Stack is not full.");
                        break;
                    case 6:
                        stack.display();
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 7);
            
            scanner.close();
    }
}

