package Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("H");
        queue.add("G");
        queue.add("F");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
