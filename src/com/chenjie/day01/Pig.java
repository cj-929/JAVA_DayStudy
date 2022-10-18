package com.chenjie.day01;

public class Pig {
    private  String name;
    private  String age;
    private  String color;
    public   String sex;
    public  static  final String home="山西";

    private Pig(){

    }

    public Pig(String name,String age,String color,String sex){
        this.name=name;
        this.color=color;
        this.age=age;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
