package com.chenje.day02;

public class Queue<Item> {
    private class Node{
        public Item item;
        public Node next;
    }
    private Node first;
    private Node last;
    private int size;

    public boolean isEmpty(){
        return first==null;
    }

    public int getSize(){
        return size;
    }

    public void push(Item item){
        Node oldlast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()) first=last;
        else          oldlast.next=last;
        size++;
    }

    public Item pop(){
       Item item=first.item;
       first=first.next;
       size--;
       if(isEmpty())
           last=null;
       return item;
    }
}
