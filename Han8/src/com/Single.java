package com;

/**
 * Author:Fanleilei
 * Created:2019/2/20 0020
 */
public class Single{
    // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
    static Single instance = new Single() ;
    private Single() { // private声明构造
    }
    public void print() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Single singleton = null ; // 声明对象
        singleton = Single.instance ;
        singleton.print();
    }
}