package com.demo.juc;

/**
 * @author jack.l
 * @date 2021/8/20 10:01 下午
 * Description
 */
public class VolatileEntity {

    //使用volatile修饰共享资源i
    //类变量
    final static int max = 5;
    int init_value = 0;
    public static int getMax() {
        return max;
    }
    public int getInit_value() {
        return init_value;
    }
    public void setInit_value(int init_value) {
        this.init_value = init_value;
    }
    private static class VolatileEntityHolder {
        private static  VolatileEntity instance = new VolatileEntity();
    }
    public static VolatileEntity getInstance() {
        return VolatileEntityHolder.instance;
    }
}
