package com.chenje.day02;

import java.util.Scanner;

public class stackmain {
    public static void main(String[] args) {
        Queue<String> stackArray=new Queue<>();
        Scanner sc=new Scanner(System.in);
        String[] str= sc.nextLine().split(" ");
        int i=0;
        while (i<str.length){
            if(!str[i].equals("-")){
                stackArray.push(str[i]);
            }else if(str[i].equals("-")){
                String m=stackArray.pop();
                System.out.print(m+" ");
            }
            i++;
        }
        System.out.println("栈中还剩"+stackArray.getSize()+"个数据");
     }
}
