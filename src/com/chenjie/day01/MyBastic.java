package com.chenjie.day01;

import com.sun.source.tree.TryTree;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MyBastic {
    public static void save(Object o){
        try(
                PrintStream p=new PrintStream(new FileOutputStream("AllInfo.txt",true));
                ) {
            Class c = o.getClass();
            p.println("========="+c.getSimpleName()+"=============");
            Field[] files = c.getDeclaredFields();
            for (Field file : files) {
                file.setAccessible(true);
                p.println(file.getName()+"====>"+file.get(o));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
