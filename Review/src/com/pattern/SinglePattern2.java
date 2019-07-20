package com.pattern;


/*
* 懒汉式单例：什么时候用，什么时候创建实例化对象
* */
public class SinglePattern2 {

    /*不在最初始创建实例化对象，什么时候用就什么时候 创建实例化对象*/
    static SinglePattern2 singlePattern2=null;


    /*单例模式的构造方法是私有的*/
    private SinglePattern2(){


    }

    /*达到了延时加载的目的，但是该方法线程不安全，只能在单线程下用*/
    public static SinglePattern2 getSinglePattern2(){

        /*在使用实例化对象时，准备要创建实例化对象，要先查看是否已经创建了实例化对象；如果没有创建实例化对象，就创建实例化对象；如果已经创建了实例化对象，就不再创建了，直接使用已经创建的实例化对象*/

          if(singlePattern2==null){

              singlePattern2=new SinglePattern2();
          }

        return singlePattern2  ;
    }

    public void print(){

        System.out.println("我是SinglePattern2的实例化对象");
    }

    public static void main(String[] args) {

        SinglePattern2 singlePattern2=SinglePattern2.getSinglePattern2();
        singlePattern2.print();
    }
}
