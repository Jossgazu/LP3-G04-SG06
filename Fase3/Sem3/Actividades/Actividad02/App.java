public class App {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> p = new OrderedPair<Integer,Integer>(1,2);
        OrderedPair<Integer, String> p2 = new OrderedPair<Integer,String>(1,"two");
        Persona persona =  new Persona("Fabricio", "Gonzales", "20");
        OrderedPair<String, Persona> p3 = new OrderedPair<String,Persona>("Juan", persona); 


        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
