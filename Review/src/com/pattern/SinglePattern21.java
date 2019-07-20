package com.pattern;


/*
* 懒汉式单例：什么时候用，什么时候创建实例化对象
* */
public class SinglePattern21 {

    /*不在最初始创建实例化对象，什么时候用就什么时候 创建实例化对象*/
    static SinglePattern21 singlePattern21=null;


    /*单例模式的构造方法是私有的*/
    private SinglePattern21(){


    }


    public static SinglePattern21 getSinglePattern21(){

        /*在使用实例化对象时，准备要创建实例化对象，要先查看是否已经创建了实例化对象；如果没有创建实例化对象，就创建实例化对象；如果已经创建了实例化对象，就不再创建了，直接使用已经创建的实例化对象*/

          if(singlePattern21==null){

              /*双重检查：既保证了线程安全，又保证了实例化代码只执行一次*/
              synchronized (SinglePattern2.class) {
                  if(singlePattern21==null) {
                      singlePattern21 = new SinglePattern21();
                  }
              }
          }

        return singlePattern21  ;
    }

    public void print(){

        System.out.println("我是SinglePattern21的实例化对象");
    }

    public static void main(String[] args) {

        SinglePattern21 singlePattern21=SinglePattern21.getSinglePattern21();
        singlePattern21.print();
    }
}
