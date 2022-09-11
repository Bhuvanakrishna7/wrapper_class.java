package com.bhuvan;


class MyInteger{
    private int x;

    MyInteger(int y){
        x=y;
    }
    //public API
    public int intvalue(){
        return x;
    }
}
public class WrapperClass {
    public static void main(String[] args) {
        int i=100;

        //Predifined wrapper class
        Integer y= new Integer(i);
        System.out.println(y.intValue());

        //Custom wrapper class
        MyInteger myInteger=new MyInteger(i);
        System.out.println(myInteger.intvalue());

    }
}
