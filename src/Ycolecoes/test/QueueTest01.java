package Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    /*
    Queue, é uma estrutura que segue a regra FIFO (First In, First Out), que é: "o primeiro que entra, é o primeiro que sai"
    As implementações mais comuns são a LinkedList e PriorityQueue
     */
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
