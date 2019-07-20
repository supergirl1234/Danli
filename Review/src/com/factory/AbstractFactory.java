package com.factory;


/*
 * 抽象工厂模式:提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *
 *
 *抽象工厂类 - 声明(一组)返回抽象产品的方法
 *具体工厂类 - 生成(一组)具体产品
 * */

import javax.swing.tree.TreeNode;

/*
* 多个抽象产品类
* */
interface Tree{

    void printTree();
}
interface Flower{

    void printFlower();
}

/*
*
* 多个具体产品
* */
class AppleTree implements Tree{


    @Override
    public void printTree() {
        System.out.println("我是苹果树");
    }
}

class OrangeTree implements Tree{


    @Override
    public void printTree() {
        System.out.println("我是橘子树");
    }
}

class rose implements Flower{


    @Override
    public void printFlower() {
        System.out.println("我是玫瑰花");
    }
}

class sunFlower implements Flower{

    @Override
    public void printFlower() {
        System.out.println("我是太阳花");
    }
}

/*
抽象工厂类 - 声明(一组)返回抽象产品的方法
*/

interface IIFactory{
    Tree createTree();
    Flower createFlower();

}

/*
* 具体工厂类：生成一组具体产品
* */
class SFactory implements IIFactory{


    @Override
    public Tree createTree() {
        return new AppleTree();
    }

    @Override
    public Flower createFlower() {
        return new rose();
    }
}

class MFactory implements IIFactory{


    @Override
    public Tree createTree() {
        return new OrangeTree();
    }

    @Override
    public Flower createFlower() {
        return new sunFlower();
    }
}
public class AbstractFactory {

    public void buyTree(Tree tree){

        tree.printTree();
    }
    public  void buyFlower(Flower flower){
        flower.printFlower();

    }

    public static void main(String[] args) {
        AbstractFactory client=new AbstractFactory();

        SFactory sFactory=new SFactory();
        client.buyTree(sFactory.createTree());
        client.buyFlower(sFactory.createFlower());

        System.out.println("********************");

        MFactory mFactory=new MFactory();
        client.buyTree(mFactory.createTree());
        client.buyFlower(mFactory.createFlower());



    }


}
