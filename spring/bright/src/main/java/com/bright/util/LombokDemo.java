package com.bright.util;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.*;
import lombok.extern.java.Log;
import org.springframework.beans.factory.InitializingBean;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-26 17:23
 **/
//@Data
//@EqualsAndHashCode
//@ToString
//@Getter
//@Setter
@Log
public class LombokDemo extends OrderDemo implements InitializingBean
{
    public static String flag= "this is lombok demo , it is a test class";// static field   33333333333333333333

    static {
        System.out.println("44444444444444444444444444444444444");
        System.out.println("it is executing STATIC {} CODE ！");
    }
    private String name="LombokDemo";//8888888888888888888888888

    {
        System.out.println(" 99999999999999999999999999");
        System.out.println(" exeting children {} code !");
    }

    public LombokDemo()
    {
        System.out.println("1000000000000000000000000");
        System.out.println("this is LombokDemo constructor!");
    }
    @Override
    public void afterPropertiesSet() throws Exception
    {

        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(this.name+"=======");
        this.name = "1111";
        System.out.println(this.name+"=======");
    }

    /**
     *  @Data注解的作用相当于 @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode的合集。
     *  另外@Log 省去了在LombokTest中添加 getLogger的如下代码：
     *  private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
     * @param args
     */
    public static void main(String[] args)
    {
        log.info("hi,lombok");
    }

    public static String getFlag()
    {
        return flag;
    }

    public static void setFlag(String flag)
    {
        LombokDemo.flag = flag;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        System.out.println(name);
        this.name = name;
        System.out.println(name);
    }
}
