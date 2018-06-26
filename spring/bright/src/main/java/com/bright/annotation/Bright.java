package com.bright.annotation;

import java.lang.annotation.*;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-28 16:53
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bright
{
    String value() default "bright";
    String name()  default "demo";
}
