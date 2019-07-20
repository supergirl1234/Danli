package com;


/*优先级:静态代码块>非静态代码块（构造块）>构造方法，*/

/*静态代码块只执行一次，但是只要创建一个对象，构造块和构造方法就要执行一次*/
/*构造块和构造方法是创建对象时同时调用的*/

/*如果有父类，则父类优先于子类，同样静态代码块只执行一次，但是只要创建一个对象，父类和子类的构造块和构造方法就要执行一次*/
class Person{
    static { //定义在非主类中的静态块
        System.out.println("3.Person类的静态块");
    }

    { //定义在类中，不加任何修饰符，构造块
        System.out.println("1.Person类的构造块");
    }
    public Person(){
        System.out.println("2.Person类的构造方法");
    }

}

public class Review1 extends Person {


    static { //定义在非主类中的静态块
        System.out.println("3.Review1类的静态块");
    }

    { //定义在类中，不加任何修饰符，构造块
        System.out.println("1.Review1类的构造块");
    }
    public Review1(){
        System.out.println("2.Review1类的构造方法");
    }
    public static void main(String[] args) {

        new Review1();
        new Review1();

    }
}
