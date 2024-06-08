//package codeptit;
//import java.io.*;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.stream.Collectors;
//
// class WordSet {
//    Set<String> se= new TreeSet<>();
//    private String fileName;
//
//    public WordSet(String fileName) {
//        this.fileName = fileName;
//    }
//    public void solve() throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("VANBAN.in"));
//        while(sc.hasNext()){
//            se.add(sc.next().toLowerCase());
//        }
//    }
//
//    @Override
//    public String toString() {
//        try {
//            solve();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return se.stream().map(Object::toString).collect(Collectors.joining("\n"));
//    }
//}
//
//public class J07007 {
//    public static void main(String[] args) throws IOException {
//        WordSet ws = new WordSet("VANBAN.in");
//        System.out.println(ws);
//    }
//}
