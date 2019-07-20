package com;

public class IntegerTest {

    public static void main(String[] args) {
        Integer p1=new Integer(10);
        Integer p2=new Integer(10);
        int m1=10;
        int m2=10;

        System.out.println(p1==p2);//false
        System.out.println(p1.equals(p2));//true

        System.out.println(m1==m2);//true
        System.out.println(p1==m1);//true

        System.out.println("*****************");

        Integer p3=new Integer(191);
        Integer p4=new Integer(191);
        int m3=191;
        int m4=191;


        System.out.println(p3==p4);//false
        System.out.println(m3==m4);//true
        System.out.println(p3==m3);//true

        System.out.println("***********");


        Integer var1=15;
        Integer var2=15;
        System.out.println(var1==var2);//true


        /*对于 Integer var = ? 在-128 至 127 范围内的赋值，Integer 对象是在IntegerCache.cache 产生，会复用
已有对象，这个区间内的 Integer 值可以直接使用==进行判断，但是这个区间之外的所有数据，都会在堆上产
生，并不会复用已有对象，*/
        Integer var3=191;
        Integer var4=191;
        System.out.println(var3==var4);//false
        System.out.println(var3.equals(var4));//true


        System.out.println("***********");

        Integer num1 = new Integer(10) ;
        Integer num2 = 10;
        System.out.println(num1 == num2);//false
        System.out.println(num1 == new Integer(10));//false
        System.out.println(num1.equals(new Integer(10)));//true
    }
}
