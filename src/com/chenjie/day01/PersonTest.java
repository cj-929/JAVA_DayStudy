package com.chenjie.day01;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testchu(){
        Person p=new Person();
        String str=p.chu("admin","123456");
        Assert.assertEquals("有错误","OK",str);
    }
}
