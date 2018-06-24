package com.annotationdemo.demo.AnnotationConfig;

public class Book {
    @MyDoc(name = "文件注解", author = "Eric", desc = "java自定义注解")
    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
