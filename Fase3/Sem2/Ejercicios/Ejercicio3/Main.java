package ejercicio03l10f3;
public class Main {
    public static <T> boolean isEqualTo(T obj1, T obj2) {
        return obj1.equals(obj2);
    }
    public static void main(String[] args) {
        Integer int1 = 3;
        Integer int2 = 3;
        System.out.println("Integer igual: "  + isEqualTo(int1, int2));
        Double double1 = 3.33;
        Double double2 = 3.33;
        System.out.println("Double igual: " + isEqualTo(double1, double2));
        String str1 = "a";
        String str2 = "a";
        System.out.println("String igual: " + isEqualTo(str1, str2));
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Object igual: " + isEqualTo(obj1, obj2));
    }
}