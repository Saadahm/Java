package Memento;

import java.util.HashMap;
import java.util.Map;

public class DatabaseMemento {
    Map<String,String> data;
    public DatabaseMemento(Map<String, String> dbData) {
        this.data = new HashMap<>(dbData);
    }

    public Map<String, String> getState() {
        return data;
    }
}
