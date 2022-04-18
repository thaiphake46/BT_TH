import com.sun.tools.jconsole.JConsoleContext;

public class MyArrayStack implements IStack{
    private int[] arr;
    private int size;
    private int top;

    MyArrayStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()) {
            top++;
            arr[top] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = arr[top];
            top--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return top == size-1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public void printList() {
         if(!isEmpty()) {
             for(int i = 0; i <= top; i++) {
                 System.out.print(arr[i] + " ");
             }
             System.out.println();
         }
         else {
             System.out.println("Stack is empty");
         }
    }
}
