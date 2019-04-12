package com.zzy.concurrentdemo.clone;

import lombok.Data;
import lombok.ToString;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/08
 * @description:
 */
@Data
@ToString
class Book implements Cloneable {
    Book(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    private String name;
    private Person owner;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        Person newOwner = (Person) this.owner.clone();
        clone.setOwner(newOwner);
        return clone;
    }
}
