package com.lambdaschool.part1TightlyCoupled;

public class Main
{
    public static void main(String[] args)
    {
        MyApplication messaging = new MyApplication();
        messaging.send( msg: "Hello", receiveAddress: "cammac725");
    }

}
