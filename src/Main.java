import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> toys = new HashMap<>();

        toys.put("1", "Машинка");
        toys.put("2", "Автомат");
        toys.put("3", "Фигурка");
        System.out.println(toys);

        System.out.println();

        Main.entrySet(toys);
        System.out.println();
        Main.getKey(toys);
        System.out.println();
        Main.getValue(toys);
    }


    public static void entrySet(HashMap<String, String> toys) {
        for(Map.Entry<String, String> t : toys.entrySet()) {
            System.out.println(t);
        }
    }

    public static void getKey(HashMap<String, String> toys) {
        for(Map.Entry<String, String> key : toys.entrySet()) {
            System.out.println(key.getKey());
        }
    }

    public static void getValue(HashMap<String, String> toys) {
        for(Map.Entry<String, String> value : toys.entrySet()) {
            System.out.println(value.getValue());
        }
    }
}
