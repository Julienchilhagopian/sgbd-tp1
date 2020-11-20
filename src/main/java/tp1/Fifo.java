package tp1;

import java.util.LinkedList;

public class Fifo {
    private LinkedList<String> index = new LinkedList<>();
    private LinkedList<String> fifo = new LinkedList<>();
    private int page_miss = 0;


    public void start(LinkedList<String> pageSequence, int capacity) {
        for(String page : pageSequence) {
            if (fifo.size() < capacity) {
                if (!fifo.contains(page)){
                    fifo.add(page);
                    page_miss++;
                    index.add(page);
                }
            } else {
                if (!fifo.contains(page)) {
                    String val = index.get(0);
                    index.removeFirst();

                    fifo.remove(val);
                    fifo.add(page);
                    index.add(page);
                    page_miss++;
                }
            }

        }

    }

    public int getPage_miss() {
        return page_miss;
    }

    public LinkedList<String> getFifo() {
        return fifo;
    }
}
