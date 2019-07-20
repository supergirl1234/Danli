package com;


class Friend{
    public void print(){

        System.out.println("我是Friend");
    }

}
public class Review2 extends Friend{
    public void print(){

        System.out.println("我是Review2");
    }
    public static void main(String[] args) {
        Friend p1=new Friend();
        p1.print();//我是Friend

        Review2 p2= new Review2();
        p2.print();//我是Review2

        Friend p3=new Review2();
        p3.print();//我是Review2

    }
}
