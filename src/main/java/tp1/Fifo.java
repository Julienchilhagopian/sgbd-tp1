package tp1;

import java.util.LinkedList;

public class Fifo {



    public void FIFO(LinkedList<String> pageSequence, int capacity) {
        LinkedList index = new LinkedList();
        LinkedList fifo = new LinkedList<String>();


        int page_miss = 0;

        for(String page : pageSequence) {
            if (fifo.size() < capacity) {
                if(!fifo.contains(page)){
                    
                }
            }
        }



    }
}
