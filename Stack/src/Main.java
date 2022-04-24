import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void arrStack() {
        System.out.print("Nhap so luong: ");
        int n = sc.nextInt();
        MyArrayStack stack = new MyArrayStack(n);
        System.out.println("Nhap gia tri (push):");
        for(int i = 0; i < n; i++){
            System.out.printf("+ %d: ", i);
            stack.push(sc.nextInt());
        }
        System.out.println("pop:");
        for(int i = 0; i < n; i++){
            System.out.printf("+ %d: ", i);
            System.out.println(stack.pop()+ " ");
        }
    }

    public static void linkedListStack() {
        System.out.print("Nhap so luong: ");
        int n = sc.nextInt();
        System.out.println("Nhap gia tri (push):");
        MyLinkedListStack stack = new MyLinkedListStack();
        for(int i = 0; i < n; i++){
            System.out.printf("+ %d: ", i);
            stack.push(sc.nextInt());
        }
        System.out.println("pop:");
        for(int i = 0; i < n; i++){
            System.out.printf("+ %d: ", i);
            System.out.println(stack.pop()+ " ");
        }
    }

    public static void javaStack() {
        Stack<Integer> myStack = new Stack<>();
        System.out.println("Push: " + myStack.push(1));
        System.out.println("Push: " + myStack.push(3));
        System.out.println("Push: " + myStack.push(5));
        System.out.println("Stack is empty: " + myStack.isEmpty());
        System.out.println();
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Stack is empty: " + myStack.isEmpty());
    }

    public static void main(String[] args) {
//        arrStack(); // cai dat stack bang array
//        linkedListStack(); // cai dat stack bang linked list

//         cai dat stack bang thu vien
//         javaStack();
    }
}
