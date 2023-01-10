import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        num.add(num1);
        num.add(num2);
        num.add(num3);


        Set<Integer> set = new HashSet<>(num);
        num.clear();
        num.addAll(set);

        System.out.println(num);
    }
}
