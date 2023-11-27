import java.util.Arrays;
import java.util.Comparator;
public class CandyBags extends Bag<Goodies> {
    public CandyBags(int n) {
        super(n);
    }
    public CandyBags(int n, int capacity) {
        super(capacity);
        for (int i = 0; i < n; i++) {
            try {
                add(null);
            } catch (IsFull isFull) {
                isFull.printStackTrace();
            }
        }
    }
    @Override
    public void add(Goodies obj) throws IsFull {
        if (obj == null) {
            throw new IllegalArgumentException("Objecto nulo");
        }
        if (getIndex(obj) == -1) {
            super.add(obj);
        }
    }
    public Goodies[] getGoodiesObjects() throws IsEmpty {
        Object[] objects = getObjects();
        Goodies[] goodiesArray = new Goodies[objects.length];
    
        for (int i = 0; i < objects.length; i++) {
            goodiesArray[i] = (Goodies) objects[i];
        }
    
        return goodiesArray;
    }
    public Goodies cheapest() throws IsEmpty {
        Goodies[] goodiesArray = getGoodiesObjects();
        
        if (goodiesArray.length > 0) {
            Goodies cheapestGoodie = goodiesArray[0];
            for (Goodies g : goodiesArray) {
                if (g.getPrice() < cheapestGoodie.getPrice()) {
                    cheapestGoodie = g;
                }
            }
            return cheapestGoodie;
        } else {
            throw new IsEmpty();
        }
    }
    public CandyBags mostExpensive(int n) throws IsEmpty {
        Goodies[] goodiesArray = getGoodiesObjects();
        if (goodiesArray.length < n) {
            throw new IsEmpty();
        }
        Arrays.sort(goodiesArray, Comparator.comparingDouble(Goodies::getPrice).reversed());
        CandyBags expensiveBag = new CandyBags(n);
        for (int i = 0; i < n; i++) {
            try {
                expensiveBag.add(goodiesArray[i]);
            } catch (IsFull isFull) {
                isFull.printStackTrace();
            }
        }
        return expensiveBag;
    }
}