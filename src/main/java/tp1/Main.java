package tp1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "A", "B", "C", "D", "E"));
        LinkedList<String> lettersClock = new LinkedList<>(Arrays.asList("A", "G", "E", "F", "B", "C", "H", "E", "B", "E", "H", "I", "G", "E", "F", "G", "E", "A", "G"));
        LinkedList<String> lettersLRU = new LinkedList<>(Arrays.asList("A", "G", "A", "C", "A", "C", "E", "B", "D", "D", "E", "F", "G", "E"));
        LinkedList<String> lettersFifo = new LinkedList<>(Arrays.asList("A", "F", "B", "F", "B", "F", "B", "E", "E", "F", "A", "B", "C","E", "A", "B", "A", "E", "D", "C"));

        Fifo fifo = new Fifo();
        fifo.start(lettersFifo, 3);
        System.out.println(fifo.getFifo());
        System.out.println(fifo.getPage_miss());

        LRU lru = new LRU();
        lru.start(lettersFifo, 3);
        System.out.println(lru.getLru());
        System.out.println(lru.getPage_miss());
        
        Clock clock = new Clock();
        clock.start(lettersFifo, 3);
        System.out.println(clock.getClock());
        System.out.println(clock.getPage_miss());
        

    }
}
