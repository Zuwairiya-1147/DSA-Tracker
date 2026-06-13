class myStack {
    int size;
    int arr[];
    int top;
    
    public myStack(int n) {
         size = n;
         arr = new int[n];
         top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
       return top == size-1;
    }

    public void push(int x) {
        if(top != size-1)
        arr[++top] = x;
    }

    public void pop() {
        if(top != -1)
        top--;
    }

    public int peek() {
        if(top != -1)
        return arr[top];
        return -1;
    }
    
}