package com.chenje.day02;

public class stackArray1<Item> {
    private  class Node{
        public Item item;
        public  Node next;

        public Node(){
            this.item=null;
            this.next=null;
        }
    }
    private Node first;//栈顶指针
    private int size;//元素数量

    public stackArray1(){
        size=0;
        first=new Node();
    }

    public boolean isEmpty(){
        return size>0;
    }

    public int getSize(){
        return size;
    }

    public void push(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        size++;
    }

    public  Item pop(){
        Item item=first.item;
        Node oldfirst= first.next;
        first.next=null;
        first=oldfirst;
        size--;

        return item;
    }
}
