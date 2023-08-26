public class Stack <T> {
    private T [] arr;
    private int size;
    private int top;

    public Stack(int size){
        this.size = size;
        this.top = -1;
        arr = (T[]) new Object[size];
    }
    public boolean isFull(){
        return top == size-1;
    }
    public boolean isEmpty(){
        return size == - 1;
    }
    public T pop(){
        if (isEmpty()){
            return null;
        }
        return arr[top--];
    }

    public boolean push(T data){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        arr[++top] = data;
            return true;

    }
    public void display() {
        for (int i = 0; i <= top; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
