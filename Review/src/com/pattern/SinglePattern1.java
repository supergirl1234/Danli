package com.pattern;

/*
*单例模式的作用就是确保一个类只有一个实例存在，可以节省内存单元；
* 单例模式分为饿汉式和懒汉式
* 饿汉式：1.一个类只允许实例化一个对象
*         2.立即初始化
* */
public class SinglePattern1 {

    /*在类的开始就将对象实例化出来*/

    private static final SinglePattern1 SingleObject=new SinglePattern1();

    /*单例模式的构造方法是私有的，这样的其他处的代码就无法通过调用该类的构造方法来实例化该类的对象，只有通过该类提供的静态方法来得到该类的唯一实例；*/
    private SinglePattern1() {

    }
    /*获取实例化对象*/
    public static SinglePattern1 getSingleObject(){
        return  SingleObject;
    }

    /*方法*/
    public void print(){

        System.out.println("我是SinglePattern1的实例化对象");
    }

    public static void main(String[] args) {
        /*获取该类的实例化对象*/
        SinglePattern1 singlePattern1=SinglePattern1.getSingleObject();

       singlePattern1.print();
    }
}
