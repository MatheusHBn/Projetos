package ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafe {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add (String name){
        names.add(name);
    }
    public synchronized void removeFirst(){
        if (names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    /*
    ThreadSafe são classes que tem Threads synchronized, mas mesmo elas sendo synchronized, você tem que tomar cuidado
    com o que vai acontecer, pois os metodos que você criar não são ThreadSafe por exemplo, então sempre olhe os metodos
    e sincronize todos
     */
    static void main() {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.add("Matheuszin");
        Runnable r = threadSafe::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }

}
