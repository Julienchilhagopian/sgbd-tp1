package tp1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "A", "B", "C", "D", "E"));

        Fifo fifo = new Fifo();
        fifo.start(letters, 4);

        System.out.println(fifo.getFifo());
        System.out.println(fifo.getPage_miss());

        LRU lru = new LRU();
        lru.start(letters, 4);
        System.out.println(lru.getLru());
        System.out.println(lru.getPage_miss());

    }
}
