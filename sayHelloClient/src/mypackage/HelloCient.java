package mypackage;


import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.rmi.activation.Activator;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-05 15:39
 **/
public class HelloCient
{
    public static void main(String[] args) throws ServiceException, RemoteException
    {
        HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
        HelloWorld_PortType service = locator.getHelloWorld();
        System.out.println(service.sayHelloWorldFrom("sdsa"));
    }
}
