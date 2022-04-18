public class Node implements  Stack {
    int value;
    Node next;

    Node() {}
    Node(int value) {
        this.value = value;

    }

    public void setValue(int value) {this.value = value;}
    public int getValue() {return value;}

    public static void printList(Node head) {
        Node tmp = head;
        while(tmp != null){
            System.out.printf("%d", tmp.value);
            tmp = tmp.next;
            if(tmp != null) {
                System.out.print("->");
            } else {
                System.out.println();
            }
        }
    }

    @Override
    public Node push(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    @Override
    public Node pop(Node head) {
        if(head != null) {
            return head.next;
        }
        return head;
    }

    @Override
    public boolean isEmpty(Node head) {
        if(head == null) {
            System.out.println("Stack is empty.");
            return true;
        }
        System.out.println("Stack isn't empty");
        return false;
    }
}
