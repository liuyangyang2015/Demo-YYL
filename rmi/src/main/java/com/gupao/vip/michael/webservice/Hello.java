package com.gupao.vip.michael.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-05 14:28
 **/
@WebService
public class Hello
{

        public String sayHello(String name){
            return "hello " + name;
        }
        public static void main(String[] args) {
            //服务的地址
            String address = "http://localhost:8080/hello";
            Hello implementor = new Hello();
            //发布服务，第一个参数是服务的地址，第二个参数是发布出去服务的方法
            Endpoint.publish(address, implementor);
        }
}
