package com.example.design.structure;

import com.sun.prism.impl.ps.CachingShapeRep;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author yk
 * @date 2020/9/24 16:20
 */
public class PersonHelper {
    private static final  Map<String,Person> cash=new HashMap();
    static {
        cash.put(KeyEnum.xiaoming.name(),new XiaoMing());
        cash.put(KeyEnum.lisi.name(),new LiSi());
    }

    public static Person getPerson(String key){
        return Objects.isNull(cash.get(key))?new XiaoMing():cash.get(key);
    }
}
