/*
henry johnson
10/23/20
11/2/20
Stack is designed to create a stack of nodes so that only the top peice is accessable
 */

public class Stack <T>{
    private StackNode<T> ancestorNode;
    private int size;
    public Stack(){
        size = 0;
        ancestorNode = new StackNode<T>();
    }
    public void push(T data){
        //moves to last node
        StackNode currNode = ancestorNode;
        for(int i = 0; i < size; i++){
            currNode = currNode.getChild();
        }
        //Creates a new node with data
        StackNode<T> newNode = new StackNode<T>(data);
        newNode.setParent(currNode);
        //adds 1 to size
        size++;
    }
    public StackNode pop(){
        //moves to last node
        StackNode currNode = ancestorNode;
        for(int i = 0; i < size; i++){
            currNode = currNode.getChild();
        }
        //removes currnode and saves the datatype

        size--;

        return (StackNode)currNode;
    }
    public StackNode peek(){
        //moves to last node
        StackNode currNode = ancestorNode;
        for(int i = 0; i < size; i++){
            currNode = currNode.getChild();
        }
        //returns top node
        return currNode;
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
