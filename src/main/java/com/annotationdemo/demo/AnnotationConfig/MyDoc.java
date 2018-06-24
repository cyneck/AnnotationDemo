package com.annotationdemo.demo.AnnotationConfig;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Calendar;
import java.util.Date;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface MyDoc {
    String name() default "MyDoc";

    String author() default "author";

    String desc() default "";
}
