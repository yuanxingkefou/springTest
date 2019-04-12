package com.mq.base_XML.beanPropertyInsert.setter;

public class Person {
    private String name;
    private Address homeAddr;
    private Address comAddr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(Address homeAddr) {
        this.homeAddr = homeAddr;
    }

    public Address getComAddr() {
        return comAddr;
    }

    public void setComAddr(Address comAddr) {
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
