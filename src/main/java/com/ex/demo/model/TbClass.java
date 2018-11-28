package com.ex.demo.model;

import java.io.Serializable;

public class TbClass implements Serializable {
    private Long id;

    private String classPackage;

    private byte[] classFile;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassPackage() {
        return classPackage;
    }

    public void setClassPackage(String classPackage) {
        this.classPackage = classPackage == null ? null : classPackage.trim();
    }

    public byte[] getClassFile() {
        return classFile;
    }

    public void setClassFile(byte[] classFile) {
        this.classFile = classFile;
    }
}