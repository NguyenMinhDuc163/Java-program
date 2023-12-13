package codeptit;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class WordSet{
    private Scanner sc;
    private TreeSet<String> se;

    WordSet(String file) throws IOException {
        se = new TreeSet<>();
        this.sc = new Scanner(new File(file));
        while(sc.hasNextLine()){
            String []s = sc.nextLine().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(s));
        }
    }

    public TreeSet<String> getSet() {
        return se;
    }

    public String union(WordSet wordSet){
        TreeSet<String> set = new TreeSet<>(wordSet.getSet());
        set.addAll(se);
        return String.join(" ", set);
    }

    public String intersection(WordSet wordSet){
        TreeSet<String> set = new TreeSet<>(wordSet.getSet());
        TreeSet<String> intersections = new TreeSet<>(set);
        intersections.retainAll(se);
        return String.join(" ", intersections);
    }
}
public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main4520257(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

