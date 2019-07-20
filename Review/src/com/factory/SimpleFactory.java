package com.factory;


/*
* 简单工厂模式：
* 一个抽象产品，多个具体产品；
* 只有一个具体工厂，在这个工厂中来创建其他类的实例
* */


interface  Language{

    void say();
}

class Chinese implements  Language{


    @Override
    public void say() {
        System.out.println("我说中文");
    }
}
class Amercian implements  Language{


    @Override
    public void say() {
        System.out.println("我说English");
    }
}
/*
 * 工厂类，只有一个工厂类，在工厂类中创建实例对象
 * */
class NationFactory{

    Language language=null;
    public Language getObject(String type){

        if(type.equals("Chinese")){
            language=new Chinese();

        }
        if(type.equals("Amercian")){
            language=new Amercian();

        }

        return  language;
    }
}

public class SimpleFactory {


    public void sayLanguage(Language language){
        language.say();

    }

    public static void main(String[] args) {
        NationFactory nationFactory=new NationFactory();
        Language language1=nationFactory.getObject("Chinese");/*在工厂类中创建实例对象*/
        Language language2=nationFactory.getObject("Amercian");


        SimpleFactory client=new SimpleFactory();
        client.sayLanguage(language1);
        client.sayLanguage(language2);



    }
}
