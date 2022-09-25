class MyCircularQueue {
    int[] queue;
    int s;
    int front=-1,rear=-1;

    public MyCircularQueue(int k) {
        queue = new int[k];
        s=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty())
            front=0;
            rear=(rear+1)%s;
            queue[rear]=value;
         
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front==rear) front=rear=-1;
        else front=(front+1)%s;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queue[front];
        
        
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front==-1 &&rear==-1;
        
    }
    
    public boolean isFull() {
        return ((rear+1)%s)==front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */