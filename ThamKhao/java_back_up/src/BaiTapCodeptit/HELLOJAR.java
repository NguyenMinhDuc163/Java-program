//HELLOJAR/control/PaymentController.java
//package control;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import vn.edu.ptit.Invoice;
//import vn.edu.ptit.Rule;
//import vn.edu.ptit.Student;
//import vn.edu.ptit.Subject;
//
//public class PaymentController
//{
//    private Invoice invoice;
//    private Rule rule;
//    private Student student;
//    private Subject subject;
//
//    public PaymentController()
//    {
//        Scanner sc = new Scanner(System.in);
//        String maSV = sc.nextLine();
//        String tenSV = sc.nextLine();
//        int soMonHoc = Integer.parseInt(sc.nextLine());
//        String maMonHoc;
//        String tenMonHoc;
//        int soTinChi;
//        student = new Student(maSV, tenSV);
//        double sum = 0;
//        ArrayList<Subject> arrayList = new ArrayList<>();
//        while (soMonHoc-- > 0)
//        {
//            maMonHoc = sc.nextLine();
//            tenMonHoc = sc.nextLine();
//            soTinChi = Integer.parseInt(sc.nextLine());
//            arrayList.add(new Subject(tenMonHoc, maMonHoc, soTinChi));
//        }
//        String soQD = sc.nextLine();
//        String tenQD = sc.nextLine();
//        double donGia = Double.parseDouble(sc.nextLine());
//        for (Subject i : arrayList)
//            sum += donGia * i.getCredit();
//        rule = new Rule(soQD, tenQD, sum);
//        invoice = new Invoice(rule);
//        invoice.setAlSubject(arrayList);
//        invoice.setAmount(sum);
//        invoice.setSt(student);
//    }
//
//    public Invoice getInvoice()
//    {
//        return invoice;
//    }
//}
//
//HELLOJAR/Main.java
//package HELLOJAR;
//
//import control.PaymentController;
//import view.InvoiceView;
//import vn.edu.ptit.Invoice;
//
//public class Main
//{
//    public static void main(String[] args) {
//        PaymentController pc = new PaymentController();
//        //Output for codeptit.J07028.TEST.test
//        Invoice invoice = pc.getInvoice();
//        InvoiceView.show(invoice);
//    }
//    public static void main1269120(String[] args)
//    {
//        PaymentController pc = new PaymentController();
//        Invoice invoice = pc.getInvoice();
//        InvoiceView.show(invoice);
//    }
//}
///*
//B20DCCN001
//Nguyễn Văn A
//2
//INT1155
//Tin học cơ sở 2
//2
//INT1332
//Lập trình hướng đối tượng
//3
//QD123
//QD123 HP
//550000
//*/
//
//HELLOJAR/view/InvoiceView.java
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package view;
//
//import vn.edu.ptit.Invoice;
//import vn.edu.ptit.Subject;
//
///**
// *
// * @author TienNV
// */
//public class InvoiceView {
//
//    public static void show(Invoice invoice) {
//        System.out.println("Mã sinh viên: " + invoice.getSt().getCode());
//        System.out.println("Họ tên: " + invoice.getSt().getName());
//        System.out.println("Các môn học:");
//        for (Subject subject : invoice.getAlSubject()) {
//            System.out.println(subject.getName());
//        }
//        System.out.println("Học phí phải nộp là: " + invoice.getAmount());
//        System.out.println("Theo QĐ: " + invoice.getRule().getCode());
//    }
//    
//}
//
//
//HELLOJAR/vn/edu/ptit/Invoice.java
////
//
//package vn.edu.ptit;
//
//import java.util.ArrayList;
//
//public class Invoice {
//    private int id;
//    private Rule rule;
//    private Student st;
//    private ArrayList<Subject> alSubject;
//    private double amount;
//
//    public Invoice(Rule rule) {
//        this.rule = rule;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Rule getRule() {
//        return this.rule;
//    }
//
//    public void setRule(Rule rule) {
//        this.rule = rule;
//    }
//
//    public Student getSt() {
//        return this.st;
//    }
//
//    public void setSt(Student st) {
//        this.st = st;
//    }
//
//    public ArrayList<Subject> getAlSubject() {
//        return this.alSubject;
//    }
//
//    public void setAlSubject(ArrayList<Subject> alSubject) {
//        this.alSubject = alSubject;
//    }
//
//    public double getAmount() {
//        return this.amount;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//}
//
//
//HELLOJAR/vn/edu/ptit/Rule.java
////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package vn.edu.ptit;
//
//public class Rule {
//    private String code;
//    private String name;
//    private double creditPrice;
//
//    public Rule(String code, String name, double creditPrice) {
//        this.code = code;
//        this.name = name;
//        this.creditPrice = creditPrice;
//    }
//
//    public Rule() {
//    }
//
//    public String getCode() {
//        return this.code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getCreditPrice() {
//        return this.creditPrice;
//    }
//
//    public void setCreditPrice(double creditPrice) {
//        this.creditPrice = creditPrice;
//    }
//}
//
//
//HELLOJAR/vn/edu/ptit/Student.java
////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package vn.edu.ptit;
//
//public class Student {
//    private String code;
//    private String name;
//
//    public Student() {
//    }
//
//    public Student(String code, String name) {
//        this.code = code;
//        this.name = name;
//    }
//
//    public String getCode() {
//        return this.code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//
//HELLOJAR/vn/edu/ptit/Subject.java
////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package vn.edu.ptit;
//
//public class Subject {
//    private String name;
//    private String code;
//    private int credit;
//
//    public Subject() {
//    }
//
//    public Subject(String name, String code, int credit) {
//        this.name = name;
//        this.code = code;
//        this.credit = credit;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCode() {
//        return this.code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public int getCredit() {
//        return this.credit;
//    }
//
//    public void setCredit(int credit) {
//        this.credit = credit;
//    }
//
//    public String toString() {
//        return "Subject{name=" + this.name + ", code=" + this.code + ", credit=" + this.credit + '}';
//    }
//}
//
//
