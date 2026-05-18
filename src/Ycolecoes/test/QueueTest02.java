package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Perifericos;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    static void main() {
        Queue<Perifericos> perifericos = new PriorityQueue<>(new PerifericoComparador().reversed());
        perifericos.add(new Perifericos( 3L,"Mouse", 1500));
        perifericos.add(new Perifericos( 4L,"Teclado", 123.5));
        perifericos.add(new Perifericos( 59L,"Controle", 687.5));
        perifericos.add(new Perifericos( 12L,"MousePad", 100.5));
        perifericos.add(new Perifericos( 98L,"Headset", 485.5));
        perifericos.add(new Perifericos( 45L,"Microfone", 687.5));

        while (!perifericos.isEmpty()){
            System.out.println(perifericos.poll());
        }
    }
}
