package com.example.juc.lock;

import java.util.Objects;

/**
 * @author yk
 * @date 2020/7/28 14:13
 */
public class Sington {
    private static volatile Sington sington;

    private Sington() {
    }
    public static Sington getSington(){
        if(Objects.isNull(sington)){
            synchronized (Sington.class){
                if(Objects.isNull(sington)){
                    sington=new Sington();
                }
            }
        }
        return sington;
    }
}
