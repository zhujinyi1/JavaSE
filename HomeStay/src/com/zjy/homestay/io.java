package com.zjy.homestay;

import java.util.Scanner;

public class io {

    public static void Printf(int a){
        System.out.println(a);
    }
    public static void Printf(){
        System.out.println();
    }
    public static void Printf(double a){
        System.out.println(a);
    }
    public static void Printf(float a){
        System.out.println(a);
    }
    public static void Printf(char a){
        System.out.println(a);
    }
    public static void Printf(String a){
        System.out.println(a);
    }
    public static void Printf(byte a){
        System.out.println(a);
    }
    public static void Printf(long a){
        System.out.println(a);
    }
    public static void Printf(short a){
        System.out.println(a);
    }

    public static int ScanfInt(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }
    public static byte ScanfByte(){
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        return a;
    }
    public static short ScanfShort(){
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        return a;
    }
    public static long ScanfLong(){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        return a;
    }
    public static float ScanfFloat(){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        return a;
    }
    public static boolean ScanfBoolean(){
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        return a;
    }
    public static double ScanfDouble(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        return a;
    }
    public static String ScanfString(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        return a;
    }
    public static char ScanfChar(){
        Scanner sc = new Scanner(System.in);
        char b;
        String c = null;
        String a = sc.next();
        if(a.length()!=1){
            System.arraycopy(a,0,c,0,1);
            b = c.charAt(0);
        }else {
            b = a.charAt(0);
        }
        return b;
    }



}
