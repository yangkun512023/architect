package com.agency.agency.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yk
 * @date 2019/5/28 14:22
 */
public class JdkProxy implements InvocationHandler {
    private Object target;
    public JdkProxy(Object target){
        this.target=target;
    }
    public <T> T getProxy(){
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始方法之前");
        Object result=method.invoke(target,args);
        System.out.println("方法之后");
        return result;
    }
}
