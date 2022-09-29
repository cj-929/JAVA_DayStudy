package com.chenjie.day01;

public class Person {
    private  String name;
    private  String age;

    public String chu(String str1,String str2){
        if("admin".equals(str1)&& "123456".equals(str2)){
            return "OK";
        }
        return "error";
    }
}
