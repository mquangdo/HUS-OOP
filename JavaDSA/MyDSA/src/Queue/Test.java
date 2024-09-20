package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        System.out.println(queue);

    }
}
