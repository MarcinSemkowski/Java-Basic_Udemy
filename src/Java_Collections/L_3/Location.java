package Java_Collections.L_3;

import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exists ;

    public Location(int locationId, String description, Map<String,Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        if (exits != null) {
            this.exists = new HashMap<>(exits);
        }else {
            this.exists = new HashMap<>();
        }
        this.exists.put("Q", 0);
    }

    public void addExit(String direction,int location){
        exists.put(direction,location);

    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExist() {
        return  new HashMap<>(exists);
    }


}
