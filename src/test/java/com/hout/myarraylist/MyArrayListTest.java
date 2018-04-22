package com.hout.myarraylist;


import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Random;

public class MyArrayListTest {

    @Test
    public void test() {
        MyArrayList<Integer> list = new MyArrayList<>();
        new Random(1).ints(10).forEach(list::add);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
