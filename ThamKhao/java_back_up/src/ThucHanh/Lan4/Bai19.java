package ThucHanh.Lan4;

import java.io.*;
import java.util.*;

public class Bai19 {
    public static void main(String[] args) {
        Stack<Pair<Character, Integer>> st = new Stack<>();
        int len, max;
        Pair<Integer, Integer> tempIndex, maxIndex;
        Pair<Integer, Integer> [] info = new Pair[100000];
        for(int i = 0; i < 100000; i++){
            info[i] = new Pair<>(-1, 0);
        }
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String s = sc.next();
        len = s.length();
        max = 0;
        for(int i = 0; i < len; i++){
            if(!st.isEmpty()){
                if(((st.peek().first == '[') && (s.charAt(i) == ')')) || ((st.peek().first == '[') &&  (s.charAt(i) == ']'))){
                    tempIndex = new Pair<>(st.peek().second, i);
                    if((tempIndex.first  > 0) && ( info[tempIndex.first - 1].first != -1)){
                        info[i].second += info[tempIndex.first - 1].second;
                        tempIndex.first = info[tempIndex.first - 1].first;
                    }
                    if(info[i - 1].first != -1){
                        info[i].second += info[i - 1].second;
                    }
                    if(s.charAt(i) == ']')
                        info[i].setSecond(info[i].second + 1);
                    if(max < info[i].second){
                        max = info[i].second;
                        maxIndex = new Pair<>(tempIndex.first, tempIndex.second);
                    }
                    info[i].first = tempIndex.first;
                    st.pop();
                }
                else st.push(new Pair<>(s.charAt(i), i));
            }
            else st.push(new Pair<>(s.charAt(i),i));
        }
        System.out.println(max);
        if(max == 0) System.out.println("");
    }

    public static class Pair<A, B>{
        A first;
        B second;

        public void setFirst(A first) {
            this.first = first;
        }

        public void setSecond(B second) {
            this.second = second;
        }

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
}
