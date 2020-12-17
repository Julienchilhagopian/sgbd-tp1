package tp1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // CLOCK gagne
       //LinkedList<String> data = new LinkedList<>(Arrays.asList("A", "G", "E", "F", "B", "C", "H", "E", "B", "E", "H", "I", "G", "E", "F", "G", "E", "A", "G"));

        // LRU gagne
        //LinkedList<String> data = new LinkedList<>(Arrays.asList("A", "G", "A", "C", "A", "C", "E", "B", "D", "D", "E", "F", "G", "E"));

        // FIFO gagne
        LinkedList<String> data = new LinkedList<>(Arrays.asList("A", "F", "B", "F", "B", "F", "B", "E", "E", "F", "A", "B", "C","E", "A", "B", "A", "E", "D", "C"));

        Fifo fifo = new Fifo();
        fifo.start(data, 3);
        System.out.println(fifo.getFifo());
        System.out.println("Page miss : " + fifo.getPage_miss());

        LRU lru = new LRU();
        lru.start(data, 3);
        System.out.println(lru.getLru());
        System.out.println("Page miss : " + lru.getPage_miss());
        
        Clock clock = new Clock();
        clock.start(data, 3);
        System.out.println(clock.getClock());
        System.out.println("Page miss : " + clock.getPage_miss());
    }
}
