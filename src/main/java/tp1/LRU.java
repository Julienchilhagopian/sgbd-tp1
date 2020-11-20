package tp1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU {
    private LinkedHashMap<String, Integer> index = new LinkedHashMap<>();
    private LinkedList<String> lru = new LinkedList<>();
    private int page_miss = 0;

    public void start(LinkedList<String> pageSequence, int capacity) {
        int i = 1;
        for(String page : pageSequence) {
            if (lru.size() < capacity) {
                if(!lru.contains(page)){
                    lru.add(page);
                    page_miss++;
                }
                //maj du dernier utilié
                index.put(page, i);

            } else {
                // Virer le dernier utiliser
                // inserer page
                if (!lru.contains(page)) {
                    Integer lastPageIndex = Collections.min(index.values());
                    String lastUsedPage = "";
                    for (String p : index.keySet()) {
                        if (index.get(p).equals(lastPageIndex)) {
                            lastUsedPage = p;
                        }
                    }

                    lru.remove(lastUsedPage);
                    index.remove(lastUsedPage);
                    lru.add(page);
                    page_miss++;
                }
                //maj du dernier utilisé
                index.put(page, i);
            }
            i++;
        }


    }


    public LinkedList<String> getLru() {
        return lru;
    }

    public int getPage_miss() {
        return page_miss;
    }
}
