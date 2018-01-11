package com.archetype.pojo;

public class Student {
    private Long id;

    private Long sAge;

    private String sName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getsAge() {
        return sAge;
    }

    public void setsAge(Long sAge) {
        this.sAge = sAge;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }
}