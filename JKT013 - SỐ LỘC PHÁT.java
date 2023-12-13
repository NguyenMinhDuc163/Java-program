import java.util.*;

public class Main {
    public static ArrayList<String> solve(){
        Queue<String> q = new ArrayDeque<>();
        ArrayList<String> res = new ArrayList<>();
        q.add("6"); q.add("8");
        while(true){
            String top = q.poll();
            if(top.length() == 15) break;
            res.add(top);
            q.add(top + "6");
            q.add(top + "8");
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = solve();
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            ArrayList<String> ans = new ArrayList<>();
            for(String x: res){
                if(x.length() <= n)
                    ans.add(x);
                else break;
            }
            Collections.reverse(ans);
            System.out.println(ans.size());
            for(String x: ans)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
