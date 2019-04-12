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
class Person implements Cloneable {
    Person(int age) {
        this.age = age;
    }

    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
