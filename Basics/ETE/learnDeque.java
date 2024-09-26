import java.util.ArrayDeque;
import java.util.Deque;

public class learnDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // We using Stack 

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());




        dq.offer(10);
        // dq.addLast(20);
        // dq.addFirst(30);

        // System.out.println(dq);

        // System.out.println(dq.poll());
        // System.out.println(dq.pollLast());
        

    }
}
