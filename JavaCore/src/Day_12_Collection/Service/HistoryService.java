package Day_12_Collection.Service;

import java.util.LinkedList;

public class HistoryService {
    LinkedList<String> history = new LinkedList<>();

    public void log(String message){
        history.add(message);
    }
    public void showHistory(){
        for(String h : history){
            System.out.println(h);
        }
    }
}
