package com.liyefei.demo.hashcode;

import lombok.Data;

/*
 * @Author liyefei
 * @Description
 * @Since 2020/6/1 22:06
 **/
//@Data
public class EqualExample {

    private String name;
    private int age;
    private String addr;

    public EqualExample(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        EqualExample that = (EqualExample) obj;

        if (this.name != that.name) {
            return false;
        }
        if (this.age != that.age) {
            return false;
        }
        return this.addr == that.addr;
    }

    @Override
    public int hashCode() {
        String str = name;
        str += age;
        str += addr;

        char[] chars = str.toCharArray();
        int hash = 0;
        for (char aChar : chars) {
            hash = hash * 131 + aChar;
        }

        System.out.println(name + "的hash:" + hash);

        return hash;

    }
}
