package com.ex.demo.model;

/**
 * Word
 *
 * @author yangjianyan
 * @version 1.0.0
 * @date 2018/11/28
 */
public class Word implements Office{

    @Override
    public void say() {
        System.out.println("word");
    }
}
