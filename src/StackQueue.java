public class StackQueue {

    Stack stackEnqueue;
    Stack stackDequeue;
    private int size;

    public StackQueue(){
        size = 0;
        stackDequeue = new Stack();
        stackEnqueue = new Stack();
    }

}
