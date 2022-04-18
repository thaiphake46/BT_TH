public class MyLinkedListStack implements IStack{
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node topNode;

    MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void printList() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = topNode;
        while(temp != null) {
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }
}
