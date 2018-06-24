package com.annotationdemo.demo;

import com.annotationdemo.demo.AnnotationConfig.Book;
import com.annotationdemo.demo.AnnotationConfig.MyAnnotationHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        MyAnnotationHandler.run(Book.class);
    }
}
