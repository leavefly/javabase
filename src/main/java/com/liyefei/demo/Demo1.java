package com.liyefei.demo;

/*
 * @Author liyefei
 * @Description
 * @Since 2020/6/1 18:04
 **/
public class Demo1 {

    public static void main(String[] args) {

        System.out.println(Integer.valueOf("10",10));


        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println("s1 == s2  " + (s1 == s2));  //false

        String s3 = s1.intern();
        String s4 = s1.intern();
        System.out.println("s1 == s3  " + (s1 == s3));  //false
        System.out.println("s3 == s4  " + (s3 == s4));  //true

        s1 = "bbb";
        System.out.println("s3 = " + s3);


    }
}
