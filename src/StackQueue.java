import org.omg.CORBA.PUBLIC_MEMBER;

public class StackQueue<T>{

    Stack stackEnqueue;
    Stack stackDequeue;
    private int size;

    public StackQueue(){
        size = 0;
        stackDequeue = new Stack();
        stackEnqueue = new Stack();
    }

    public void push(T data){
        stackEnqueue.push(data);
    }
}
