package com.pattern;


/*
* 懒汉式单例：什么时候用，什么时候创建实例化对象
* */
public class SinglePattern22 {

    /*单例模式的构造方法是私有的*/
    private SinglePattern22(){

    }


    /*静态内部类，在外部主类SinglePattern22被装载时不会立即实例化，
    在需要实例化时调用getSinglePattern22方法，才会装载SingleObject类，从而完成SinglePattern22 的实例化*/

    //类的静态属性只会在第一次加载类的时候初始化，保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
    private static class SingleObject{

        private static final SinglePattern22 singlePattern=new SinglePattern22();
    }


    public static SinglePattern22 getSinglePattern22(){

              return SingleObject.singlePattern;
    }

    public void print(){

        System.out.println("我是SinglePattern22的实例化对象");
    }

    public static void main(String[] args) {

        SinglePattern22 singlePattern22=SinglePattern22.getSinglePattern22();
        singlePattern22.print();
    }
}
