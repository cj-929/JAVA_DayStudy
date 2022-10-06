package com.chenjie.day01;


import java.util.Scanner;
import java.util.Stack;

public class classAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(operator( sc.nextLine()));
    }

    public static int operator(String str){
        Stack<Integer> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<str.length();i++){
            String s=Character.toString(str.charAt(i));
            if(s.equals("("))
                continue;
            if(s.matches("\\d")){
                stack1.push(Integer.valueOf(s));
            }else if(s.matches("[*+/-]")){
                stack2.push(s.charAt(0));
            }else if(s.equals(")")){
                char c=stack2.pop();
                int a=stack1.pop();
                int b=stack1.pop();
                switch(c){
                    case '+':stack1.push(a+b);break;
                    case '-':stack1.push(a-b);break;
                    case '*':stack1.push(a*b);break;
                    case '/':stack1.push(a/b);break;
                }
            }
        }
        return stack1.pop();
    }
}
