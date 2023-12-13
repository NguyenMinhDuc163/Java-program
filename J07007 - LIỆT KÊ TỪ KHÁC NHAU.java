import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;
 class WordSet{
    private static  TreeSet<String> se = new TreeSet<>();
    private String fileName;

    public WordSet(String fileName) {
        this.fileName = fileName;
    }
    public void solve() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            String s = sc.next();
            s = s.toLowerCase();
            se.add(s);
        }
    }
    public String toString(){
        String s = "";
        try {
            solve();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(String x: se){
            s += x + "\n";
        }
        return s;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main6662654(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
