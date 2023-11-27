import java.util.List;

public class App {
    public static void main(String[] args) {
        Bag<String> frutas = new Bag<String>(10);
        try {
            frutas.add("manzana");
            frutas.add("platano");
            frutas.add("palta");
            frutas.add("sandia");
            frutas.add("papaya");
            frutas.add("uva");
            frutas.add("coco");
            
            frutas.remove("uva");
          
            List<String> objects = frutas.getObjects();
            for (String object : objects) {
                System.out.println(object);
            }
            
            System.out.println(frutas.getIxdex("palta"));
            
            System.out.println(frutas.toString());
        } catch (IsFull e) {
            e.printStackTrace();
        } catch (IsEmpty e) {
            e.printStackTrace();
        } catch (ObjectNoExist e) {
            e.printStackTrace();
        }


    }
}