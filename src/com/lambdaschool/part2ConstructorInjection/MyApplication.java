package com.lambdaschool.part2ConstructorInjection;

public class MyApplication
{
    private MessageService msgSrv;

    public MyApplication(MessageService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    public void send(String msg, String receiveAddress)
    {
        msg = msg + "\n*** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(msg, receiveAddress);
    }
}
