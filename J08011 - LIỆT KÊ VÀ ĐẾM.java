import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static boolean isReverse(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(isReverse(s)){
                if(count.containsKey(s))
                    count.put(s, count.getOrDefault(s, 0) + 1);
                else count.put(s, 1);
            }
        }
        List<Map.Entry<String, Integer>> mp = new ArrayList<>(count.entrySet());
        mp.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        mp.forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

}
