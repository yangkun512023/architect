package com.example.design.create.protoType;

import java.util.Objects;

/**
 * @author yk
 * @date 2020/9/4 15:01
 */
//原型模式
public class ProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car=new Car();
        car.setAge(11);
        car.setName("car");
        Car clone=(Car) car.clone();
        clone.setName("clone");
        clone.setAge(12);

        car.setAge(15);
        System.out.println(clone.getAge());
        System.out.println(Objects.equals(car,clone));
    }



}
class  Car implements Cloneable{
    private  String name;
    private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
