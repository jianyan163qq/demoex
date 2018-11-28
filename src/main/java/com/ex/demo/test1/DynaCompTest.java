package com.ex.demo.test1;

import sun.misc.IOUtils;

import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DynaCompTest
{
    public static void main(String[] args) throws Exception {
        String fullName = "com.ex.demo.test1.MyClass";
        File file = new File("/Users/yang/javas/MyClass.java");
        if(!file.exists()){
            return;
        }
        InputStream in = new FileInputStream(file);
        byte[] bytes = IOUtils.readFully(in, -1, false);
        String src = new String(bytes);
        in.close();
 
        System.out.println(src);
        DynamicEngine de = DynamicEngine.getInstance();
        Object instance = de.javaCodeToObject(fullName,src);
//        ((MyClass)instance).say("lucy");

        Method[] fields = instance.getClass().getDeclaredMethods();
        for (Method field : fields) {
            Object value = field.invoke(instance, "lucy");
            System.out.println(value);
        }

        System.out.println(instance);
    }
}