import java.util.List;

public class App {
    public static void main(String[] args) {
        Bag<Goodies> goodie = new Bag<>(5);

        Goodies goodies = new Goodies(1, "Goodie", 1.5f);
        Chocolates chocolates = new Chocolates(2, "Chocolates", 2.5f);
        Biscuits biscuits = new Biscuits(3, "Biscuits", 3.5f);
        Sweet sweet = new Sweet(4, "Sweet", 4.5f);
        Soda soda = new Soda(5, "Soda", 5.5f);        
        try {
            goodie.add(goodies);
            goodie.add(chocolates);
            goodie.add(biscuits);
            goodie.add(sweet);
            goodie.add(soda);
            
            List<Goodies> godies =  goodie.getObjects();
            for (Goodies godie : godies) {
                System.out.println(godie);
            }

            System.out.println(goodie.remove(goodies));

            godies.remove(1);

            System.out.println("======================================================");
            for (Goodies godie : godies) {
                System.out.println(godie);
            }

        } catch (IsFull e) {
            e.printStackTrace();
        } catch (IsEmpty e) {
            e.printStackTrace();
        } catch (ObjectNoExist e) {
            e.printStackTrace();
        }

    }
}



