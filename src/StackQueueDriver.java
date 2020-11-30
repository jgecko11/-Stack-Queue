public class StackQueueDriver {
    public static void main(String[] args) {
        StackQueue tester = new StackQueue();

        tester.push("hi");
        tester.push("hello");
        tester.push("bye");

        System.out.println(tester.peekQueue());
        System.out.println(tester.popQueue());
        System.out.println(tester.peekQueue());

    }
}
