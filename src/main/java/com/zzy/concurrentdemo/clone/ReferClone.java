package com.zzy.concurrentdemo.clone;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/08
 * @description:
 */
public class ReferClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(10);
        Book book = new Book("abc", person);

        Book bookClone = (Book) book.clone();
        book.setName("cba");
        book.getOwner().setAge(12);

        System.out.println("book:" + book);
        System.out.println("bookClone:" + bookClone);
    }
}
