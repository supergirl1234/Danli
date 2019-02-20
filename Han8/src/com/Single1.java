package com;

/**
 * Author:Fanleilei
 * Created:2019/2/20 0020
 */

//单例模式
    //饿汉式单例
    //1.一个类只允许实例化一个对象
    //2.立即初始化-》饿汉式单例-》立即加载、线程安全，内存可能会浪费
public class Single1 {

    //在Singleton没有实例化对象产生
    //的时候，也可以将instance进行使用。此时，联想到使用static关键字。
    private static final Single1 instance=new Single1();

    private Single1() {//构造方法是私有的

    }
    public static  Single1 getInstance(){

        return  instance;
    }

    public void print(){

        System.out.println("我被建立了");
    }

    public static void main(String[] args) {
        Single1 single1=null;
        single1=Single1.getInstance();
        System.out.println(single1);
        single1.print();

    }
}
