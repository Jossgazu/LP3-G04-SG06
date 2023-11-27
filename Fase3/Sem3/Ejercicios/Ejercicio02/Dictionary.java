import java.util.ArrayList;
public class Dictionary {
    private ArrayList<KeyValuePair> pairs;

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    public void add(Object key, Object value) {
        KeyValuePair newPair = new KeyValuePair(key, value);
        pairs.add(newPair);
    }

    public boolean delete(Object key) {
        for (KeyValuePair pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public Object getValue(Object key) throws ObjectNoExistException {
        for (KeyValuePair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExistException("Key does not exist in dictionary.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (KeyValuePair pair : pairs) {
            result.append(pair.toString()).append("\n");
        }
        return result.toString();
    }
}