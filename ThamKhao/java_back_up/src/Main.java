//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.ArrayList;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author pc dellllllllllllll
// */
//public class Main {
//    public static boolean prime(Integer n){
//        if(n<2)return false;
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0)return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
////        ObjectInputStream is1=new ObjectInputStream(new FileInputStream("C:\\Users\\pc dellllllllllllll\\Desktop\\B21DCCN118_NguyenThiToi\\test1.txt"));
////        ObjectInputStream is2=new ObjectInputStream (new FileInputStream("C:\\Users\\pc dellllllllllllll\\Desktop\\B21DCCN118_NguyenThiToi\\test2.txt"));
////        ArrayList<Integer> a=(ArrayList<Integer>)is1.readObject();
////        ArrayList<Integer> b=(ArrayList<Integer>)is2.readObject();
////
//        Scanner sc=new Scanner(new File("C:\\Users\\pc dellllllllllllll\\Desktop\\B21DCCN118_NguyenThiToi\\test1.txt"));
//        ArrayList<Integer> a=new ArrayList<>();
//        while(sc.hasNext()){
//            Integer ai=sc.nextInt();
//            a.add(ai);
//        }
//        sc=new Scanner(new File("C:\\Users\\pc dellllllllllllll\\Desktop\\B21DCCN118_NguyenThiToi\\test2.txt"));
//        ArrayList<Integer> b=new ArrayList<>();
//        while(sc.hasNext()){
//            Integer bi=sc.nextInt();
//            b.add(bi);
//        }
//        TreeMap<Integer,Integer> mp=new TreeMap<Integer,Integer>();
//        for(Integer x:a){
//            if(prime(x)&&x<500000){
//                int j=1000000-x;
//                int k=b.indexOf(j);
//                if(k!=-1 && prime(j)){
//                    mp.put(x, j);
//                }
//            }
//
//        }
//        for(Map.Entry<Integer,Integer> x:mp.entrySet()){
//            System.out.println(x.getKey()+" "+x.getValue());
//        }
//
//    }
//
//
//}