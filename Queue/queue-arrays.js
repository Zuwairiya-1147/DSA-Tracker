class myQueue {
    int[] arr;
    int rear;
    int front;
    int size;
    // Constructor
    public myQueue(int n) {
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n;
    }

    public boolean isEmpty() {
        if(front == -1)
        return true;
        return false;
    }

    public boolean isFull() {
        if(rear == size-1)
        return true;
        return false;
    }

    public void enqueue(int x) {
        if(isFull())
        return;
        if(front == -1) front = 0;
        rear++;
        arr[rear] = x;
    }

    public void dequeue() {
        if(isEmpty())
        return;
        if(front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    public int getFront() {
       if(isEmpty()) return -1;
       return arr[front];
    }

    public int getRear() {
    if(isEmpty()) return -1;
    return arr[rear];
}
}
