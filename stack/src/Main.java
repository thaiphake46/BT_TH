import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    final static int MAX_SIZE = 10;
    
    public static int[] push(int[] stack, int index) {
        for(int i = index; i < stack.length; i++) {
            System.out.printf("+ %d", i);
            stack[i] = sc.nextInt();
        }
        return stack;
    }

    public static int[] pop(int[] stack, int n) {

        return stack;
    }

    public static void B2() {
        System.out.print("Nhap so luong: ");
        int n = sc.nextInt(), len = n;
        if(n > MAX_SIZE){
            n = MAX_SIZE;
        }
        int[] stack = new int[n];
        System.out.println("push");

    }

    public static void B3() {
        Node head = new Node(5);

        System.out.println("Thuc hien Push");
        head = head.push(head, 4);
        head = head.push(head, 3);
        head = head.push(head, 2);
        head = head.push(head, 1);

        Node.printList(head);
        System.out.println();
        System.out.println("Thuc hien Pop");
        head = head.pop(head);
        head = head.pop(head);

        System.out.println();
        System.out.println("Kiem tra empty");
        Node.printList(head);
        System.out.println(head.isEmpty(head));
    }

    public static void main(String[] args) {
//        B3();
    }
}
