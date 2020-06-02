package com.liyefei.demo.hashcode;

import java.util.HashSet;

/*
 * @Author liyefei
 * @Description
 * @Since 2020/6/1 22:17
 **/
public class EqualExampleApp {

    public static void main(String[] args) {
        EqualExample e1 = new EqualExample("liyefei", 29, "河南省商丘市");
        EqualExample e2 = new EqualExample("liyefei", 29, "河南省商丘市");

        System.out.println(e1.equals(e2));

        HashSet<EqualExample> set = new HashSet<EqualExample>(2);
        set.add(e1);
        set.add(e2);

        System.out.println(set.size());
    }

}
