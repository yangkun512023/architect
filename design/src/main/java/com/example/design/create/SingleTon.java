package com.example.design.create;

/**
 * @author yk
 * @date 2020/9/4 13:57
 */
//单例模式
public class SingleTon {
    private volatile static    SingleTon singleTon;
    private SingleTon() {
    }
    public static SingleTon getSingleTon(){
        if(singleTon==null){
            synchronized (SingleTon.class){
                if(singleTon==null){
                    singleTon=new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
