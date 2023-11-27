import java.util.Arrays;
public class Bag <T> {
    private T [] list;
    private int count;
    private int capacity;
    public Bag(int n) {
        this.capacity = n;
        this.list = (T[]) new Object [n];
        this.count = 0;
    }
    public void add (T obj) throws IsFull {
        if (count >= capacity) {
            throw new IsFull();
        }
        list[count] = obj;
        count++;
    }
    public T[] getObjects() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty();
        }
        return Arrays.copyOf(list, count);
    }
    public T remove (T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index == -1) {
            throw new ObjectNoExist();
        }
        T removedObject = list[index];
        System.arraycopy(list, index + 1, list, index, count - index - 1);
        count--;
        return removedObject;
    }
    public int getIndex (T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i] != null && list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Contenido de la bolsa:\n");
        for (int i = 0; i < count; i++) {
            result.append(list[i]).append("\n");
        }
        return result.toString();
    }
}
