package com.zzy.concurrentdemo.clone;

import com.google.common.collect.Lists;
import com.zzy.concurrentdemo.common.My;

import javax.annotation.concurrent.ThreadSafe;
import java.util.*;

public class CollectionAndClone {


    public static void main(String[] args) {
        testList();
    }

    public void testCollection() {
        //List<Integer> list = Arrays.asList(1, 2, 3);//不要用这种方式，这种方式生成的是视图
        List<Integer> list = Lists.newArrayList(1, 2, 3);

        HashMap<String, List<Integer>> hashMap1 = new HashMap<>();
        hashMap1.put("aaa", list);

        HashMap<String, List<Integer>> hashMap2 = new HashMap<>(hashMap1);//浅拷贝
        Map<String, List<Integer>> view = Collections.unmodifiableMap(hashMap1);//生成视图

        hashMap1.put("bbb", Arrays.asList(3, 2, 1));

        list.add(4);

        System.out.println(hashMap2);
        System.out.println(view);
    }


    public void test2() {
        HashMap<String, My> hashMap1 = new HashMap<>();
        My my = new My(1);
        hashMap1.put("aa", my);

        HashMap<String, My> hashMap2 = new HashMap<>(hashMap1);

        my.setX(2);

        System.out.println(hashMap1);
        System.out.println(hashMap2);

        my = new My(3);

        System.out.println(hashMap1);
        System.out.println(hashMap2);

        hashMap1.put("aa", new My(4));

        System.out.println(hashMap1);
        System.out.println(hashMap2);


    }


    public void testArraysCopy() {

        My my1 = new My(1);
        My my2 = new My(2);

        My[] myarr = new My[]{my1, my2};
        My[] copy = Arrays.copyOf(myarr, 2);

        my2.setX(3);

        System.out.println(Arrays.toString(myarr));
        System.out.println(Arrays.toString(copy));
    }


    public static void testList() {
        My my1 = new My(1);
        ArrayList<My> list = Lists.newArrayList();
        list.add(my1);

        ArrayList<My> listClone = Lists.newArrayList(list);

        listClone.get(0).setX(2);

        System.out.println(list);
        System.out.println(listClone);



    }


}


