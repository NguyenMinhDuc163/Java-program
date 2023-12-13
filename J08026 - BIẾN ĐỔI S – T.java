import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            HashSet<Integer> se = new HashSet<>();
            int s = sc.nextInt(), t = sc.nextInt();
            se.add(s);
            Queue<AbstractMap.SimpleEntry<Integer, Integer>> q = new ArrayDeque<>();
            q.add(new AbstractMap.SimpleEntry<>(s, 0));
            while(true){
                AbstractMap.SimpleEntry<Integer, Integer> top = q.remove();
                if(top.getKey() == t){
                    System.out.println(top.getValue());
                    break;
                }
                if(top.getKey() > 1 && !se.contains(top.getKey() - 1)){
                    q.add(new AbstractMap.SimpleEntry<>(top.getKey() - 1, top.getValue() + 1));
                    se.add(top.getKey() - 1);
                }
                if(top.getKey() < t && !se.contains(top.getKey() * 2)){
                    q.add(new AbstractMap.SimpleEntry<>(top.getKey() * 2, top.getValue() + 1));
                    se.add(top.getKey() * 2);
                }
            }

        }
    }
}
