package com.mq.base_XML.beanPropertyInsert.constructor;

public class Person {
    private String name;
    private Address homeAddr;
    private Address comAddr;

    public Person(String name, Address homeAddr, Address comAddr) {
        this.name = name;
        this.homeAddr = homeAddr;
        this.comAddr = comAddr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", homeAddr=" + homeAddr +
                ", comAddr=" + comAddr +
                '}';
    }
}
