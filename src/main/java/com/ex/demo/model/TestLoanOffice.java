package com.ex.demo.model;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * s
 *
 * @author yangjianyan
 * @version 1.0.0
 * @date 2018/11/28
 */
public class TestLoanOffice {
    public static void main(String[] args) throws Exception {

//        Class<?> word = Class.forName("com.ex.demo.model.Word");
//        Object obj = word.newInstance();
//        ((Word)obj).say();

        URL url=new URL("file:/Users/yang/classes/");
        String name="Word";
        ClassLoader cl=new URLClassLoader(new URL[]{url});
        Class className=cl.loadClass(name);
        Object action = Class.forName("Word").newInstance();
        Method method=action.getClass().getMethod("say");
        method.invoke(action);
    }
}
