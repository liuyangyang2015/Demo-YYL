package com.gupao.vip.michael;

import com.gupao.vip.michael.demo.User;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
//public class SayHelloImpl  implements ISayHello,Serializable
public class SayHelloImpl extends UnicastRemoteObject implements ISayHello
{

    public SayHelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        User  user = new User();
        user.setAge(10);
        return "Hello World ! I am "+name;
    }

    public static void main(String[] args) throws RemoteException
    {
        Remote a = new  SayHelloImpl();
        System.out.println(a.getClass()+"123");
    }

}
