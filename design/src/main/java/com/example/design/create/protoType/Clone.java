package com.example.design.create.protoType;

/**
 * @author yk
 * @date 2020/9/4 15:20
 */
//浅clone  引用类型指向同一地址，修改了之前的 对clone对象有影响
class Mark{
    private int chinese;
    private int math;
    public Mark(int chinese, int math) {
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
        return "Mark{" +
                "chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
public class Clone implements Cloneable{
    private String name;
    private int age;
    private Mark mark;

    public Clone(String name, int age,Mark mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Mark mark = new Mark(100,99);
        Clone user = new Clone("user",22,mark);
        Clone userClone = (Clone) user.clone();
        System.out.println("原user："+user);
        System.out.println("克隆的user："+userClone);
        //修改引用类型的mark属性
        user.mark.setMath(60);
        user.setAge(11);
        System.out.println("修改后的原user："+user);
        System.out.println("修改后的克隆user："+userClone);
    }
}
