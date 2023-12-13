import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

 class WordSet {
    private TreeSet<String> se;

    public WordSet(String s) {
        this.se = new TreeSet<>(Arrays.asList(s.toLowerCase().split("\\s+")));
    }

    public WordSet(TreeSet<String> a) {
        this.se = a;
    }
    public WordSet union(WordSet p){
        TreeSet<String> a = (TreeSet<String>) se.clone();
        a.addAll(p.se);
        return new WordSet(a);
    }
    public WordSet intersection(WordSet p){
        TreeSet<String> a = new TreeSet<>();
        for(String i: se){
            for(String j : p.se){
                if(i.contentEquals(j))
                    a.add(i);
                if(i.compareTo(j) < 0) break;
            }
        }
        return new WordSet(a);
    }
    public String toString(){
        return String.join(" ", se);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main3033937(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
