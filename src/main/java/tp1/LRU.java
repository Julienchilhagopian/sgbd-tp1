package tp1;

import java.util.LinkedList;

public class LRU {
    private LinkedList<String> index = new LinkedList<>();
    private LinkedList<String> lru = new LinkedList<>();
    private int page_miss = 0;

    public void start(LinkedList<String> pageSequence, int capacity) {


        
    }


    public LinkedList<String> getLru() {
        return lru;
    }

    public int getPage_miss() {
        return page_miss;
    }
}
