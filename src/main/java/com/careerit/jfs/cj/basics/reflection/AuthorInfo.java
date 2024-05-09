package com.careerit.jfs.cj.basics.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorInfo {

    String name() default "SystemUser";
    String email() default "info@sys.com";
}
