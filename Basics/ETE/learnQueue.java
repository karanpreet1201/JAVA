import java.util.LinkedList;
import java.util.Queue;

public class learnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.offer(60);

        while (!q.isEmpty())
        {
            System.out.println(q.poll());
        }
        // for (int i = 0 ; i < q.poll() ; i++)
        // {
        //     System.out.println(q);
        // }

        System.out.println(q);

        // delete 

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.peek());


    }
}
