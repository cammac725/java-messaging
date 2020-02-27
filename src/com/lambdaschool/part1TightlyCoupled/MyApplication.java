package com.lambdaschool.part1TightlyCoupled;

public class MyApplication
{
    private MessageService msgSrv = new MessageService();

    public void send(String msg, String receiveAddress)
    {
        msg = msg + "\n*** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(msg, receiveAddress);
    }
}
