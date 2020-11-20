package tp1;

import java.util.LinkedList;

public class Clock {
    private LinkedList<String> clock = new LinkedList<>();
    private LinkedList<String> secondChance = new LinkedList<>();
    private int page_miss = 0;
    private int pointer = 0;
    
    public void start(LinkedList<String> pageSequence, int capacity) {
    	for (int i = 0; i < capacity; i++) {
    		secondChance.add("0");
		}
    	boolean changePage;
    	for(String page : pageSequence) {
    		changePage = false;
            if (clock.size() < capacity) {
                if (!clock.contains(page)){
                	clock.add(page);
                    page_miss++;
                    pointer++;
                    if (pointer == capacity)
                    	pointer -= capacity;
                } else {
                	secondChance.set(clock.indexOf(page), "1");
                }
            } else {
            	while (changePage == false) {
            		if (!clock.contains(page)){
                    	if (secondChance.get(pointer) == "1") {
                    		secondChance.set(pointer, "0");
                    		pointer++;
                            if (pointer == capacity)
                            	pointer -= capacity;
                    	}
                    	else {
                    		clock.set(pointer, page);
                    		page_miss++;
                            pointer++;
                            if (pointer == capacity)
                            	pointer -= capacity;
                            changePage = true;
                    	}          
                    } else {
                    	secondChance.set(clock.indexOf(page), "1");
                    }
            	}
            	
            }
        }
    }

	public LinkedList<String> getClock() {
		return clock;
	}

	public int getPage_miss() {
		return page_miss;
	}
}
