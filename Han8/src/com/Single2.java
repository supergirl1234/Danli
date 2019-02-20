package com;

/**
 * Author:Fanleilei
 * Created:2019/2/20 0020
 */

//懒汉式单例
    //延迟实例化，线程不安全（多线程），不使用对象时可以节省内存空间
public class Single2 {


    private static  Single2 instance2;

    private Single2() {//构造方法私有
    }

    public static Single2 getGetInstance() {

        if(instance2==null){//对象还没有实例化
           instance2=new Single2();

        }
        return instance2;
    }
    public void print(){

        System.out.println("haiaii");
    }


    public static void main(String[] args) {

        Single2 single2=null;
        single2=Single2.getGetInstance();
        System.out.println(single2);
        single2.print();

    }
}
