package com.annotationdemo.demo.AnnotationConfig;

import java.lang.reflect.Field;

public class MyAnnotationHandler {
    public static void run(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyDoc.class)) {
                MyDoc myDoc = (MyDoc) field.getAnnotation(MyDoc.class);
                String strMyDoc = String.format("文档名：%s\n文档作者：%s\n文档描述：%s\n", myDoc.name(), myDoc.author(), myDoc.desc());
                System.out.println(strMyDoc);
            }
        }

    }
}
