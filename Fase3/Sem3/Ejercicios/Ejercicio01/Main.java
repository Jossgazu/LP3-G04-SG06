import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        try {
            Goodies candy1 = new Goodies(1, "Chocolate", 2.5f);
            Goodies candy2 = new Goodies(2, "Gummy Bears", 1.8f);
            Goodies candy3 = new Goodies(3, "Lollipop", 1.0f);
            Goodies candy4 = new Goodies(4, "Caramel", 2.0f);
            Goodies candy5 = new Goodies(5, "Jelly Beans", 1.5f);

            CandyBags bag = new CandyBags(5);

            bag.add(candy1);
            bag.add(candy2);
            bag.add(candy3);
            bag.add(candy4);
            bag.add(candy5);

            System.out.println("Contenido de la bolsa:");
            System.out.println(bag);


            Goodies cheapest = bag.cheapest();
            System.out.println("Golosina más económica: " + cheapest);

            CandyBags mostExpensive = bag.mostExpensive(3);
            System.out.println("Las 3 golosinas más caras:");
            System.out.println(mostExpensive);

        } catch (IsFull e) {
            e.printStackTrace();
        } catch (IsEmpty e) {
            e.printStackTrace();
        }
    }
}