import java.util.ArrayList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {
    private int casheSize;
    private List<Event> cashe;

    public CacheFileEventLogger(String filename) {
        super(filename);
    }

    public CacheFileEventLogger(String filename, int casheSize) {
        super(filename);
        this.casheSize = casheSize;
        this.cashe = new ArrayList<Event>(casheSize);
    }

    @Override
    public void logEvent(Event event) {
        cashe.add(event);
        if (cashe.size() == casheSize) {
            writeEventsFromCache();
            cashe.clear();
        }
    }

    public void destroy() {
        if (!cashe.isEmpty()) {
            writeEventsFromCache();
        }
    }

    private void writeEventsFromCache() {
        for (Event event : cashe) {
            super.logEvent(event);
        }
    }

    public int getCasheSize() {
        return casheSize;
    }

    public void setCasheSize(int casheSize) {
        this.casheSize = casheSize;
    }

    public List<Event> getCashe() {
        return cashe;
    }

    public void setCashe(List<Event> cashe) {
        this.cashe = cashe;
    }
}
