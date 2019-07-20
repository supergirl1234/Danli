package com.factory;


/*
* 工厂模式：
* 一个抽象产品，多个具体产品；
* 一个抽象工厂，多个具体工厂
* 每一个类有一个工厂，在工厂中进行实例化对象
* */

interface  Computer{

    void print();
}

class MacComputer implements Computer{


    @Override
    public void print() {
        System.out.println("我是Mac Computer");
    }
}

class DellComputer implements Computer{


    @Override
    public void print() {
        System.out.println("我是Dell Computer");
    }
}

/*
*
* 工厂类接口
* */

interface IFactory{

    Computer createComputer();
}

/*
* 每一个类的工厂
* */
class MacFactory implements IFactory{


    @Override
    public Computer createComputer() {
        return new MacComputer();
    }
}

class DellFactory implements IFactory{


    @Override
    public Computer createComputer() {
        return new DellComputer();
    }
}


public class Factory {


    public void buyComputer(Computer computer){

        computer.print();
    }
    public static void main(String[] args) {
        Factory factory=new Factory();

        MacFactory macFactory=  new MacFactory();
       factory.buyComputer(macFactory.createComputer());

        DellFactory dellFactory=  new DellFactory();
        factory.buyComputer(dellFactory.createComputer());

    }

}
