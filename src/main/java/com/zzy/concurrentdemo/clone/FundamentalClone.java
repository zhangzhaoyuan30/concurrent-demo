package com.zzy.concurrentdemo.clone;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/08
 * @description:
 */
public class FundamentalClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(10);
        Person p2 = (Person) p1.clone();
        p1.setAge(12);
        System.out.println(p2);
    }
}

