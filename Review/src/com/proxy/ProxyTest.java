package com.proxy;


/*
* 代理模式:两个子类共同实现一个接口，其中一个子类负责真实业务实现，另外一个子类完成辅助真实业务主题的操作。
* */

/*一个接口*/
interface ISubject{

    void shop();
}

/*真正的业务实现*/
class RealSubject implements ISubject{
    @Override
    public void shop() {
        System.out.println("买衣服");
    }
}


/*代理类负责辅助完成真实业务，在代理类中可能还会完成除真实业务以外的事情*/
class ProxySubject implements ISubject{

    public  ISubject iSubject;/*真正的业务对象*/

    public ProxySubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }


    public void BeforeShop(){

        System.out.println("先吃饭");
    }
    public void AfterShop(){

        System.out.println("坐车回家");
    }
    @Override
    public void shop() {
        BeforeShop();
        iSubject.shop();//真正的业务
        AfterShop();
    }
}
public class ProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        ProxySubject proxySubject=new ProxySubject(realSubject);
        proxySubject.shop();
    }
}
