public class StackQueue<T> {

    Stack Stackenque = new Stack();
    Stack Stackdeque = new Stack();

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
    }
}
