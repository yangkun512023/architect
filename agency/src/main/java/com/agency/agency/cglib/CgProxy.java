package com.agency.agency.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yk
 * @date 2019/5/30 17:01
 */
public class CgProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法开始之前");
        methodProxy.invokeSuper(object,objects);
        System.out.println("方法开始之后");
        return object;
    }
}
