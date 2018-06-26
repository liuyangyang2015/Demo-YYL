package com.bright.util;

import lombok.*;
import lombok.extern.java.Log;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-26 17:23
 **/
@Data
@EqualsAndHashCode
@ToString
@Getter
@Setter
@Log
public class LombokDemo
{
    private String name;

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
}
