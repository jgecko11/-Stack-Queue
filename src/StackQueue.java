
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
        Stack copyEnque = Stackenque;
        for(int i = 0;i<Stackenque.size();i++){
            Stackdeque.push(copyEnque.pop());
        }
        StackNode returnable =  Stackdeque.peek();
        return returnable;
    }
    public StackNode popQueue(){
        int size = Stackenque.size();
        for(int i = 0;i<size;i++){
            Stackdeque.push(Stackenque.pop());
        }
        StackNode returnable =  Stackdeque.pop();
        Stack copyDeque = Stackdeque;
        for(int i = 0;i<Stackdeque.size();i++){
            Stackenque.push(copyDeque.pop());
        }
        return returnable;



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

