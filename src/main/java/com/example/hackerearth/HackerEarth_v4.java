package com.example.hackerearth;

public class HackerEarth_v4 {
    int a; int b=9;
    boolean var1, var2;
    public int sum() {
        return a+b;
    }
    private int add(){
        return a+b;
    }
    int result(){
        return new HackerEarth_v4().add();
    }

    public static void main(String[] args) {
        HackerEarth_v4 h = new HackerEarth_v4();
        System.out.println(h.sum()+h.result()+h.add());
    }
}
