package com.zhs.aspect.annotation;

import java.lang.annotation.*;

/**
 * @author: 张浩晟
 * @Date: 2021/11/1 13:25
 * Describe:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PermissionCheck {

    String value();

}
