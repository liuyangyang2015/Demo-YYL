package com.bright.server;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-08 16:54
 **/
public class Test
{
    private static int count()
    {
        System.out.println("add");
        return 10;
    }

    private static int test()
    {
        try
        {
            int a = 3 + 4;
//            return count();
        } catch (Exception e)
        {
        } finally
        {
            System.out.println("hi");
        }
        int b=10/0;
        return 11;
    }

    public static void main(String[] args) throws InterruptedException
    {
        test();
        System.out.println("hihi");
        Thread.sleep(1000000);
    }

    public void method1() throws CException
    {
        throw new CException("Test Exception");
    }

    public void method2(String msg) {
        if (msg == null) {
            throw new NullPointerException("Message is null");
        }
    }

    public void method3() throws CException
    {
        method1();
    }
}
class CException extends Exception {
    public CException() {
    }

    public CException(String message) {
        super(message);
    }
}