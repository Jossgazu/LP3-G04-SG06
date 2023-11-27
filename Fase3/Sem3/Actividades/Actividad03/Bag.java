import java.util.ArrayList;
import java.util.List;

public class Bag <T> {
    private T [] list;
    private int count; //Contador de objetos que hay en la bolsa

    public Bag(int n){
        this.list = (T[])new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull{
        if(count >= list.length) {
            throw new IsFull();
        }
        list[count++] = obj;
    }

    public List<T> getObjects() throws IsEmpty {
        if(count == 0) {
            throw new IsEmpty();
        }
        List<T> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public T remove(T obj) throws ObjectNoExist{
        for(int i = 0; i < count; i++) {
            if(list[i].equals(obj)) {
                T removedObj = list[i];
                System.arraycopy(list, i + 1, list, i, count - i - 1);
                count--;
                return removedObj;
            }
        }
        throw new ObjectNoExist();
    }

    public int getIxdex(T obj){
        for(int i = 0; i < count; i++) {
            if(list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append(list[i].toString());
            if(i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}