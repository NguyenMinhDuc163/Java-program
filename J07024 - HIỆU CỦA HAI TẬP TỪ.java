package codeptit;
import java.io.*;
import java.util.*;
class WordSet{
    private Scanner sc;
    private TreeSet<String> se;

    public WordSet(String file) throws IOException {
        sc = new Scanner(new File(file));
        se = new TreeSet<>();
        while(sc.hasNextLine()){
            String []s = sc.nextLine().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(s));
        }
    }

    public TreeSet<String> getSe() {
        return se;
    }
    public String difference(WordSet wordSet){
        TreeSet<String> newSet = new TreeSet<>(wordSet.getSe());
        String res = "";
        for(String x: se){
            if(!newSet.contains(x))
                res += x + " ";
        }
        return res.trim();
    }
}
public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
    public static void main4808121(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

