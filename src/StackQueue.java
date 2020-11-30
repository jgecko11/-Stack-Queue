public class StackQueue<T>{

    Stack stackEnqueue;
    Stack stackDequeue;
    private int size;

    public StackQueue(){
        size = 0;
        stackDequeue = new Stack();
        stackEnqueue = new Stack();
    }

    public int size(){
        //returns number of nodes
        return size;
    }
    public boolean isEmpty(){
        //returns if there is nothing in the stack
        return !(size>0);
    }

}
