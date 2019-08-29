package com.agency.agency.proxy.jdk;

/**
 * @author yk
 * @date 2019/5/29 10:41
 */
public class Test {
    public static void main(String[] args) {
        Person person=new JdkProxy(new xiaoMing()).getProxy();
        person.talking();
    }
}
