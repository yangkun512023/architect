package com.example.design.create.protoType;

import java.io.*;

/**
 * @author yk
 * @date 2020/9/4 15:33
 */
//深clone  序列化方式
class Mark2 implements Serializable {
    private int chinese;
    private int math;
    public Mark2(int chinese, int math) {
        this.chinese = chinese;
        this.math = math;
    }
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }
    public void setMath(int math) {
        this.math = math;
    }
    @Override
    public String toString() {
        return "Mark2{" +
                "chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
public class DeepClone implements Serializable{
    private String name;
    private int age;
    private Mark2 mark;

    public DeepClone(String name, int age,Mark2 mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Mark2 mark = new Mark2(100,99);
        DeepClone user = new DeepClone("user",22,mark);

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(user);//序列化
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        DeepClone userClone = (DeepClone) oi.readObject();//反序列化

        System.out.println("原user："+user);
        System.out.println("克隆的user："+userClone);
        user.mark.setMath(59);
        System.out.println("修改后的原user："+user);
        System.out.println("修改后的克隆user："+userClone);
    }
}
