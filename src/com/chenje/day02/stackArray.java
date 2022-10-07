package com.chenje.day02;

import java.util.Iterator;

public class stackArray<Item> implements Iterable<Item>{
    private Item[] array;
    private  int size;

    public  stackArray(){
        array=(Item[]) new Object[1];
        size=0;
    }

    public stackArray(int num){
        array=(Item[]) new Object[num];
        this.size=0;
    }

    public Item[] getArray() {
        return array;
    }

    public void setArray(Item[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int num) {
        this.size = num;
    }

    private void resize(int lengh){
        Item[] items=(Item[]) new Object[lengh];
        for (int i = 0; i <size ; i++) {
            items[i]=array[i];
        }
        array=items;
    }

    public void push(Item item){
        if(size==array.length)
            resize(2*array.length);
        array[size++]=item;
    }

    public Item pop(){
        Item i=array[--size];
        array[size]=null;
        if(size>0&&size==array.length/4)
            resize(array.length/2);
        return i;
    }

    public Iterator<Item> iterator(){

        return new ReverseArrayIterator();
    }

    private  class ReverseArrayIterator implements  Iterator<Item>{
        private int N=size;
        @Override
        public boolean hasNext() {
            return N>0;
        }
        @Override
        public Item next() {
            return array[--size];
        }

        @Override
        public void remove() {

        }
    }
}
