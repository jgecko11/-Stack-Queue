
public class StackQueue<T>{

    Stack stackEnqueue;
    Stack stackDequeue;
    private int size;
  
    public StackQueue(){
        size = 0;
        stackDequeue = new Stack();
        stackEnqueue = new Stack();
    }


    public StackNode peekQueue(){
        int size = stackEnqueue.size();
        for (int i = 0; i < size; i++) {
            stackDequeue.push(stackEnqueue.pop());
        }
        StackNode returnable = stackDequeue.peek();
        Stack copyDeque = stackDequeue;
        for (int i = 0; i < stackDequeue.size(); i++) {
            stackEnqueue.push(copyDeque.pop());
        }
        return returnable;
    }
    public StackNode popQueue() {
        int size = stackEnqueue.size();
        for (int i = 0; i < size; i++) {
            stackDequeue.push(stackEnqueue.pop());
        }
        StackNode returnable = stackDequeue.pop();
        Stack copyDeque = stackDequeue;
        for (int i = 0; i < stackDequeue.size(); i++) {
            stackEnqueue.push(copyDeque.pop());
        }
        return returnable;
    }



    public int size(){
        //returns number of nodes
        return size;
    }
    public boolean isEmpty(){
        //returns if there is nothing in the stack
        return !(size>0);
    }

    public void push(T data){
        stackEnqueue.push(data);

    }
}

