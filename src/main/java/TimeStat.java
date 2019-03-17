import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimeStat {
    private Map<String,Time> timeMap;

    public TimeStat() {
        timeMap = new HashMap<String, Time>();
    }

    public TimeStat(String name) {
        timeMap = new HashMap<String, Time>();
        timeMap.put(name,new Time(System.currentTimeMillis()));
    }

    public Time end(String name) {
        long t2 = System.currentTimeMillis();
        Time time = timeMap.get(name);
        if (time != null) {
            time.setTime(t2 - time.getTime());
        }
        return time;
    }

    public void ends() {
        long t2 = System.currentTimeMillis();
        for (Time time : timeMap.values()) {
            time.setTime(t2 - time.getTime());
        }
    }

    public void create(String name) {
        timeMap.put(name,new Time(System.currentTimeMillis()));
    }

    public Time get(String name) {
        return timeMap.get(name);
    }

    public Set<String> getNames() {
        return timeMap.keySet();
    }
}
