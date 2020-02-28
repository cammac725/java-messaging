package com.lambdaschool.part3InterfaceInjection;

public class LambdaMessagingImpl implements MessageService
{
    @Override
    public void sendMessage(String message, String address) {
        System.out.println("For " + address + ": " + message);
    }

    @Override
    public String readMessage() {
        return "Not Implemented";
    }
}
