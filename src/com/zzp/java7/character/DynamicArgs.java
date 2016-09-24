package com.zzp.java7.character;

import java.util.Collection;
import java.util.HashMap;

/**
 * Desc
 * Created by zzp
 * on 2016/8/19.21:08
 */
public class DynamicArgs {

    public static <T> Collection<T> doSomething(T... entries) {

        return null;
    }


    public void dynamicArgs() {
        //1.不能创建特定泛型的数据;   只能创建原始类型的实例
        //HashMap<String, String>[] arrayHashMap = new HashMap<>[2];//不能创建特定泛型的数据
        HashMap<String, String>[] arrayHashMap = new HashMap[2];    //只能创建原始类型的实例


        //2.

        HashMap<String, String> h1 = new HashMap<>();
        HashMap<String, String> h2 = new HashMap<>();

        Collection<HashMap<String, String>> collection = doSomething(h1, h2);
    }


}
