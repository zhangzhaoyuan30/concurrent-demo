package com.zzy.concurrentdemo.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/10
 * @description:
 */
public class HashMapTest {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            hashMap.put("c", 3);
        }

        /*for (Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator(); iterator.hasNext(); ) {
            iterator.next();
            iterator.remove();
        }
*/
        System.out.println(hashMap);
        new Thread();
    }
}
