//package com.wipro;
//
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Scanner;
//
//class QueueImplement {
//    private Node front, rear;
//    private int size;
//
//    // Node class represents each element in the queue
//    private class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            next = null;
//        }
//    }
//
//    // Constructor to initialize an empty queue
//    public void Queue() {
//        front = rear = null;
//        size = 0;
//    }
//
//    // Enqueue operation: Adds an element to the rear of the queue
//    public void enqueue(int item) {
//        Node newNode = new Node(item);
//        if (rear == null) {
//            front = rear = newNode;
//        } else {
//            rear.next = newNode;
//            rear = newNode;
//        }
//        size++;
//    }
//
//    // Dequeue operation: Removes and returns the front element of the queue
//    public int dequeue() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty.");
//            return -1;
//        }
//        int data = front.data;
//        front = front.next;
//
//        if (front == null) {
//            rear = null;  // If the queue becomes empty
//        }
//        size--;
//        return data;
//    }
//
//    // Peek operation: Returns the front element without removing it
//    public int peek() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty.");
//            return -1;
//        }
//        return front.data;
//    }
//
//    // Check if the queue is empty
//    public boolean isEmpty() {
//        return front == null;
//    }
//
//    // Get the size of the queue
//    public int size() {
//        return size;
//    }
//
//    // Display the current contents of the queue
//    public void displayQueue() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty.");
//        } else {
//            Node current = front;
//            System.out.print("Queue contents: ");
//            while (current != null) {
//                System.out.print(current.data + " ");
//                current = current.next;
//            }
//            System.out.println();
//        }
//    }
//
//    // Main method to test the Queue functionality with a menu
//    public static void main(String[] args) {
//        Queue queue = new Queue();
//        Scanner sc = new Scanner(System.in);
//        int choice, item;
//
//        do {
//            // Menu display
//            System.out.println("\nQueue Menu:");
//            System.out.println("1. Enqueue");
//            System.out.println("2. Dequeue");
//            System.out.println("3. Peek");
//            System.out.println("4. Check if Queue is Empty");
//            System.out.println("5. Display Queue");
//            System.out.println("6. Get Queue Size");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    // Enqueue operation
//                    System.out.print("Enter the element to enqueue: ");
//                    item = sc.nextInt();
//                    queue.enqueue(item);
//                    System.out.println("Element enqueued: " + item);
//                    break;
//
//                case 2:
//                    // Dequeue operation
//                    int dequeued = queue.dequeue();
//                    if (dequeued != -1) {
//                        System.out.println("Element dequeued: " + dequeued);
//                    }
//                    break;
//
//                case 3:
//                    // Peek operation
//                    int peeked = queue.peek();
//                    if (peeked != -1) {
//                        System.out.println("Front element: " + peeked);
//                    }
//                    break;
//
//                case 4:
//                    // Check if the queue is empty
//                    if (queue.isEmpty()) {
//                        System.out.println("Queue is empty.");
//                    } else {
//                        System.out.println("Queue is not empty.");
//                    }
//                    break;
//
//                case 5:
//                    // Display the queue contents
//                    ((QueueImplement) queue).displayQueue();
//                    break;
//
//                case 6:
//                    // Get the size of the queue
//                    System.out.println("Queue size: " + queue.size());
//                    break;
//
//                case 7:
//                    // Exit the program
//                    System.out.println("Exiting...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice! Please try again.");
//            }
//        } while (choice != 7);
//
//        sc.close();
//    }
//}
//
