/*
henry johnson
10/27/20
11/1/20
this is designed to test the stack class
 */
public class driver {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<String>();
        s1.push("firstNode");
        s1.push("secondNode");
        s1.push("thirdNode");
        System.out.println("should print 3");
        System.out.println(s1.size());
        System.out.println("should print thirdNode");
        System.out.println(s1.pop());
        System.out.println("should print 2");
        System.out.println(s1.size());
        System.out.println("should print secondNode");
        System.out.println(s1.peek());
        System.out.println("should print false");
        System.out.println(s1.isEmpty());
    }
}